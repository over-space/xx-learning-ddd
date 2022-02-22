
## Interface 接口层

职责：主要负责承接网络协议的转化、Session管理等

接口数量：避免所谓的统一API，不必人为限制接口类的数量，每个/每类业务对应一套接口即可，接口参数应该符合业务需求，避免大而全的入参

接口出参：统一返回Result

异常处理：应该捕捉所有异常，避免异常信息的泄漏。可以通过AOP统一处理，避免代码里有大量重复代码。



## Application 应用层

入参：具像化Command、Query、Event对象作为ApplicationService的入参，唯一可以的例外是单ID查询的场景。

CQE的语意化：CQE对象有语意，不同用例之间语意不同，即使参数一样也要避免复用。

入参校验：基础校验通过Bean Validation api解决。Spring Validation自带Validation的AOP，也可以自己写AOP。

出参：统一返回DTO，而不是Entity或DO。

DTO转化：用DTO Assembler负责Entity/VO到DTO的转化。

异常处理：不统一捕捉异常，可以随意抛异常。

# Anti-Corruption Layer 防腐层