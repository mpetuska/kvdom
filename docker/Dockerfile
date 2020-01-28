FROM gradle:6.0.1-jdk8

RUN mkdir 'kotlin-install'
ADD build.gradle.kts kotlin-install
RUN gradle -p kotlin-install check
RUN rm -rf 'kotlin-install'
RUN ls -la
ENV KOTLIN_NATIVE_HOME="/root/.konan/kotlin-native-linux-1.3.60"
ENV PATH="$KOTLIN_NATIVE_HOME/bin:$PATH"