## 职责链模式（行为型）

Chain Of Responsibility Design Pattern

### 定义

在 GoF 的《设计模式》中，它是这么定义的：

> Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

翻译：将请求的发送和接收解耦，让多个接收对象都有机会处理这个请求。将这些接收对象串成一条链，并沿着这条链传递这个请求，直到链上的某个接收对象能够处理它为止。

### 解决问题

### 应用场景举例

对于支持 UGC（User Generated Content，用户生成内容）的应用（比如论坛）来说，用户生成的内容（比如，在论坛中发表的帖子）可能会包含一些敏感词（比如涉黄、广告、反动等词汇）。针对这个应用场景，我们就可以利用职责链模式来过滤这些敏感词。（demo7）

Servlet Filter 过滤器：对 HTTP 请求的过滤功能，比如鉴权、限流、记录日志、验证参数等等
Spring Interceptor 拦截器：过滤器和拦截器的不同之处在于，Servlet Filter 是 Servlet 规范的一部分，实现依赖于 Web 容器。Spring Interceptor 是 Spring MVC 框架的一部分，由 Spring MVC 框架来提供实现。客户端发送的请求，会先经过 Servlet Filter，然后再经过 Spring Interceptor，最后到达具体的业务代码中。
Dubbo Filter
Netty ChannelPipeline

### code

demo1：大话设计模式

demo2：第一种实现方式：如果当前处理器能处理该请求，就不继续往下传递；如果不能处理，则交由后面的处理器来处理

demo3：利用模版模式重构 demo2（防止忘记写 successor.handle()）

demo4：第二种实现方式：HandlerChain 类用数组而非链表来保存所有的处理器，在 HandlerChain 的 handle() 函数中，依次调用每个处理器的 handle() 函数

demo5：在 GoF 给出的定义中，如果处理器链上的某个处理器能够处理这个请求，那就不会继续往下传递请求。实际上，职责链模式还有一种变体，那就是请求会被所有的处理器都处理一遍，不存在中途终止的情况。
这种变体也有两种实现方式：用链表存储处理器和用数组存储处理器，跟 demo3 demo4 实现方式类似。
变体第一种实现方式

demo6：变体第二种实现方式

demo7：应用场景
对于包含敏感词的内容，有两种处理方式，一种是直接禁止发布，另一种是给敏感词打马赛克（比如，用 *** 替换敏感词）之后再发布。
第一种处理方式符合 GoF 给出的职责链模式的定义，第二种处理方式是职责链模式的变体。
第一种处理方式

demo8：应用场景
第二种处理方式

------

使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。