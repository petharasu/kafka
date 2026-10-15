package producer.kafka.producer.dto;

import org.springframework.stereotype.Component;

@Component
public class KeysRequest {
	
	private String customerId;
	private String message;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
