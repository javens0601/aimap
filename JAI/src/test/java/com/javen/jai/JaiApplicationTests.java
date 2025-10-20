package com.javen.jai;

import com.javen.jai.service.ChatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class JaiApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(JaiApplicationTests.class);
    @Autowired
    private ChatService chatService;

    @Test
    void contextLoads() {
    }

    @Test
    void chatTest1() {
        String content = chatService.call("你好");
        log.info("{}", content);
        Assertions.assertTrue(Objects.nonNull(content));
    }



}
