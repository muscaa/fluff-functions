# Fluff Functions

[![](https://jitpack.io/v/muscaa/fluff-functions.svg)](https://jitpack.io/#muscaa/fluff-functions) [![License: Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Description

A library offering a wide range of function combinations, supporting both native types and generics.

## Usage

<details>
<summary>Gradle</summary>
    
```gradle
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation "com.github.muscaa:fluff-functions:VERSION"
}
```
</details>

<details>
<summary>Maven</summary>
    
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.muscaa</groupId>
        <artifactId>fluff-functions</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```
</details>

Replace `VERSION` with the latest release available on [JitPack](https://jitpack.io/#muscaa/fluff-functions).

## Examples

```java
// void return, no parameter function
VoidFunc f1 = () -> System.out.println("Hello World!");
f1.invoke();

// String return, String parameter function
Func1<String ,String> f2 = s -> s + " There!";
String str = f2.invoke("Hello");

// int return, String and boolean parameters function, which throws an Exception
TIntFunc2ObjBoolean<String, Exception> f3 = (s, b) -> {
    if (b) throw new Exception("Exception thrown.");
    System.out.println(s);
    return 1;
};
try {
    f3.invoke(str, false);
} catch (Exception e) {
    e.printStackTrace();
}
try {
    f3.invoke(str, true);
} catch (Exception e) {
    e.printStackTrace();
}
```
