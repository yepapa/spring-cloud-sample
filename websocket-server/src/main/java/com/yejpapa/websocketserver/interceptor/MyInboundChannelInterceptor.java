package com.yejpapa.websocketserver.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;

@Slf4j
public class MyInboundChannelInterceptor implements ChannelInterceptor {
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {

        log.debug("preSend : {}", message);

        return message;
    }

    @Override
    public void postSend(Message<?> message, MessageChannel channel, boolean sent) {

        log.debug("postSend : {}", message);

    }

    @Override
    public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {

        log.debug("afterSendCompletion : {}", message);

    }

    @Override
    public boolean preReceive(MessageChannel channel) {

        log.debug("preReceive");

        return true;
    }

    @Override
    public Message<?> postReceive(Message<?> message, MessageChannel channel) {

        log.debug("postReceive : {}", message);

        return message;
    }

    @Override
    public void afterReceiveCompletion(Message<?> message, MessageChannel channel, Exception ex) {

        log.debug("afterReceiveCompletion : {}", message);

    }
}
