package cn.example.helloworld.controller;

import cn.example.helloworld.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by longxianlin on 2016/12/30.
 */
@RestController
public class HelloRestController {

    @RequestMapping("/rest/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping("/rest/hello/{player}")
    public Message message(@PathVariable String player) {//REST Endpoint.

        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
}
