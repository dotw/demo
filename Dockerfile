FROM websphere-liberty:microProfile
COPY src/main/liberty/config /config/
COPY target/demo-1.0-SNAPSHOT.war /config/dropins/
