# Apache Poi
###### 공통서비스팀 기반서비스파트 조상묵 <br><br>

## 0. 목차
1. 간단한 Example 소스<br>
1.1. Docx 파일을 읽기<br>
1.2. Docx 파일에 덮어 쓰기<br>
1.3. Docx 파일에 이어 쓰기<br>
1.4. Xlsx 파일을 읽기<br>
2. 정리<br>
3. 참고<br>

## 1. 간단한 Example 소스
### 1.1. Docx 파일을 읽기
- [SimpleReadDocx](Apache_Poi/src/SimpleReadDocx.java)<br>
<br>

### 1.2. Docx 파일에 덮어 쓰기
- [SimpleWriteDocx](Apache_Poi/src/SimpleWriteDocx.java)<br>
<br>

### 1.3. Docx 파일에 이어 쓰기
- [SimpleAddWriteDocx](Apache_Poi/src/SimpleAddWriteDocx.java)<br>
<br>

### 1.4. Xlsx 파일을 읽기
- [SimpleReadXlsx](Apache_Poi/src/SimpleReadXlsx.java)<br>
<br><br>

## 2. 정리
- Poi는 Java와 Office 문서들을 연결해주는 라이브러리다. 
- 예를 들면 DB의 데이터를 Java JDBC를 통해 불러온 후, Poi를 이용해서 Excel 파일로 저장 하거나, 웹 페이지 상에 테이블을 그려줄 수도 있다. 더 나아가 웹 페이지 상에 나타난 글 혹은 테이블을 Excel, Word 파일로 다운받는 기능을 추가할 수 있다.
- DRM이 적용된 사내의 문서는 Poi를 사용하여 불러내려 할 경우, 오류가 발생한다.
- Word, Excel 위주로 사용해 보았는데 PPT를 사용하는 방법에 대한 학습이 필요하다.
- Poi의 Word와 관련된 기능을 [Java 예제 문제](https://github.com/ChoSangmuk-tsis/Problem) 풀이에 적용하였다. 
-> [적용결과](https://github.com/ChoSangmuk-tsis/Problem_Apache)
- Poi의 Excel과 관련된 기능을 Mini Project에 적용할 예정이다.
<br><br>

## 3. 참고
- https://poi.apache.org/
- https://ko.wikipedia.org/wiki/%EC%95%84%ED%8C%8C%EC%B9%98_POI
- https://www.youtube.com/watch?v=CCgcMGdKurw
- https://www.youtube.com/watch?v=sbBdj4zIMqY&t=1439s
- https://poi.apache.org/apidocs/dev/org/apache/poi/xwpf/extractor/XWPFWordExtractor.html
- https://poi.apache.org/apidocs/dev/org/apache/poi/ss/usermodel/Workbook.html
- https://m.blog.naver.com/PostView.nhn?blogId=heoguni&logNo=130169990216&proxyReferer=https%3A%2F%2Fwww.google.com%2F
- https://songjihyeon.tistory.com/25
- https://javaslave.tistory.com/79