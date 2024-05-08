package dev.langchain4j.example.aiservice;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(wiringMode = AiServiceWiringMode.EXPLICIT, chatModel = "explicitChatModel", tools = "assistantTools")
interface Assistant {

    @SystemMessage("You are a polite assistant")
    String chat(String userMessage);
}