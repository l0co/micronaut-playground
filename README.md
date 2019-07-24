# Micronaut Playground

After starting the app:

```
18:27:20.171 [main] ERROR io.micronaut.runtime.Micronaut - Error starting Micronaut server: Error instantiating bean of type  [micronaut.general.AutoStartingBean]

Message: Multiple possible bean candidates found: [micronaut.general.IMyBean, micronaut.general.IMyBean]
Path Taken: AutoStartingBean.myBean1
io.micronaut.context.exceptions.BeanInstantiationException: Error instantiating bean of type  [micronaut.general.AutoStartingBean]

Message: Multiple possible bean candidates found: [micronaut.general.IMyBean, micronaut.general.IMyBean]
Path Taken: AutoStartingBean.myBean1
	at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1531)
	at io.micronaut.context.DefaultBeanContext.getScopedBeanForDefinition(DefaultBeanContext.java:1993)
	at io.micronaut.context.DefaultBeanContext.getBeanForDefinition(DefaultBeanContext.java:1895)
	at io.micronaut.context.DefaultBeanContext.getBeanInternal(DefaultBeanContext.java:1868)
	at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:1013)
	at io.micronaut.context.AbstractBeanDefinition.getBeanForField(AbstractBeanDefinition.java:1346)
	at io.micronaut.context.AbstractBeanDefinition.getBeanForField(AbstractBeanDefinition.java:1148)
	at micronaut.general.$AutoStartingBeanDefinition.injectBean(Unknown Source)
	at micronaut.general.$AutoStartingBeanDefinition.build(Unknown Source)
	at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1511)
	at io.micronaut.context.DefaultBeanContext.createAndRegisterSingleton(DefaultBeanContext.java:2215)
	at io.micronaut.context.DefaultBeanContext.getBeanForDefinition(DefaultBeanContext.java:1893)
	at io.micronaut.context.DefaultBeanContext.getBeanInternal(DefaultBeanContext.java:1868)
	at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:577)
	at io.micronaut.context.DefaultBeanContext$BeanExecutionHandle.getTarget(DefaultBeanContext.java:2736)
	at io.micronaut.context.DefaultBeanContext$BeanExecutionHandle.invoke(DefaultBeanContext.java:2757)
	at io.micronaut.aop.chain.AdapterIntroduction.intercept(AdapterIntroduction.java:81)
	at io.micronaut.aop.MethodInterceptor.intercept(MethodInterceptor.java:40)
	at io.micronaut.aop.chain.InterceptorChain.proceed(InterceptorChain.java:146)
	at micronaut.general.AutoStartingBean$ApplicationEventListener$start1$Intercepted.onApplicationEvent(Unknown Source)
	at io.micronaut.context.DefaultBeanContext.lambda$publishEvent$17(DefaultBeanContext.java:1063)
	at java.util.ArrayList.forEach(ArrayList.java:1249)
	at io.micronaut.context.DefaultBeanContext.publishEvent(DefaultBeanContext.java:1057)
	at io.micronaut.context.DefaultBeanContext.start(DefaultBeanContext.java:214)
	at io.micronaut.context.DefaultApplicationContext.start(DefaultApplicationContext.java:187)
	at io.micronaut.runtime.Micronaut.start(Micronaut.java:69)
	at io.micronaut.runtime.Micronaut.run(Micronaut.java:303)
	at io.micronaut.runtime.Micronaut.run(Micronaut.java:289)
	at micronaut.general.Application.main(Application.java:8)
Caused by: io.micronaut.context.exceptions.NonUniqueBeanException: Multiple possible bean candidates found: [micronaut.general.IMyBean, micronaut.general.IMyBean]
	at io.micronaut.context.DefaultBeanContext.findConcreteCandidate(DefaultBeanContext.java:1607)
	at io.micronaut.context.DefaultApplicationContext.findConcreteCandidate(DefaultApplicationContext.java:395)
	at io.micronaut.context.DefaultBeanContext.lastChanceResolve(DefaultBeanContext.java:2197)
	at io.micronaut.context.DefaultBeanContext.findConcreteCandidateNoCache(DefaultBeanContext.java:2110)
	at io.micronaut.context.DefaultBeanContext.lambda$findProxyTargetBeanDefinition$11(DefaultBeanContext.java:917)
	at io.micronaut.core.util.clhm.ConcurrentLinkedHashMap.lambda$compute$0(ConcurrentLinkedHashMap.java:721)
	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
	at io.micronaut.core.util.clhm.ConcurrentLinkedHashMap.compute(ConcurrentLinkedHashMap.java:733)
	at io.micronaut.core.util.clhm.ConcurrentLinkedHashMap.computeIfAbsent(ConcurrentLinkedHashMap.java:710)
	at io.micronaut.context.DefaultBeanContext.findProxyTargetBeanDefinition(DefaultBeanContext.java:909)
	at io.micronaut.context.BeanDefinitionRegistry.getProxyTargetBeanDefinition(BeanDefinitionRegistry.java:275)
	at io.micronaut.context.DefaultBeanContext.getProxyTargetBean(DefaultBeanContext.java:890)
	at micronaut.general.$MyBeanFactory$Bean1Definition$Intercepted.$resolveTarget(Unknown Source)
	at micronaut.general.$MyBeanFactory$Bean1Definition$Intercepted.<init>(Unknown Source)
	at micronaut.general.$$MyBeanFactory$Bean1Definition$InterceptedDefinition.build(Unknown Source)
	at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1511)
	... 28 common frames omitted
```
