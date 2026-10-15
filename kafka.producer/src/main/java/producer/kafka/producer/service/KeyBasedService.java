package producer.kafka.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import producer.kafka.producer.dto.KeysRequest;

@Service
public class KeyBasedService {
	private final KafkaTemplate<String, String> kafkaTemplate;

	public KeyBasedService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessageKey(KeysRequest request) {
		kafkaTemplate.send(
	            "customer-orders",
	            request.getCustomerId(),
	            request.getMessage()
	        );

	        System.out.println(
	            "Message sent | Key: " + request.getCustomerId()
	            + " | Value: " + request.getMessage()
	        );
	}

}
