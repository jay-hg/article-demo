package org.acai.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class LogTest {

    @PostConstruct
    public void log() {
        log.info("hello world!");
    }
}
