package com.javen.jai.service.impl;

import com.javen.jai.service.ChatService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.DefaultChatClientBuilder;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @Description
 * @Author: Javen
 * @CreateTime: 2025/10/19 23:52
 */
@Service
public class ChatServiceImpl implements ChatService {
    private final ChatClient.Builder builder;

    public ChatServiceImpl(@Autowired ChatClient.Builder builder) {
        this.builder = builder;
    }

    @Override
    public String call(String prompt) {
        ChatClient client = builder.build();
        String content = client.prompt(prompt)
                .call()
                .content();
        return content;
    }

    @Override
    public String call(Prompt prompt) {
        return "";
    }

    @Override
    public Flux<String> stream(String prompt) {
        return null;
    }

    @Override
    public Flux<String> stream(Prompt prompt) {
        return null;
    }
}
