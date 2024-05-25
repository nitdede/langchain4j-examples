package dev.langchain4j.example.aiservice;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
class AssistantTools {

    /**
     * This tool is available to {@link Assistant}
     */
    @Tool
    String currentTime() {
        return LocalTime.now().toString();
    }

    @Tool
    int getAddition(int a, int b) {
        System.out.println("calling getAddinton");
        return a + b;
    }

    @Tool
    String getStringLength(String str) {
        System.out.println("calling getStringLength");
        return String.valueOf(str.length());
    }

}
