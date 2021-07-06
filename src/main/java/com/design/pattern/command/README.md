## 命令模式（行为型）

Command Design Pattern

命令模式 VS 策略模式：在策略模式中，不同的策略具有相同的目的、不同的实现、互相之间可以替换。比如，BubbleSort、SelectionSort 都是为了实现排序的，只不过一个是用冒泡排序算法来实现的，另一个是用选择排序算法来实现的。而在命令模式中，不同的命令具有不同的目的，对应不同的处理逻辑，并且互相之间不可替换。

### 定义

在 GoF 的《设计模式》一书中，它是这么定义的：

> The command pattern encapsulates a request as an object, thereby letting us parameterize other objects with different requests, queue or log requests, and support undoable operations.

翻译：命令模式将请求（命令）封装为一个对象，这样可以使用不同的请求参数化其他对象（将不同请求依赖注入到其他对象），并且能够支持请求（命令）的排队执行、记录日志、撤销等（附加控制）功能。

### 解决问题

### 应用场景举例

控制命令的执行，比如，异步、延迟、排队执行命令、撤销重做命令、存储命令、给命令记录日志等等

手机游戏指令 demo2
客户端发送给服务器的请求，一般都包括两部分内容：指令（事件）和数据（执行这个指令所需的数据）

### code

命令模式用到最核心的实现手段，就是将函数封装成对象

demo1：大话设计模式

demo2：应用场景

------

将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。