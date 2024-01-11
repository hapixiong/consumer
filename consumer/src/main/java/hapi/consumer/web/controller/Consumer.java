package hapi.consumer.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class Consumer {
    @GetMapping("/{id}")
    String getGoods(@PathVariable("id") Integer id){
        return id+":"+"洗发精";
    }
}
