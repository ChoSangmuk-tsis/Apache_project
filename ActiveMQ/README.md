# Apache ActiveMQ
###### 공통서비스팀 기반서비스파트 조상묵 <br><br>

## 0. 목차
1. 간단한 Example 소스<br>
1.1. MQ에 매세지 보내기<br>
1.2. MQ에서 메세지 읽기<br>
2. 정리<br>
3. 참고<br>

## 1. 간단한 Example 소스
### 1.1. MQ에 매세지 보내기
- [MessageSender](Apache_ActiveMQ/src/main/java/test/com/mq/MessageSender.java)<br>
<br>

### 1.2. MQ에서 메세지 읽기
- [MessageReceiver](Apache_ActiveMQ/src/main/java/test/com/mq/MessageReceiver.java)<br>
<br>

## 2. 정리
- ActiveMQ은 다른 Project들과는 다르게 설치파일이 존재하며 이를 통해 PC에 ActiveMQ용 서버를 실행시킬 수 있다.<br>
- sender로 부터 메세지를 수령하고, 이를 reciver에게 전달한다. 이를 통해서 두 서버간에 지속적인 연락이 아닌 비동기 방식으로 통신을 할 수 있을 것 같다.
- 서버 실행시, 이를 모니터링할 수 있는 페이지를 제공한다.<br>
- 실행시 기본 포트 번호는 61616 혹은 8161이다.<br>
- ActiveMQ를 이용하여 일괄처리 혹은 웹 상에서 세마포어(?)를 구현할 수 있을 것 같다.<br>

## 3. 참고
- https://activemq.apache.org/
- https://swiftymind.tistory.com/9
- https://examples.javacodegeeks.com/enterprise-java/jms/apache-activemq-hello-world-example/
