package consumer.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ConsumerService {
	private static final Logger log =
	        LoggerFactory.getLogger(ConsumerService.class);
	@PostConstruct
	public void init() {
	    log.info("ConsumerService bean initialized");
	}
	@KafkaListener(topics = "orders", groupId = "group1")
	public void consume(String message) {
		
		log.info("Message received from Kafka: {}", message);

	    try {
	        // Your business logic goes here
	        log.info("Message processed successfully: {}", message);

	    } catch (Exception e) {
	        log.error("Error processing Kafka message: {}", message, e);
	        throw e;
	    }
	}

}
