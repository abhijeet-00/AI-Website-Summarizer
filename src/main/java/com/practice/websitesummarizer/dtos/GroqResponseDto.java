package com.practice.websitesummarizer.dtos;

import lombok.Data;

import java.util.List;

@Data
public class GroqResponseDto {
    private List<Choice> choices;
}
