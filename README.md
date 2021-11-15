# LdapServer
JNDI利用，用于高版本的JDK(>8u191)。利用LDAP返回序列化数据，触发本地Gadget。

```
mvn package

java -jar target/jndi-all.jar 127.0.0.1 8888 1389
```
