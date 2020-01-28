FROM gradle:6.0.1-jdk8

RUN mkdir 'kotlin-install'
ADD . kotlin-install
RUN gradle -p kotlin-install buildNeeded
RUN rm -rf 'kotlin-install'
ENV KOTLIN_NATIVE_HOME="/root/.konan/kotlin-native-linux-1.3.60"
ENV PATH="$KOTLIN_NATIVE_HOME/bin:$PATH"