package com.javen.jai.service;

import org.springframework.ai.chat.prompt.Prompt;
import reactor.core.publisher.Flux;

/**
 * @Description
 * @Author: Javen
 * @CreateTime: 2025/10/19 23:51
 */
public interface ChatService {

    String call(String prompt);

    String call(Prompt prompt);

    Flux<String> stream(String prompt);

    Flux<String> stream(Prompt prompt);
}
