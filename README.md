# SeckillSystem
Java 秒杀设计方案

## 具体内容
对高并发高负载情形下的应用场景进行分析，以高效地处理资源竞争为目的，设计一个秒杀与抢购模型。 本项目提供了四种解决方案来比较系统的性能：  
1.利用MySQL的update行锁实现悲观锁。  
2.MySQL加字段version实现乐观锁。  
3.使用Redis作为原子计数器（watch事务+decr操作），RabbitMQ作为消息队列记录用户抢购行为，MySQL做异步存储。   
4.基于AtomicInteger的CAS机制
