FROM gradle:6.0.1-jdk8

RUN mkdir 'kotlin-install' && cd 'kotlin-install'
RUN wget 'https://download.jetbrains.com/kotlin/native/builds/releases/1.3.60/linux/kotlin-native-linux-1.3.60.tar.gz'
RUN mkdir '/root/.konan'
RUN tar -C '/root/.konan' -xvf 'kotlin-native-linux-1.3.60.tar.gz' && cd '../' && rm -rf 'kotlin-install'
ENV KOTLIN_NATIVE_HOME="/root/.konan/kotlin-native-linux-1.3.60"
ENV PATH="$KOTLIN_NATIVE_HOME/bin:$PATH"