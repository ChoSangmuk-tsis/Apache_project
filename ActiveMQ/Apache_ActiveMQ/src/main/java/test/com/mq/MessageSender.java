package test.com.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageSender {
     
	//default URL을 사용하게된다. 여기서는 localhost:8161 
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
     
    // 메세지 큐의 이름을 설정하며 어떠한 이름도 사용가능하다.
    private static String subject = "Test"; 
     
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
         
        // 메세지를 보내는 역을 한다.
        MessageProducer producer = session.createProducer(destination);
         
        //server로 보낼 메세지를 설정한다.
        TextMessage message = session
                .createTextMessage("Hello !!! Welcome to the world of ActiveMQ.");
         
        // 메세지를 전송한다.
        producer.send(message);
         
        System.out.println("JCG printing@@ '" + message.getText() + "'");
        connection.close();
    }
}