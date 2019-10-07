#!/usr/bin/env sh

echo "SPRING_PROFILES_ACTIVE ===== $SPRING_PROFILES_ACTIVE"

/bin/sh -c "java -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} -Djava.security.egd=file:/dev/./urandom -jar app.jar"
