package com.springai;

import java.util.List;

public record quiz(
        String question,
        String rightAnswer,
        List<String> wrongAnswers
        ) { }
