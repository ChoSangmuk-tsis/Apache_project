# Apache Project
###### 공통서비스팀 기반서비스파트 조상묵 <br><br>

## 0. 목차
1. [왜 하필 Apache Project 인가?](#1-왜-하필-apache-project-인가)<br>
2. [어떠한 것들이 있을까?](#2-어떠한-것들이-있을까)<br>
3. [어떻게 쓸까?](#3-어떻게-쓸까)<br>
4. [Example로 보는 Apache Project.](#4-example로-보는-apache-project)<br>
5. [참고](#5-참고)<br>
<br>

## 1. 왜 하필 Apache Project 인가?
- 많고 많은 공부할 것들 중에 왜 하필 **`Apache Project`** 를 공부할까? 

**`Open Source`** 는 많은 사람들의 필요에 의해 생성되고 수정되는 과정을 거친다. 이러한 특징은 해당 기능의 신뢰성을 높여주며, 필요한 부분을 일일히 구현해야하는 번거로움을 줄여주어 시간을 절약해준다. 그 중에서도 **`Apache Project`** 는 Apache Software Foundation에 의해 관리되며 많은 검증된 기능을 제공한다. 결정적으로 맡아야 할 업무 중 일부에 사용되고 있다.
<br><br>

## 2. 어떠한 것들이 있을까?
- **`Apache Project`** 의 목록은 [여기](https://www.apache.org/index.html#projects-list)에서 확인할 수 있다. 많은 Project들 중, **`ActiveMQ, Jexl, Poi`** 에 대해 다룰 것이다.
<br>

- **`ActiveMQ`** : 가장 널리 사용되는 오픈 소스, Java 기반 메시징 서버입니다. **`서버의 중간에서 큐를 이용하여 메세지를 전달하는 역활을 합니다.`**
<br>

- **`Jexl`** : "Java EXpression Language"의 약자로 Commons Project의 일부입니다. Java로 작성된 응용 프로그램 및 프레임 워크에서 동적 및 스크립팅 기능의 구현을 용이하게 하기위한 라이브러리입니다. Jexl은 쉘 스크립트에서 볼 수 있는 대부분의 구문을 지원하는 Jstl 표현 언어에 대한 확장을 기반으로 표현 언어를 구현합니다. 즉, **`Java에서 expression language의 작성 및 동작할 수 있게끔 합니다.`**
<br>

- **`Poi`**  : "Poor Obfuscation Implementation"의 약자로 Office Open XML 표준 및 Microsoft의 Office를 기반으로 다양한 파일 형식을 조작하기위한 Java API를 만들고 유지 관리하는 것입니다. 즉, **`Java를 사용하여 MS Excel, MS Word 및 MS PowerPoint 파일을 읽고 쓸 수 있습니다. `**
<br><br>

## 3. 어떻게 쓸까?
- 방법1. 해당 소스를 다운받고 Build Path에 해당 프로젝트의 소스파일을 추가합니다.<br>
- 방법2. pom.xml 파일에 dependency를 추가합니다. dependency는 [여기](https://mvnrepository.com/)에서 검색을 통해 추가할 수 있습니다.<br>
```xml
<!--예시-->
	<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-jexl -->
	<dependency>
	    <groupId>org.apache.commons</groupId>
	    <artifactId>commons-jexl</artifactId>
	    <version>2.1.1</version>
	</dependency>
```
<br><br>

## 4. Example로 보는 Apache Project.
- [ActiveMQ](ActiveMQ)
- [Jexl](Jexl)
- [Poi](Poi)
<br><br>

## 5. 참고
- https://www.apache.org/
- https://gyrfalcon.tistory.com/entry/Apache-Commons-Library 