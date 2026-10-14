package com.practice.websitesummarizer.services;

import com.practice.websitesummarizer.dtos.GroqResponseDto;
import org.springframework.boot.restclient.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GroqAISumarrizerService implements AISumarrizerService {
    private final RestTemplate restTemplate;
    private final static String GROQ_URL = "https://api.groq.com/openai/v1/chat/completions";
    private final static String GROQ_API_KEY = System.getenv("GROQ_API_KEY");
    public GroqAISumarrizerService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    @Override
    public String sumarize(String url) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth(GROQ_API_KEY);
        Map<String, Object> request = new HashMap<>();
        Map<String, String> messageRequest1 = new HashMap<>();
        Map<String, String> messageRequest2 = new HashMap<>();
        request.put("model", "openai/gpt-oss-20b");
        request.put("reasoning_effort", "low");
        request.put("max_completion_tokens", 300);
        messageRequest1.put("role", "system");
        messageRequest1.put("content", "You are an AI summarizer which sees the user url and sumarrize the website in 3 lines and if its not a valid url return a good error response");
        messageRequest2.put("role", "user");
        messageRequest2.put("content", url);
        request.put("messages", List.of(messageRequest1, messageRequest2));

        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(request, httpHeaders);
        ResponseEntity<GroqResponseDto> response = restTemplate.postForEntity(GROQ_URL, httpEntity, GroqResponseDto.class);
        return response.getBody().getChoices().get(0).getMessage().getContent();
    }
}
