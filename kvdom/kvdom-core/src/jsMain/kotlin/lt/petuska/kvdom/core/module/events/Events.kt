package lt.petuska.kvdom.core.module.events

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.set

typealias EventHandler = (Event) -> Unit

class EventData internal constructor(
  internal val eventHandlers: MutableMap<String, EventHandler> = mutableMapOf(),
) : ModuleData {
  override fun copy(): EventData =
    EventData(HashMap(eventHandlers))
}

object Events :
  Module<EventData> {
  override val defaultModuleData: () -> EventData? = { EventData() }
  override val create: VElement<*>.(ref: Element) -> Unit = {
    updateEventListeners(null, getModuleData(id,
      defaultModuleData()))
  }
  override val update: VElement<*>.(oldVNode: VElement<*>, moduleData: EventData?) -> Unit = { old, md ->
    updateEventListeners(old, md)
  }
  override val destroy: VElement<*>.(moduleData: EventData?) -> Unit = { md ->
    updateEventListeners(null, md)
  }
  
  private fun VElement<*>.updateEventListeners(oldVNode: VElement<*>?, moduleData: EventData?) {
    val oldEvents = HashMap((oldVNode?.getModuleData<EventData>(id)?.eventHandlers) ?: mutableMapOf())
    val newEvents = moduleData!!.eventHandlers
    
    val elm = ref!!
    newEvents.forEach { (ev, handler) ->
      fun EventHandler?.body(): String? = this?.let { toString().substringAfter("{") }
      val oldHandler = oldEvents[ev]
      if (oldHandler.body() != handler.body()) {
        elm.removeEventListener(ev, oldHandler)
        elm.addEventListener(ev, handler)
      } else {
        oldHandler?.let {
          newEvents[ev] = it
        }
      }
      oldEvents.remove(ev)
    }
    oldEvents.forEach { (ev, handler) ->
      elm.removeEventListener(ev, handler)
    }
  }
  
  override fun toString(): String = id
}

@VBuilderDSL
fun VBuilder.on(event: String, handler: EventHandler) {
  val md = getModuleData(Events.id,
    Events.defaultModuleData())!!
  md.eventHandlers[event] = handler
}
