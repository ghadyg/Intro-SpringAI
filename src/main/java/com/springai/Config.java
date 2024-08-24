package com.springai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.api.OpenAiAudioApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${spring.ai.openai.api-key}")
    private String openAiApiKey;

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder.build();
    }

    @Bean
    public OpenAiAudioApi openAiAudioApi() {
        return new OpenAiAudioApi(openAiApiKey);
    }

}
