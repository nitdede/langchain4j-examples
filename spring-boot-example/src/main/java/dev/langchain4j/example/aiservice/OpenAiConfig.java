package dev.langchain4j.example.aiservice;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAiConfig {

    @Value("${langchain4j.open-ai.chat-model.api-key}")
    private String openAiKey;

    @Bean("explicitChatModel")
    public ChatLanguageModel explicitChatModel() {
        return  OpenAiChatModel.withApiKey(openAiKey);
                    }

}