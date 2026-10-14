package com.practice.websitesummarizer.controllers;

import com.practice.websitesummarizer.services.AISumarrizerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sumarrize")
public class WebsiteSumarrizerController {
    private final AISumarrizerService aiSumarrizerService;

    public WebsiteSumarrizerController(AISumarrizerService aiSumarrizerService) {
        this.aiSumarrizerService = aiSumarrizerService;
    }
    @GetMapping("/{url}")
    public String summarizeWebsite(@PathVariable String url) {
        return aiSumarrizerService.sumarize(url);
    }
}
