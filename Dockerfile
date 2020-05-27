# Source Image name
from openjdk:8
add HelloWorld/target/HelloWorld-0.0.1-SNAPSHOT.jar HelloWorld.jar
EXPOSE 80
# Command to run Apache server in background
CMD ["java" "-jar" "/HelloWorld.jar"]
