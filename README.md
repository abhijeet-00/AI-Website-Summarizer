# Website Summarizer

A simple Spring Boot app that takes a website URL and returns a short AI-generated summary.

## What it can do
- Accepts a URL through a REST endpoint
- Sends the URL to Groq's LLM API
- Generates a quick summary of the website in a few lines
- Works as a lightweight backend for AI-powered website understanding

Example endpoint:

GET /summarizer?url=https://example.com

This returns a summarized response based on the provided website.

## Tech stack
- Java 17
- Spring Boot
- Groq API integration

## Setup
1. Clone the project
2. Set the environment variable:
   `GROQ_API_KEY=your_api_key`
3. Run:
   `./mvnw spring-boot:run`

## Future scope
- Add a simple frontend for entering URLs and viewing results
- Improve summary quality by scraping page content before sending it to the AI
- Support multi-page website summaries and content extraction
- Add user history, saved summaries, and favorites
- Add language selection, tone options, and summary length controls
- Add async processing for large or slow websites
- Add validation for invalid URLs and error handling improvements

This is a good starting point for an AI-powered website summarization tool and can be expanded into a more complete research or productivity app.
