package io.springboot.netty.service.impl;

import io.springboot.netty.service.DiscardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DiscardServiceImpl implements DiscardService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DiscardServiceImpl.class);

    public void discard (String message) {
        LOGGER.info("丢弃消息:{}", message);
    }
}
