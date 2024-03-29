## 解释器模式（行为型）

Interpreter Design Pattern

描述如何构建一个简单的“语言”解释器

### 定义

在 GoF 的《设计模式》一书中，它是这样定义的：

> Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

翻译：解释器模式为某个语言（承载信息的载体，比如，古代的结绳记事、盲文、哑语、摩斯密码等）定义它的语法（或者叫文法）表示，并定义一个解释器用来处理这个语法。

### 解决问题

### 应用场景举例

只在一些特定的领域会被用到，比如编译器、规则引擎、正则表达式

Google Translate

新的加减乘除计算“语言” demo2
语法规则如下：
运算符只包含加、减、乘、除，并且没有优先级的概念；
表达式（也就是前面提到的“句子”）中，先书写数字，后书写运算符，空格隔开；
按照先后顺序，取出两个数字和一个运算符计算结果，结果重新放入数字的最头部位置，循环上述过程，直到只剩下一个数字，这个数字就是表达式最终的计算结果。
例：
比如表达式 “8 3 2 4 - + *”，按照上面的语法规则来处理，取出数字 “8 3 ”和 “-” 运算符，计算得到 5，于是表达式就变成了 “5 2 4 + *”。然后，再取出 “5 2” 和 “+” 运算符，计算得到 7，表达式就变成了 “7 4 *”。最后，取出 “7 4” 和 “*” 运算符，最终得到的结果就是 28。

自定义接口告警规则功能：监控业务系统的运行情况，及时将异常报告给开发者。比如，如果每分钟接口出错数超过 100，监控系统就通过短信、微信、邮件等方式发送告警给开发者 demo3
规则：
每分钟 API 总出错数超过 100 或者每分钟 API 总调用数超过 10000 就触发告警。
语法：
api_error_per_minute > 100 || api_count_per_minute > 10000
需求：
自定义的告警规则只包含“||、&&、>、<、==”五个运算符，优先级：“> < ==” && ||
在表达式中，任意元素之间需要通过空格来分隔
用户可以自定义要监控的 key，比如 api_error_per_minute、api_count_per_minute

### code

代码实现比较灵活，没有固定的模板。
代码实现的核心思想，就是将语法解析的工作拆分到各个小类中，以此来避免大而全的解析类。一般的做法是，将语法规则拆分一些小的独立的单元，然后对每个单元进行解析，最终合并为对整个语法规则的解析。

demo1：大话设计模式

demo2：应用场景
v1：简单语法规则解析
v2：解释器模式实现

demo3：应用场景 告警模块
代码实现有点意思：
运算符优先级的实现 先根据 || split，针对 || split 的每条结果再根据 && split，针对 && split 的每条结果再根据 “> < ==” 分别解析
解析完后，统一的处理入口为 || split 的结果

------

给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。