package hapi.producer.feignConfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("consumer")
public interface Goods {
    @GetMapping("/consumer/{id}")
    String getGoods(@PathVariable("id") Integer id);
}
