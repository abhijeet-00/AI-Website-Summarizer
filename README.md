# Website Summarizer

A learning-focused Spring Boot project for building AI-powered website understanding features.

## What it does today
- Exposes a simple REST endpoint to summarize a URL
- Sends the URL to a Groq-hosted LLM
- Returns a short AI-generated summary

Example:

GET /summarizer?url=https://example.com

## Current architecture
This project is intentionally simple and acts as a starting point for learning AI integration in Java.

Current flow:
- Spring Boot controller receives a URL
- AI service calls Groq Chat Completions API
- Model generates a summary
- Response is returned directly to the client

## Tech stack
- Java 17
- Spring Boot
- Groq API integration

## Setup
1. Clone the project
2. Set your environment variable:
   `GROQ_API_KEY=your_api_key`
3. Run:
   `./mvnw spring-boot:run`

## Learning roadmap
This repo is meant to evolve step by step toward a real AI application pipeline.

Planned phases:
- Improve URL validation and error handling
- Extract and clean real webpage text instead of sending only the URL
- Add prompt templates and structured responses
- Add text chunking and retrieval
- Add embeddings and vector storage
- Build a simple RAG-based Q&A flow
- Add async job processing and observability

## Why this project matters
This is not a production AI system yet. It is a practical sandbox for learning:
- LLM API integration in Java
- prompting and output control
- grounding answers in real content
- retrieval-based AI patterns
- how AI systems are designed in real projects

This app is a good base for learning how to move from a single LLM call to a real AI workflow.
