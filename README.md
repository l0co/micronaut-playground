# Micronaut Playground

[#5419](https://github.com/micronaut-projects/micronaut-core/issues/5419)

```
$ gradle clean test
Starting a Gradle Daemon, 3 incompatible Daemons could not be reused, use --status for details

> Task :compileJava
Note: Creating bean classes for 2 type elements

> Task :compileTestJava
Note: Creating bean classes for 1 type elements

> Task :test FAILED

MyTest > test() FAILED
    io.micronaut.context.exceptions.BeanInstantiationException at DefaultBeanContext.java:2006
        Caused by: io.micronaut.context.exceptions.NoSuchBeanException at BeanDefinitionRegistry.java:300

1 test completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/lukasz/Projekty/github/micronaut-playground/build/reports/tests/test/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.8.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 7s
5 actionable tasks: 5 executed
```
