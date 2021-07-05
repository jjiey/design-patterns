## 观察者模式（行为型）

Observer Design Pattern

观察者模式也被称为发布订阅模式。

还有各种叫法：Subject-Observer、Publisher-Subscriber、Producer-Consumer、EventEmitter-EventListener、Dispatcher-Listener

根据应用场景的不同，观察者模式会对应不同的代码实现方式：同步阻塞的实现方式，异步非阻塞的实现方式；进程内的实现方式，跨进程的实现方式。

### 定义

在 GoF 的《设计模式》一书中，它的定义是这样的：

> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

翻译：在对象之间定义一个一对多的依赖，当一个对象状态改变的时候，所有依赖的对象都会自动收到通知。

被依赖的对象叫作被观察者（Observable），依赖的对象叫作观察者（Observer）。

### 解决问题

将观察者和被观察者代码解耦。将一大坨代码拆分成职责更单一的小类，让其满足开闭原则、高内聚低耦合等特性，以此来控制和应对代码的复杂性，提高代码的可扩展性。

### 应用场景举例

P2P 投资理财系统（demo3）：用户注册成功之后，给用户发放投资体验金（可能进程内，可能跨进程（比如微服务）），给用户发放优惠券（可能进程内，可能跨进程（比如微服务）），给用户发送一封“欢迎注册成功”的站内信（可能进程内，可能跨进程（比如微服务）），推送用户注册信息给大数据征信系统（跨进程，可通过 RPC 接口或消息队列）。

other：邮件订阅、RSS Feeds

### code

demo1（同步阻塞的实现方式）
大话设计模式：经典实现方式。相当于把 Event 揉进了 ConcreteSubject，如果 event 属性不多，可以这么搞，不过最好还是抽出一个类，便于后续扩展

demo2（同步阻塞的实现方式）：经典实现方式

demo3（同步阻塞的实现方式）：应用场景

异步非阻塞的两种实现方式（异步非阻塞的实现方式。实现略，在 demo3 的基础上修改）：（1）在每个 handleRegSuccess() 函数中创建一个新的线程执行代码逻辑；（2）在 UserController 的 register() 函数中使用线程池来执行每个观察者的 handleRegSuccess() 函数。

demo4（异步非阻塞的实现方式）：EventBus

demo5：造轮子 EventBus

demo6：基于异步回调的观察者模式（比如支付、Android 应用开发中给 Button 控件注册事件监听器、Hook 方法如 Tomcat 和 JVM 的 shutdown hook）

------

定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。