package com.springactuator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootactuatorApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(SpringbootactuatorApplication.class, args);
	System.out.println("stop");
	}

}
//output
//http://localhost:8081/actuator/health
//{"status":"UP"}

//http://localhost:8081/actuator/beans
//many large output i am just printing sample two lines
//{"contexts":{"application":{"beans":{"endpointCachingOperation
//InvokerAdvisor":{"aliases":[],"scope":"singleton","type":"org.spring
//framework.boot.actuate.endpoint.invoker.cache.CachingOperationInvoke
//rAdvisor","resource":"class path resource [org/springframework/boot/actuate/au
//toconfigure/endpoint/EndpointAutoConfiguration.class]","dependencies":

//http://localhost:8081/actuator
//{"_links":{"self":{"href":"http://localhost:8081/actuator",
//"templated":false},"health":{"href":"http://localhost:8081/
//actuator/health","templated":false},"health-path":{"href":
//"http://localhost:8081/actuator/health/{*path}","templated":true}}}

//http://localhost:8081/actuator/mappings
//many large output i am just printing sample two lines
//{"contexts":{"application":{"mappings":{"dispatcherServlets":{"dispatcherServlet"
//:[{"handler":"Actuator web endpoint 'configprops'","predicate":"{GET


//http://localhost:8081/actuator/metrics
//{"names":["http.server.requests","jvm.buffer.count","jvm.buffer.memory.used","jvm.buffer.total.capacity","jvm.classes.loaded","jvm.classes.unloaded","jvm.gc.live.data.size","jvm.gc.max.data.size","jvm.gc.memory.allocated","jvm.gc.memory.promoted","jvm.memory.committed","jvm.memory.max","jvm.memory.used","jvm.threads.daemon","jvm.threads.live","jvm.threads.peak","jvm.threads.states","logback.events","process.cpu.usage","process.start.time","process.uptime","system.cpu.count","system.cpu.usage","tomcat.sessions.active.current","tomcat.sessions.active.max","tomcat.sessions.alive.max","tomcat.sessions.created","tomcat.sessions.expired","tomcat.sessions.rejected"]}