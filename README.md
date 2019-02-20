# ms-springboot
Ejemplo de microservicio creado con spring boot y exponiendo algunos servicios básicos

## Ejecución del servicio
```
mvn spring-boot:run
```

## Consumo de los servicios
```
curl localhost:8090/

curl localhost:8090/helloName?name=Carlos
```

## Ejecutar unit test
```
mvn clean test
```

## Ejecutar solo integration-test
```
mvn clean failsafe:integration-test
```

## Ejecutar Todos los test
```
mvn clean integration-test

mvn clean verify
```

Esto es una prueba