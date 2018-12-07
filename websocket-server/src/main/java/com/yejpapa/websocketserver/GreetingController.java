package com.yejpapa.websocketserver;

import com.yejpapa.websocketserver.domain.Greeting;
import com.yejpapa.websocketserver.domain.HelloMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.security.Principal;

@Slf4j
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Principal principal, HelloMessage message) throws Exception {
//        Thread.sleep(1000); // simulated delay
        log.debug("message : {}", message.getName());
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

    @MessageMapping("/hi")
    @SendToUser("/topic/greetings")
    public Greeting greetingToUser(Principal principal, HelloMessage message) {
        log.debug("message : {}", message.getName());
        return new Greeting("Hello, " + principal.getName() + "!");
    }

}
