package com.javen.jai.config;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Description
 * @Author: Javen
 * @CreateTime: 2025/10/20 00:13
 */
@Configuration
public class ChatModelConfig {

    //@Bean
    //@Primary
    public ChatModel chatModel(OpenAiChatModel chatModel) {
        return chatModel;
    }

    @Bean
    @Primary
    public ChatModel chatModel(OllamaChatModel chatModel) {
        return chatModel;
    }
}
