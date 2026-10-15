/*
 * package consumer.kafka.consumer.service;
 * 
 * import org.springframework.kafka.annotation.KafkaListener; import
 * org.springframework.stereotype.Service;
 * 
 * @Service public class ConsumerService {
 * 
 * @KafkaListener(topics = "orders", groupId = "group1") public void
 * consume(String message) { System.out.println("Consumer received: " +
 * message); } }
 */