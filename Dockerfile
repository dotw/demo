FROM websphere-liberty:microProfile
COPY /target/liberty/wlp/usr/servers/defaultServer /config/
