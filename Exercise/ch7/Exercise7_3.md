# Exercise 7-3
## [7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
오버라이딩(overriding)이란, ‘조상 클래스로부터 상속받은 메서드를 자손 클래
스에 맞게 재정의 하는 것’을 말한다.
조상 클래스로부터 상속받은 메서드를 자손 클래스에서 그대로 사용할 수 없는 경우가
많기 때문에 오버라이딩이 필요하다.

<참고>
* 오버로딩(Overloading) : 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술


- **오버라이딩** : 상위 클래스가 가지고 있는 메소드를 하위 클래스에서 재정의해서 사용하는 것을 의미한다.
  - 상속 시, 상위 클래스의 private 멤버를 제외한 모든 멤버를 상속받는다. 
- **오버로딩** : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 타입과 개수를 다르게 하여 정의하는 것을 의미한다. 즉, 메소드의 시그니처를 다르게 하여 정의하는 것이다. 



| 구분           | 오버로딩  | 오버라이딩 |
| -------------- | --------- | ---------- |
| 메소드 이름    | 동일      | 동일       |
| 매개변수, 타입 | 다름      | 동일       |
| 반환 타입      | 상관 없음 | 동일       |
|                |           |            |

---
layout: post
title: "오버로딩 vs 오버라이딩"
categories:
    - Tech
excerpt: " "
comments: true
share: true
tags:
    - java
    - overloading
    - overriding
date: 2020-06-07 T23:41:00-0:05:00

---
# [출처] : https://github.com/kimmy100b/kimmy100b.github.io/blob/e0d659e15da5c044be11534b58bcbe351064bd96/_posts/2020/2020-06-07-overloading-overriding.md


# 오버로딩(Overloading)


오버로딩 = 메서드 오버로딩<br/>
: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것<br/>

오버로딩의 조건<br/>

1. 메서드 이름이 같아야 한다.
2. 매개변수의 개수 또는 타입이 달라야한다.

# 오버로딩의 예

PrintStream 클래스 내 println 메서드

```
void println()
void println(boolean x)
void println(char x)
void println(char[] x)
void println(double x)
void println(float x)
void println(int x)
void println(long x)
void println(String x)
```

add 메서드

```
long add(int a, long b) { return a+b; }
long add(long a, int b) { return a+b; }
```

# 오버로딩의 장점

1. 메서드의 이름을 짓기 편리하고 쉽게 기억하고 예측할 수 있어 오류의 가능성을 줄일 수 있다.
2. 메서드의 이름을 절약할 수 있다.

# 오버라이딩(Overriding)

부모 클래스로부터 메소드를 상속받았으나 그 메소드를 자식클래스에서 재사용하는 것이다.

# 오버라이딩의 예

```
class Dog{
    void sound() {
        System.out.println("멍멍");
    }
}


class Poodle extends Dog{
    @Override
    void sound() {
        System.out.println("왈왈(say 푸들)");
    }
}

class Pug extends Dog{
    @Override
    void sound() {
        System.out.println("뭉뭉(say 퍼그)");
    }
}


class Chihuahua extends Dog{
    @Override
    void sound() {
        System.out.println("월월(say 치와와)");
    }
}
```

