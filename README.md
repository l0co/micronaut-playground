# Micronaut Playground

[#5419](https://github.com/micronaut-projects/micronaut-core/issues/5419)

```
$ gradle clean test --info
Initialized native services in: /home/lukasz/.gradle/native
Found daemon DaemonInfo{pid=13909, address=[34ce2db8-6a52-45b3-9667-f270bada8632 port:41549, addresses:[/127.0.0.1]], state=Idle, lastBusy=1621328899866, context=DefaultDaemonContext[uid=8d2d801a-1a94-4a75-9161-3f863773d964,javaHome=/usr/local/dev/bin/jdk-14,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=13909,idleTimeout=10800000,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-Xmx4096m,-Dfile.encoding=UTF-8,-Duser.country=PL,-Duser.language=pl,-Duser.variant]} however its context does not match the desired criteria.
At least one daemon option is different.
Wanted: DefaultDaemonContext[uid=null,javaHome=/usr/local/dev/bin/jdk-14,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=15378,idleTimeout=null,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-XX:MaxMetaspaceSize=256m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]
Actual: DefaultDaemonContext[uid=8d2d801a-1a94-4a75-9161-3f863773d964,javaHome=/usr/local/dev/bin/jdk-14,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=13909,idleTimeout=10800000,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-Xmx4096m,-Dfile.encoding=UTF-8,-Duser.country=PL,-Duser.language=pl,-Duser.variant]

  Looking for a different daemon...
Found daemon DaemonInfo{pid=7030, address=[6de726ec-eae3-42b5-a3ba-5e11a2395c34 port:34035, addresses:[/127.0.0.1]], state=Idle, lastBusy=1621328935043, context=DefaultDaemonContext[uid=63e57636-e1c9-49ae-97d0-0a463e8f5d3a,javaHome=/media/data/links/usr/local/dev/bin/jdk-11.0.2,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=7030,idleTimeout=10800000,priority=NORMAL,daemonOpts=-XX:MaxMetaspaceSize=256m,-XX:+HeapDumpOnOutOfMemoryError,--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=PL,-Duser.language=pl,-Duser.variant]} however its context does not match the desired criteria.
Java home is different.
Wanted: DefaultDaemonContext[uid=null,javaHome=/usr/local/dev/bin/jdk-14,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=15378,idleTimeout=null,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-XX:MaxMetaspaceSize=256m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]
Actual: DefaultDaemonContext[uid=63e57636-e1c9-49ae-97d0-0a463e8f5d3a,javaHome=/media/data/links/usr/local/dev/bin/jdk-11.0.2,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=7030,idleTimeout=10800000,priority=NORMAL,daemonOpts=-XX:MaxMetaspaceSize=256m,-XX:+HeapDumpOnOutOfMemoryError,--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=PL,-Duser.language=pl,-Duser.variant]

  Looking for a different daemon...
Found daemon DaemonInfo{pid=9323, address=[147629e5-2040-4b77-a973-5389f7dd3e4f port:44269, addresses:[/127.0.0.1]], state=Idle, lastBusy=1621328028841, context=DefaultDaemonContext[uid=a489bb65-6631-44af-b530-28f5fc3e5cf1,javaHome=/media/data/links/usr/local/dev/bin/jdk-11.0.2,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=9323,idleTimeout=10800000,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-Xmx4096m,-Dfile.encoding=UTF-8,-Duser.country=PL,-Duser.language=pl,-Duser.variant]} however its context does not match the desired criteria.
Java home is different.
Wanted: DefaultDaemonContext[uid=null,javaHome=/usr/local/dev/bin/jdk-14,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=15378,idleTimeout=null,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-XX:MaxMetaspaceSize=256m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]
Actual: DefaultDaemonContext[uid=a489bb65-6631-44af-b530-28f5fc3e5cf1,javaHome=/media/data/links/usr/local/dev/bin/jdk-11.0.2,daemonRegistryDir=/home/lukasz/.gradle/daemon,pid=9323,idleTimeout=10800000,priority=NORMAL,daemonOpts=--add-opens,java.base/java.util=ALL-UNNAMED,--add-opens,java.base/java.lang=ALL-UNNAMED,--add-opens,java.base/java.lang.invoke=ALL-UNNAMED,--add-opens,java.prefs/java.util.prefs=ALL-UNNAMED,-Xmx4096m,-Dfile.encoding=UTF-8,-Duser.country=PL,-Duser.language=pl,-Duser.variant]

  Looking for a different daemon...
The client will now receive all logging from the daemon (pid: 14506). The daemon log file: /home/lukasz/.gradle/daemon/6.8.2/daemon-14506.out.log
Starting 4th build in daemon [uptime: 3 mins 8.896 secs, performance: 99%, non-heap usage: 27% of 256 MiB]
Using 8 worker leases.
Watching the file system is disabled
Starting Build
Settings evaluated using settings file '/home/lukasz/Projekty/github/micronaut-playground/settings.gradle'.
Projects loaded. Root project using build file '/home/lukasz/Projekty/github/micronaut-playground/build.gradle'.
Included projects: [root project 'micronaut-playground']

> Configure project :
Evaluating root project 'micronaut-playground' using build file '/home/lukasz/Projekty/github/micronaut-playground/build.gradle'.
Applying dependency management to configuration 'shadow' in project 'micronaut-playground'
Applying dependency management to configuration 'archives' in project 'micronaut-playground'
Applying dependency management to configuration 'default' in project 'micronaut-playground'
Applying dependency management to configuration 'compile' in project 'micronaut-playground'
Applying dependency management to configuration 'implementation' in project 'micronaut-playground'
Applying dependency management to configuration 'runtime' in project 'micronaut-playground'
Applying dependency management to configuration 'compileOnly' in project 'micronaut-playground'
Applying dependency management to configuration 'compileClasspath' in project 'micronaut-playground'
Applying dependency management to configuration 'annotationProcessor' in project 'micronaut-playground'
Applying dependency management to configuration 'runtimeOnly' in project 'micronaut-playground'
Applying dependency management to configuration 'runtimeClasspath' in project 'micronaut-playground'
Applying dependency management to configuration 'testCompile' in project 'micronaut-playground'
Applying dependency management to configuration 'testImplementation' in project 'micronaut-playground'
Applying dependency management to configuration 'testRuntime' in project 'micronaut-playground'
Applying dependency management to configuration 'testCompileOnly' in project 'micronaut-playground'
Applying dependency management to configuration 'testCompileClasspath' in project 'micronaut-playground'
Applying dependency management to configuration 'testAnnotationProcessor' in project 'micronaut-playground'
Applying dependency management to configuration 'testRuntimeOnly' in project 'micronaut-playground'
Applying dependency management to configuration 'testRuntimeClasspath' in project 'micronaut-playground'
Applying dependency management to configuration 'apiElements' in project 'micronaut-playground'
Applying dependency management to configuration 'runtimeElements' in project 'micronaut-playground'
Applying dependency management to configuration 'developmentOnly' in project 'micronaut-playground'
All projects evaluated.
Selected primary task 'clean' from project :
Selected primary task 'test' from project :
Tasks to be executed: [task ':clean', task ':compileJava', task ':processResources', task ':classes', task ':compileTestJava', task ':processTestResources', task ':testClasses', task ':test']
Tasks that were excluded: []
:clean (Thread[Execution worker for ':',5,main]) started.

> Task :clean
Caching disabled for task ':clean' because:
  Build cache is disabled
Task ':clean' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
:clean (Thread[Execution worker for ':',5,main]) completed. Took 0.002 secs.
:compileJava (Thread[Execution worker for ':',5,main]) started.

> Task :compileJava
Resolving global dependency management for project 'micronaut-playground'
Excluding []
Excluding []
Caching disabled for task ':compileJava' because:
  Build cache is disabled
Task ':compileJava' is not up-to-date because:
  Output property 'destinationDirectory' file /home/lukasz/Projekty/github/micronaut-playground/build/classes/java/main has been removed.
  Output property 'destinationDirectory' file /home/lukasz/Projekty/github/micronaut-playground/build/classes/java/main/META-INF has been removed.
  Output property 'destinationDirectory' file /home/lukasz/Projekty/github/micronaut-playground/build/classes/java/main/META-INF/services has been removed.
The input changes require a full rebuild for incremental task ':compileJava'.
Full recompilation is required because no incremental change information is available. This is usually caused by clean builds or changing compiler arguments.
Compiling with JDK Java compiler API.
Note: Creating bean classes for 2 type elements
Created classpath snapshot for incremental compilation in 0.003 secs. 1 duplicate classes found in classpath (see all with --debug).
:compileJava (Thread[Execution worker for ':',5,main]) completed. Took 0.687 secs.
:processResources (Thread[Execution worker for ':',5,main]) started.

> Task :processResources
Caching disabled for task ':processResources' because:
  Build cache is disabled
Task ':processResources' is not up-to-date because:
  Output property 'destinationDir' file /home/lukasz/Projekty/github/micronaut-playground/build/resources/main has been removed.
  Output property 'destinationDir' file /home/lukasz/Projekty/github/micronaut-playground/build/resources/main/application.yml has been removed.
  Output property 'destinationDir' file /home/lukasz/Projekty/github/micronaut-playground/build/resources/main/logback.xml has been removed.
:processResources (Thread[Execution worker for ':',5,main]) completed. Took 0.002 secs.
:classes (Thread[Execution worker for ':',5,main]) started.

> Task :classes
Skipping task ':classes' as it has no actions.
:classes (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:compileTestJava (Thread[Execution worker for ':',5,main]) started.

> Task :compileTestJava
Excluding []
Excluding []
Caching disabled for task ':compileTestJava' because:
  Build cache is disabled
Task ':compileTestJava' is not up-to-date because:
  Output property 'destinationDirectory' file /home/lukasz/Projekty/github/micronaut-playground/build/classes/java/test has been removed.
  Output property 'destinationDirectory' file /home/lukasz/Projekty/github/micronaut-playground/build/classes/java/test/META-INF has been removed.
  Output property 'destinationDirectory' file /home/lukasz/Projekty/github/micronaut-playground/build/classes/java/test/META-INF/services has been removed.
The input changes require a full rebuild for incremental task ':compileTestJava'.
Full recompilation is required because no incremental change information is available. This is usually caused by clean builds or changing compiler arguments.
Compiling with JDK Java compiler API.
Note: Creating bean classes for 1 type elements
Created classpath snapshot for incremental compilation in 0.002 secs. 1 duplicate classes found in classpath (see all with --debug).
:compileTestJava (Thread[Execution worker for ':',5,main]) completed. Took 0.315 secs.
:processTestResources (Thread[Execution worker for ':',5,main]) started.

> Task :processTestResources NO-SOURCE
file or directory '/home/lukasz/Projekty/github/micronaut-playground/src/test/resources', not found
Skipping task ':processTestResources' as it has no source files and no previous output files.
:processTestResources (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:testClasses (Thread[Execution worker for ':',5,main]) started.

> Task :testClasses
Skipping task ':testClasses' as it has no actions.
:testClasses (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:test (Thread[Execution worker for ':',5,main]) started.
Gradle Test Executor 4 started executing tests.
Gradle Test Executor 4 finished executing tests.

> Task :test FAILED
Excluding []
Excluding []
Caching disabled for task ':test' because:
  Build cache is disabled
Task ':test' is not up-to-date because:
  Task has failed previously.
Starting process 'Gradle Test Executor 4'. Working directory: /home/lukasz/Projekty/github/micronaut-playground Command: /usr/local/dev/bin/jdk-14/bin/java -Dorg.gradle.native=false @/tmp/gradle-worker-classpath4088365337771869606txt -Xmx512m -Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -Duser.variant -ea worker.org.gradle.process.internal.worker.GradleWorkerMain 'Gradle Test Executor 4'
Successfully started process 'Gradle Test Executor 4'

MyTest STANDARD_OUT
    11:13:35.876 [Test worker] INFO  i.m.context.env.DefaultEnvironment - Established active environments: [test]
    11:13:36.248 [Test worker] DEBUG micronaut.general.AutoStartingBean - Starting...

MyTest > test() FAILED
    io.micronaut.context.exceptions.BeanInstantiationException: Error instantiating bean of type  [micronaut.general.MyTest]

    Message: No bean of type [micronaut.general.MyBean] exists for the given qualifier: @Named('micronaut.general.Handler'). Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
    Path Taken: MyTest.myBean
        at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:2006)
        at io.micronaut.context.DefaultBeanContext.lambda$null$55(DefaultBeanContext.java:2454)
        at io.micronaut.context.ProviderUtils$MemoizingProvider.initialize(ProviderUtils.java:65)
        at io.micronaut.context.ProviderUtils$MemoizingProvider.get(ProviderUtils.java:60)
        at io.micronaut.context.DefaultBeanContext.getScopedBeanForDefinition(DefaultBeanContext.java:2462)
        at io.micronaut.context.DefaultBeanContext.getBeanForDefinition(DefaultBeanContext.java:2429)
        at io.micronaut.context.DefaultBeanContext.getBeanInternal(DefaultBeanContext.java:2401)
        at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:1264)
        at io.micronaut.context.AbstractBeanDefinition.getBeanForField(AbstractBeanDefinition.java:1706)
        at io.micronaut.context.AbstractBeanDefinition.getBeanForField(AbstractBeanDefinition.java:1463)
        at micronaut.general.$MyTestDefinition.injectBean(Unknown Source)
        at io.micronaut.context.AbstractBeanDefinition.inject(AbstractBeanDefinition.java:341)
        at io.micronaut.context.DefaultBeanContext.doInject(DefaultBeanContext.java:2272)
        at io.micronaut.context.DefaultBeanContext.inject(DefaultBeanContext.java:804)
        at io.micronaut.test.extensions.AbstractMicronautExtension.beforeEach(AbstractMicronautExtension.java:307)
        at io.micronaut.test.extensions.junit5.MicronautJunit5Extension.beforeEach(MicronautJunit5Extension.java:112)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeBeforeEachCallbacks$1(TestMethodTestDescriptor.java:159)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeBeforeMethodsOrCallbacksUntilExceptionOccurs$5(TestMethodTestDescriptor.java:195)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeBeforeMethodsOrCallbacksUntilExceptionOccurs(TestMethodTestDescriptor.java:195)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeBeforeEachCallbacks(TestMethodTestDescriptor.java:158)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:125)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:65)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1510)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1510)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:143)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:129)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:127)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:126)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:84)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:108)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:96)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:75)
        at org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor$CollectAllTestClassesExecutor.processAllTestClasses(JUnitPlatformTestClassProcessor.java:99)
        at org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor$CollectAllTestClassesExecutor.access$000(JUnitPlatformTestClassProcessor.java:79)
        at org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor.stop(JUnitPlatformTestClassProcessor.java:75)
        at org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.stop(SuiteTestClassProcessor.java:61)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:564)
        at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:36)
        at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
        at org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:33)
        at org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:94)
        at com.sun.proxy.$Proxy2.stop(Unknown Source)
        at org.gradle.api.internal.tasks.testing.worker.TestWorker.stop(TestWorker.java:133)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:564)
        at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:36)
        at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
        at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:182)
        at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:164)
        at org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:414)
        at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
        at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:630)
        at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)
        at java.base/java.lang.Thread.run(Thread.java:832)

        Caused by:
        io.micronaut.context.exceptions.NoSuchBeanException: No bean of type [micronaut.general.MyBean] exists for the given qualifier: @Named('micronaut.general.Handler'). Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
            at io.micronaut.context.BeanDefinitionRegistry.lambda$getProxyTargetBeanDefinition$1(BeanDefinitionRegistry.java:300)
            at java.base/java.util.Optional.orElseThrow(Optional.java:401)
            at io.micronaut.context.BeanDefinitionRegistry.getProxyTargetBeanDefinition(BeanDefinitionRegistry.java:300)
            at io.micronaut.context.DefaultBeanContext.findProxyTargetMethod(DefaultBeanContext.java:1112)
            at io.micronaut.context.ExecutionHandleLocator.getProxyTargetMethod(ExecutionHandleLocator.java:185)
            at micronaut.general.$MyTest$MyBean0Definition$Intercepted.<init>(Unknown Source)
            at micronaut.general.$$MyTest$MyBean0Definition$InterceptedDefinition.build(Unknown Source)
            at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1979)
            ... 89 more

1 test completed, 1 failed
Finished generating test XML results (0.001 secs) into: /home/lukasz/Projekty/github/micronaut-playground/build/test-results/test
Generating HTML test report...
Finished generating test html results (0.001 secs) into: /home/lukasz/Projekty/github/micronaut-playground/build/reports/tests/test
:test (Thread[Execution worker for ':',5,main]) completed. Took 1.401 secs.

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/lukasz/Projekty/github/micronaut-playground/build/reports/tests/test/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.8.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 2s
5 actionable tasks: 5 executed
```
