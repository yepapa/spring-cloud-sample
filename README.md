# Spring Cloud Sample

# Eureka Service

java10에서 tomcat 시작 시 오류
https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j
https://www.concretepage.com/forum/thread?qid=531


# User Service

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

