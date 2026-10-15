package producer.kafka.producer.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import producer.kafka.producer.dto.KeysRequest;
import producer.kafka.producer.service.KeyBasedService;
import producer.kafka.producer.service.Orderservice;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	OrderController(Orderservice orderControllobj,KeyBasedService keybaseobj){
		this.Orderserviceobject=orderControllobj;
		this.keybaseserviceobj=keybaseobj;
		
	}
	
	private final Orderservice Orderserviceobject;
	private final KeyBasedService keybaseserviceobj;
	
	@PostMapping("/{name}")
    public String send(@PathVariable String name){

		Orderserviceobject.sendMessage(name);

        return "Message Published";
    }
	
	@PostMapping("/keybase")
    public String sendwithKey(@RequestBody KeysRequest request){

		keybaseserviceobj.sendMessageKey(request);

        return "message sent to kafka-key based";
    }
	
}
