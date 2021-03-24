package io.springboot.netty.service;

import org.springframework.stereotype.Service;

@Service
public interface DiscardService {

	void discard (String message);
}
