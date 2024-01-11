package hapi.producer.web.controller;

import hapi.producer.entity.User;
import hapi.producer.feignConfig.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class Producer {
    @Autowired
    Goods goods;

    @GetMapping("/{id}")
    User getUser(@PathVariable("id") Integer id){
        String goods = this.goods.getGoods(id);
        return new User(id,"张三","广州",goods);
    }
}
