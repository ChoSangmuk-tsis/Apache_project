package test.com.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
 
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
 
public class MessageReceiver {

	//default URL을 사용하게된다. 여기서는 localhost:8161 
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

    // 메세지 큐의 이름을 설정하며 어떠한 이름도 사용가능하다.
    private static String subject = "JCG_QUEUE";
 
    public static void main(String[] args) throws JMSException {
    	//ActiveMQ 와 연결하는 ConnectionFactory,Connection 을 생성하고 시작한다.
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        //session을 생성한다.
        Session session = connection.createSession(false,
                Session.AUTO_ACKNOWLEDGE);

        // 목적지는 새로 생성된 "Test"라는 Queue가 된다.
        Destination destination = session.createQueue(subject);
 
        // MessageConsumer 즉, receive를 만든다.
        MessageConsumer consumer = session.createConsumer(destination);
 
        // 메세지를 받아온다.
        Message message = consumer.receive();
 
        // message 가 TextMessage 객체라면 .getText() 메소드를 통해 해당 메세지를 출력한다.
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            System.out.println("Received message '" + textMessage.getText() + "'");
        }
        connection.close();
    }
}