FROM openjdk:8
ADD target/kubernetes-products-service.jar kubernetes-products-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "kubernetes-products-service.jar"]