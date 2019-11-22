FROM gradle:5.6.2-jdk8

RUN mkdir 'kotlin-install' && cd 'kotlin-install'
RUN wget 'https://download.jetbrains.com/kotlin/native/builds/releases/1.3.60/linux/kotlin-native-linux-1.3.60.tar.gz'
RUN mkdir '/home/gradle/.konan'
RUN tar -C '/home/gradle/.konan -xvf kotlin-native-linux-1.3.60.tar.gz' && cd '../' && rm -rf 'kotlin-install'
ENV KOTLIN_NATIVE_HOME="/home/gradle/.konan/kotlin-native-linux-1.3.60"
ENV PATH="$KOTLIN_NATIVE_HOME/bin:$PATH"