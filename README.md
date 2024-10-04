# Apache Kafka

## Overview
The purpose of this repository is to contain a spring boot project with the `basic concept of apache kafka` (Event-driven Architecture) which is used to publish and process streams of records.

### References
- [Apache Kafka](https://kafka.apache.org/) (Official Site)
- [Alibou](https://youtu.be/KQDTtvZMS9c) (Youtube Link)

#### Frequently used commands
Go to the location of downloaded apache_kafka_server in your system like  `C:\kafka` and run `Command Prompt` in that location

##### Zookeeper and Kakfa Server Commands 
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

##### Other Commands
```
.\bin\windows\kafka-topics.bat --create --topic data-stream --bootstrap-server localhost:9092
```
```
.\bin\windows\kafka-topics.bat --describe --topic data-stream --bootstrap-server localhost:9092
```
```
.\bin\windows\kafka-console-producer.bat --topic data-stream --bootstrap-server localhost:9092
```
```
.\bin\windows\kafka-console-consumer.bat --topic data-stream --bootstrap-server localhost:9092 --from-beginning
```
