## 模板方法设计模式（行为型）

Template Method Design Pattern

### 定义

在 GoF 的《设计模式》一书中，它是这么定义的：

> Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

翻译：模板方法模式在一个方法中定义一个算法骨架，并将某些步骤推迟到子类中实现。模板方法模式可以让子类在不改变算法整体结构的情况下，重新定义算法中的某些步骤。

算法骨架就是“模板”，包含算法骨架的方法就是“模板方法”

### 解决问题

模板模式主要是用来解决复用和扩展两个问题。

### 应用场景举例

Java Servlet：扩展 extends HttpServlet 后 doGet()、doPost()
JUnit TestCase：扩展 extends TestCase
Java InputStream：复用 read(byte b[], int off, int len) 抽象方法
Java AbstractList：复用 add(int index, E element) 直接抛出异常

### code

demo1：大话设计模式

demo2：...

demo3：基于同步回调的模板模式
例：Spring 提供的 xxxTemplate（JdbcTemplate、RedisTemplate、RestTemplate），尽管都叫作 xxxTemplate，但它们并非基于模板模式来实现的，而是基于回调来实现的，确切地说应该是同步回调
源码：org.springframework.jdbc.core.JdbcTemplate#query(java.lang.String, org.springframework.jdbc.core.RowMapper<T>)
RowMapper#mapRow 是用户的真实逻辑，RowMapperResultSetExtractor 封装了 RowMapper，QueryStatementCallback 封装了 rse，真正的执行逻辑在 execute()

模板模式和回调在应用场景上来看几乎一致，不同在代码实现上，【回调基于组合关系来实现】，把一个对象传递给另一个对象，是一种对象之间的关系；【模板模式基于继承关系来实现】，子类重写父类的抽象方法，是一种类之间的关系。


在模板模式经典的实现中，模板方法定义为 final，可以避免被子类重写。需要子类重写的方法定义为 abstract，可以强迫子类去实现。不过，在实际项目开发中，模板模式的实现比较灵活，以上两点都不是必须的。

------

定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。