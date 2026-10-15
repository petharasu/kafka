package consumer.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KeyBasedConsumer {
	 @KafkaListener(
		        topics = "customer-orders",
		        groupId = "group1"
		    )
		    public void consume(ConsumerRecord<String, String> record) {

		        String key = record.key();
		        String message = record.value();
		        int partition = record.partition();

		        System.out.println("Received Kafka Message");
		        System.out.println("Key       : " + key);
		        System.out.println("Value     : " + message);
		        System.out.println("Partition : " + partition);
		    }
}
