# Source Image name
from openjdk:8
add HelloWorld/target/HelloWorld.jar HelloWorld.jar
EXPOSE 8080
# Command to run Apache server in background
CMD ["java" "-jar" "/HelloWorld.jar"]
