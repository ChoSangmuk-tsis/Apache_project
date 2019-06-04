# Apache Project Jexl
###### 공통서비스팀 기반서비스파트 조상묵 <br><br>

## 0. 목차
1. [개요](#1-개요)<br>
    1.1. [목적](#11-목적)<br>
2. [Jexl](#2-Jexl)<br>
    2.0. [사전 지식](#20-사전-지식)<br>
    2.1. [개념](#21-개념)<br>
    2.2. [사용방법](#22-사용방법)<br>
3. [정리 및 참고](#3-정리-및-참고)<br>
    3.1. [정리](#31-정리)<br>
    3.2. [참고](#32-참고)<br>
<br>

## 1. 개요
#### 1.1. 목적
- 이 프로젝트는 **`Apache Project Jexl`** 학습 산출물 관리를 위한 프로젝트입니다.
<br><br>

## 2. Jexl
#### 2.0. 사전 지식
- Html : Html 은 정적인 웹피이지의 형태를 보여준다.
- JSP : Html 에 자바 코드
- JSTL : XML 데이터 처리와 조건문, 반복문 같은 일을 처리하기 위한 JSP 태그 라이브러리. JSP에서 자바의 각종 기능을 태그형태로 사용할 수 있도록 정의해서 사용할 수 있는 것을 말합니다.

```html
<%String name = request.getParameter("name");%>
```
기존에 사용하던 대신 위의 코드 대신 아래와 같이 사용할 수 있습니다.
```html
<body>
당신의 이름은 ${param.name } 입니다! 
</body>
```

#### 2.1. 개념
- **`Jexl`** 는 "Java EXpression Language"의 약자로 Commons Project의 일부입니다. Java로 작성된 응용 프로그램 및 프레임 워크에서 동적 및 스크립팅 기능의 구현을 용이하게 하기위한 라이브러리입니다. Jexl은 쉘 스크립트에서 볼 수 있는 대부분의 구문을 지원하는 Jstl 표현 언어에 대한 확장을 기반으로 표현 언어를 구현합니다. 즉, **`Java에서 쉘 스크립트를 작성 및 동작할 수 있게끔 합니다.`**
<br><br>

#### 2.2. 사용방법
- [소스코드](Apache_JEXL/src/test/sample6.java)에 주석을 통해 각 부분에 대한 설명을 작성하였습니다.
<br><br>

## 3. 정리 및 참고
#### 3.1. 정리
- Jexl은 Java 내에서 쉘 스크립트 언어의 사용을 가능하게끔 해주는 라이브러리이다.
- 활용도를 고려하여 Mini Project에 적용할 예정이다.
<br><br>

#### 3.2. 참고
- 메인 참고 : http://commons.apache.org/proper/commons-jexl/
- https://www.youtube.com/watch?v=mmxRZZzxvBI
- https://m.blog.naver.com/PostView.nhn?blogId=eemmjj2k&logNo=140195657917&proxyReferer=https%3A%2F%2Fwww.google.com%2F

<br><br>