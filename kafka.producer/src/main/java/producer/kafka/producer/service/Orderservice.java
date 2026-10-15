package producer.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Orderservice {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public Orderservice(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String message) {
		var result = kafkaTemplate.send("orders", message);
		IO.println("result from counsumer " + result);
		IO.println("Message Sent : " + message);
	}

}
