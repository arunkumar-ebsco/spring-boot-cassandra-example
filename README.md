# Spring-boot with cassandra example

## This repository is an example of spring-boot 2.0.x with cassandra

Dependencies used are:

```
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.0.1.RELEASE</version>
</parent>

<dependency>
	<groupId>org.springframework.data</groupId>
	<artifactId>spring-data-cassandra</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

## You need to install Cassandra

You can follow [this](https://www.tutorialspoint.com/cassandra/cassandra_installation.htm) tutorial and download it from [here](http://cassandra.apache.org/)

I have changed `listen_address` properties in `cassandra.yaml` (included with this repository). The location of this file (in windows installation) is `DataStax-DDC\apache-cassandra\conf`
