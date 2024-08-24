# Intro to Spring AI - Spring Boot Application

Welcome to the **Intro to Spring AI** repository! This project demonstrates the integration of AI capabilities within a Spring Boot application using the Spring AI framework. The application includes various controllers that interact with AI models for tasks such as chat generation, audio transcription, and image description.

## Repository Overview

This repository contains the source code for a Spring Boot application that introduces the following AI features:

- **Chat-based interactions**: Generate responses to user prompts.
- **Quiz generation**: Create quizzes based on specific topics.
- **Image description**: Describe the content of images.
- **Audio transcription**: Transcribe audio files into text.

## Key Controllers

### 1. AI Controller (`AiController`)

This controller is the core of the application, providing endpoints to interact with AI models. Below are the available endpoints:

#### `GET /api/v1/ai/test`

- **Description**: Generates a list of the top 5 best Java frameworks for building web applications in a minimal, list format.
- **Example Output**: A JSON list of frameworks ranked by popularity or relevance.

#### `GET /api/v1/ai/quiz/{topic}`

- **Description**: Generates a quiz question on a specified topic, including one correct answer and three incorrect answers.
- **Path Variable**: 
  - `topic` - The subject matter for the quiz question.
- **Example Output**: A JSON object containing the question and multiple-choice answers.

#### `GET /api/v1/ai/images/describe`

- **Description**: Analyzes and describes the content of provided images.
- **Example Output**: A text description of the images.
- **Image Files**: The images (`pancake.jpg`, `thumbnail.png`) are loaded from the classpath resources.

#### `GET /api/v1/ai/openai/transcribe`

- **Description**: Transcribes an audio file into text using the OpenAI transcription model.
- **Example Output**: A text transcript of the audio.
- **Audio File**: The audio file (`test-audio.m4a`) is loaded from the classpath resources.

## How to Run the Application

1. **Clone the repository:**
   ```sh
   git clone https://github.com/ghadyg/Intro-SpringAI.git

2. **Navigate to the project directory:**
   -cd "springAI\src\main\resources"
   -Open applications.property and replace ApiKey with your openAI key
   -return to springAI directory

3. **Build and run the application::**
   ./mvnw spring-boot:run


