# quarkus-envoy-503
This repo contains the resources to setup two Quarkus apps one running 0.22.0 and another running 0.25.0 along with Envoy 1.9.0. The purpose is to provoke the problems states in https://github.com/quarkusio/quarkus/issues/4572

To start simple run ```docker-compose up --build``` in directory src/main/docker/

To send a request towards Quarkus 0.22.0 execute
```curl -X GET "http://127.0.0.1:8080/q022/openapi"```

To send a request towards Quarkus 0.25.0 execute
```curl -X GET "http://127.0.0.1:8080/q025/openapi"```
