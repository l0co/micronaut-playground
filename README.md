# Micronaut Playground

https://github.com/micronaut-projects/micronaut-core/issues/3742

1. Build with `gradle build; cat ./build/tmp/kapt3/classes/main/META-INF/services/io.micronaut.injct.BeanDefinitionReference`
1. Add some empty method to `Application` class
1. Build again -> the file will be empty.
