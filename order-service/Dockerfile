FROM openjdk:8
ADD target/kubernetes-order-service.jar kubernetes-order-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar","kubernetes-order-service.jar"]