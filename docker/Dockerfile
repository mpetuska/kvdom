FROM gradle:6.0.1-jdk8

RUN mkdir -p kotlin-install/src/wasm32Main/kotlin
ADD build.gradle.kts kotlin-install
RUN echo 'val x = 1' > kotlin-install/src/wasm32Main/kotlin/index.kt
RUN gradle -p kotlin-install build
RUN rm -rf kotlin-install
RUN ls -la
ENV KOTLIN_NATIVE_HOME="/root/.konan/kotlin-native-linux-1.3.60"
ENV PATH="$KOTLIN_NATIVE_HOME/bin:$PATH"