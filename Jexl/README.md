# Apache Jexl
###### 공통서비스팀 기반서비스파트 조상묵 <br><br>

## 0. 목차
1. 간단한 Example 소스<br>
1.1. 일반적인 연산<br>
1.2. 변수사용<br>
1.3. 문자열의 길이<br>
1.4. 숫자 변환<br>
1.5. 사용자 정의 class 와 method<br>
1.6. 기타<br>
2. 정리<br>
3. 참고<br>

## 1. 간단한 Example 소스
### 1.1. 일반적인 연산
- [Sample1](Apache_JEXL/src/test/sample1.java)<br>
<br>

### 1.2. 변수사용
- [Sample2](Apache_JEXL/src/test/sample2.java)<br>
<br>

### 1.3. 문자열의 길이
- [Sample3](Apache_JEXL/src/test/sample3.java)<br>
<br>

### 1.4. 숫자 변환
- [Sample4](Apache_JEXL/src/test/sample4.java)<br>
<br>

### 1.5. 사용자 정의 class 와 method
- [Sample5](Apache_JEXL/src/test/sample5.java)<br>
<br>

### 1.6. 기타
- [Sample6](Apache_JEXL/src/test/sample5.java)<br>
<br>

## 2. 정리
- Html : Html 은 정적인 웹피이지의 형태를 보여준다.
- JSP : Html 에 자바 코드가 더해진 형태
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
- JEXL : JEXL은 이러한 expression language를 Java 안에서 사용하게 끔해주는 오픈 소스입니다. 
<br><br>

## 3. 참고
- http://commons.apache.org/proper/commons-jexl/
- https://www.youtube.com/watch?v=mmxRZZzxvBI
- https://m.blog.naver.com/PostView.nhn?blogId=eemmjj2k&logNo=140195657917&proxyReferer=https%3A%2F%2Fwww.google.com%2F