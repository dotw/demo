FROM websphere-liberty:beta
COPY src/main/liberty/config /config/
COPY target/demo-1.0-SNAPSHOT.war /config/dropins/
RUN wget http://central.maven.org/maven2/net/wasdev/wlp/tracer/liberty-opentracing-zipkintracer/1.0/liberty-opentracing-zipkintracer-1.0-sample.zip -O /tmp/tracer.zip && \
  unzip /tmp/tracer.zip -d /config && \
  rm /tmp/tracer.zip