![](https://kimmy100b.github.io/assets/images/java/overriding.png){: .align-center}<br/>

# 오버로딩과 오버라이딩의 차이

| 구분           | 오버로딩 | 오버라이딩 |
| -------------- | -------- | ---------- |
| 메서드 이름    | 같음     | 같음       |
| 매개변수, 타입 | 다름     | 같음       |
| 리턴타입       | 상관없음 | 같음       |


# 출처 : https://github.com/pompitzz/blog/blob/9fd1079687ae5c8359d35f231906d252dc6b7100/docs/Java/javaOverloadingParameter.md
---
title: JAVA 매개변수(Parameter)수가 같은 오버로딩 메서드가 위험한 이유
date: 2020-07-15 22:41
img: 
    - java.png
tags: 
    - Java
---

- 객체지향언어인 자바에서는 메서드 시그니처(메서드 명, 메서드 파라미터들의 조합)를 통해 메서드를 구분하기 때문에 오버로딩을 통해 유연한 설계가 가능합니다.
- 하지만 **오버로딩 메서드의 매개변수 수가 같을 경우 유연성 보다 혼란을 야기할 수 있습니다.** 

## 오버로딩과 오버라이딩의 특징
- 자바에서 **오버로딩 메서드는 컴파일 타임에 결정** 됩니다.
- 하지만 **오버라이딩 메서드는 런타임에 결정** 됩니다. 
    - 이러한 시점 차이로 인해 잘못된 추측을 할 수 있습니다.
    
### 오버로딩 메서드
```java
class Parent { }
class Child extends Parent { }

void print(Parent parent) { System.out.println("Parent"); }

void print(Child child) { System.out.println("Child"); }
```
- Child는 Parent를 확장하고 있고, Parent와 Child를 각각 매개변수로 가지는 **print 오버로딩 메서드를 정의**하였습니다.

#### 오버로딩 메서드 테스트
```java
@Test
void printTest()throws Exception {
    print(new Parent());
    print(new Child());
}
// 예상과 동일하게 Parent, Child를 출력된다.
```
```java
@Test
void printTest2() throws Exception {
    List<Parent> parents = Arrays.asList(new Parent(), new Child());
    parents.forEach(parent -> this.print(parent));
}
// 예상밖으로 Parent, Parent가 출력된다!!
```
- 두 번째 테스트에서 Parent가 두 번 출력되는 이유는 **오버로딩 메서드는 컴파일 타임에 결정되기 때문입니다.**
    - 컴파일 타임엔 parents는 List\<Parent>일 뿐 Child에 대한 정보는 알 수 없기 때문에 항상 Parent 오버로딩 메서드가 호출됩니다. 
- 동일한 코드에서 오버로딩 메서드만 오버라이딩 메서드로 변경 후 해당 테스트를 수행해보겠습니다.

### 오버라이딩 메서드
```java
class Parent {
    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void print() {
        System.out.println("Child");
    }
}
```

#### 오버라이딩 메서드 테스트
```java
@Test
void printTest3() throws Exception {
    List<Parent> parents = Arrays.asList(new Parent(), new Child());
    parents.forEach(parent -> parent.print());
}
// Parent, Child가 출력됨
```
- **오버라이딩 메서드는 런타임에 사용할 메서드가 결정되기 때문에** 각각 Parent, Child가 출력됩니다. 

> 자바를 공부하면 오버라이딩 메서드와 같이 런타임에 메서드가 결정되는 방식이 익숙하기 때문에 오버로딩 메서드를 사용할 때 예상 밖의 결과를 내는 경우가 있습니다. <br>
> - 자바 기본 라이브러리에서도 오버로딩으로 인해 겪을 수 있는 문제들이 몇 가지 존재합니다.
    
## 오버로딩으로 겪을 수 있는 문제
### List.remove
```java
@Test
void numbersTest() {
    // 1)
    final List<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3).collect(Collectors.toList());
    System.out.println(numbers1); // [-3, -2, -1, 0, 1, 2, 3]
    IntStream.of(0, 1, 2, 3).forEach(numbers1::remove);
    System.out.println(numbers1); // [-2, 0, 2]

    // 2) 
    final List<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3).collect(Collectors.toList());
    System.out.println(numbers2); // [-3, -2, -1, 0, 1, 2, 3]
    IntStream.of(0, 1, 2, 3).boxed().forEach(numbers2::remove); // boxed 메서드만 추가되었다.
    System.out.println(numbers2); // [-3, -2, -1]
}
```
- 2번의 코드는 중간에 boxed()를 추가한 것 말고는 1번의 코드와 모두 동일합니다.
    - boxed()는 박싱 타입으로 변환(int -> Integer)해주는 기능을 가지고 있습니다.
- 단지 박싱 타입으로 변환했을 뿐인데 서로 다른 결과가 발생하는 이유는 **매개변수의 수가 동일한 오버로딩으로 인해 발생할 수 있는 문제입니다.**

```java
// List에서 매개변수 수가 동일한 remove 메서드
boolean remove(Object o); // Integer의 경우 이 메서드가 호출될 것이다. (호출된 Integer값과 동일한 요소를 제거)
E remove(int index);      // int의 경우 이 메서드가 호출될 것이다. (호출된 int값의 인덱스에 위치한 요소를 제거)
```
>반환 타입은 메서드 파라미터에 포함되지 않기 때문에 반환 타입이 다르더라도 오버로딩 메서드로 취급될 수 있습니다.

### ExecutorService.submit
```java
@Test
void executorTest()throws Exception {
    final Thread thread = new Thread(System.out::println);

    final ExecutorService es = Executors.newCachedThreadPool();
    // es.submit(System.out::println); 컴파일 에러 발생
    es.submit((Runnable) System.out::println); // (Runnable)을 명시적으로 선언해줘야 한다.
}
```
- Thread 생성자와 ExecutorService.submit 메서드는 매개변수로 Runnable을 가지고 있습니다.
- 하지만 ExecutorService에서는 추가적으로 Callable을 받는 오버로딩 메서드도 정의되어 있습니다.
- 이로인해 컴파일러는 전달된 메서드 참조가 어떤 타입을 구현한 것인지 결정할 수 없으므로 명시적으로 타입 선언이 필요합니다. 

```java
// Executor Service submit 오버로딩 메서드
Future<?> submit(Runnable task);
<T> Future<T> submit(Callable<T> task);
```

## 결론
- 오버로딩 메서드와 오버라이딩 메서드가 결정되는 시점이 다른 것을 이해하고 있어야 이로 인해 발생할 수 있는 문제를 막을 수 있습니다.
- 오버로딩 메서드를 정의할 때 매개변수 수를 다르게 정의한다면 문제가 발생할 여지를 줄일 수 있습니다.
    - **매개변수 수가 같은 오버로딩 메서드들을 부득이 하게 사용한다면 정확한 결과를 얻기 위해 명시적으로 형변환을 해주는 것이 좋습니다.** 

### 참고자료
- [Effective Java 3/E](http://www.yes24.com/Product/Goods/65551284)