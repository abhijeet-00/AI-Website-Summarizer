package com.practice.websitesummarizer.controllers;

import com.practice.websitesummarizer.services.AISummarizerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/summarizer")
public class WebsiteSummarizerController {
    private final AISummarizerService aiSummarizerService;

    public WebsiteSummarizerController(AISummarizerService aiSummarizerService) {
        this.aiSummarizerService = aiSummarizerService;
    }
    @GetMapping
    public String summarizeWebsite(@RequestParam String url) {
        return aiSummarizerService.summarize(url);
    }
}
