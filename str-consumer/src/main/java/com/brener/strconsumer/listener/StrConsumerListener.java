package com.brener.strconsumer.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    // Informa que a mensagem foi lida no topic
    @KafkaListener(groupId = "group-0", topics = "str-topic", containerFactory = "strContainerFactory")
    public void create(String message) {
        log.info("CREATE ::: Receive message {}", message);
    }

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
    public void log(String message) {
        log.info("LOG ::: Receive message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "strContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Receive message {}", message);
    }
}