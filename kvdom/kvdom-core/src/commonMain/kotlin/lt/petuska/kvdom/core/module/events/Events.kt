package lt.petuska.kvdom.core.module.events

import lt.petuska.kvdom.core.VBuilderDSL
import lt.petuska.kvdom.core.domain.VBuilder
import lt.petuska.kvdom.core.domain.VElement
import lt.petuska.kvdom.core.module.Module
import lt.petuska.kvdom.core.module.ModuleData
import lt.petuska.kvdom.dom.Element
import lt.petuska.kvdom.dom.EventHandler
import lt.petuska.kvdom.dom.deleteEventListener
import lt.petuska.kvdom.dom.setEventListener
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.set

public class EventData internal constructor() : ModuleData, MutableMap<String, EventData.HandlerWrapper> by mutableMapOf() {
  public data class HandlerWrapper(val wrapperFn: EventHandler, val handlers: MutableList<EventHandler>)

  public fun createEntry(handler: EventHandler? = null): HandlerWrapper = run {
    val handlers = mutableListOf<EventHandler>()
    handler?.let { handlers.add(handler) }
    val wrapper: EventHandler = { ev ->
      handlers.forEach {
        it(ev)
      }
    }
    HandlerWrapper(wrapper, handlers)
  }

  override fun copy(): EventData = EventData().also { it.putAll(this) }
}

public object Events : Module<EventData> {
  override val defaultModuleData: () -> EventData? = { EventData() }
  override val create: VElement<*>.(ref: Element) -> Unit = {
    updateEventListeners(
      null,
      getModuleData(
        id,
        defaultModuleData()
      )
    )
  }
  override val update: VElement<*>.(oldVNode: VElement<*>, moduleData: EventData?) -> Unit = { old, md ->
    updateEventListeners(old, md)
  }
  override val destroy: VElement<*>.(moduleData: EventData?) -> Unit = { md ->
    updateEventListeners(null, md)
  }

  private fun VElement<*>.updateEventListeners(oldVNode: VElement<*>?, moduleData: EventData?) {
    val oldEvents = oldVNode?.getModuleData<EventData>(id)?.copy() ?: defaultModuleData()!!
    val newEvents = moduleData!!

    val elm = ref!!
    for ((ev, newHandlers) in newEvents) {
      val oldHandlers = oldEvents[ev]
      if (oldHandlers == null) {
        elm.setEventListener(ev, newHandlers.wrapperFn)
      } else {
        oldHandlers.handlers.clear()
        oldHandlers.handlers.addAll(newHandlers.handlers)
        newEvents[ev] = oldHandlers
      }

      oldEvents.remove(ev)
    }
    oldEvents.forEach { (ev, handler) ->
      elm.deleteEventListener(ev, handler.wrapperFn)
    }
  }

  override fun toString(): String = id
}

@VBuilderDSL
public fun VBuilder<*>.on(event: String, handler: EventHandler) {
  val md = getModuleData(
    Events.id,
    Events.defaultModuleData()
  )!!
  val container = md[event] ?: md.createEntry()
  container.handlers.add(handler)
  md[event] = container
}
