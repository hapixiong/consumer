package hapi.producer.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducerMq {
    @Autowired
    RabbitTemplate rabbitTemplate;
    public void add(){
        rabbitTemplate.convertAndSend("HAPI","red","123");
    }
}
