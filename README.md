# JUnit5 Christmas Decorations



![Decorations](https://user-images.githubusercontent.com/316929/102725278-f47ae100-4315-11eb-8793-317ad74f0eab.png)


## Usage

### Gradle
```groovy
repositories {
    mavenCentral()
    maven {
        url 'https://jitpack.io'
    }
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine'
    testImplementation 'com.github.bmuskalla:junit5-christmas-decoration:main-SNAPSHOT'
}
```

### Enable globally

```
-Djunit.jupiter.displayname.generator.default=io.bmuskalla.junit5.christmas.decoration.JUnitChristmasDecorations
```

### Enable per test

```java
@DisplayNameGeneration(JUnitChristmasDecorations.class)
public class FooTest {
}
```
