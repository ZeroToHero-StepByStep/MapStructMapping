package com.example.demo.dto;

public enum DTO_JobCategory {
    EXAMPLE("Example");
    private final String displayName;
    DTO_JobCategory(String displayName) {
        this.displayName = displayName;
    }
    // Getters and other methods...
}