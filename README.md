# Micronaut Playground

https://github.com/micronaut-projects/micronaut-core/issues/3742

1. Clean with `gradle clean`.
1. Build with `gradle build; cat ./build/tmp/kapt3/classes/main/META-INF/services/io.micronaut.inject.BeanDefinitionReference`.
1. Add some empty method to `Application` class.
1. Build again -> the file will be empty.

A way to debug kapt:

1. Remote debug on 5005 in idea.
1. `gradle build --no-daemon -Dorg.gradle.debug=true`
1. Join to remote debugging session.
1. Stop in `ServiceDescriptionProcessor` (from micronaut/inject-java sources).
