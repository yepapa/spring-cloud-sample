# Spring Cloud Sample

# Information

| App name            | Port |
| ------------------- | ---- |
| gateway-zuul        | 8765 |
| gateway-cloud       | 8766 |
| user-service        | 8090 |
| websocket-server    | 8091 |
| config-service      | 8888 |
| eureka-service      | 8761 |
| spring-boot-admin2  | 9999 |
| turbine-service     | 8989 |
| zipkin-service      | 8990 |
 

# Eureka Service

java10에서 tomcat 시작 시 오류  
https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j
https://www.concretepage.com/forum/thread?qid=531


# User Service


```
mongo admin -uyepapa -pyepapa
```

```
use sc_sample
```

switched to db sc_sample

```
> db.createUser({
     user: 'yepapa',
     pwd: 'yepapa',
     roles: [{ role: 'readWrite', db:'sc_sample'}]
 })
```

# Test

get user list
```
]# http :8090/users
```

get user list through gateway
```
http :8765/user/users
```
