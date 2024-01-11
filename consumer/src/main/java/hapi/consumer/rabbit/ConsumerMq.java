package hapi.consumer.rabbit;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMq {
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "hapi"),
            exchange = @Exchange(name = "HAPI",type = ExchangeTypes.DIRECT),
            key = {"red"}
    ))
    public void consumer(String ms){
        System.out.println(ms);
    }
}
