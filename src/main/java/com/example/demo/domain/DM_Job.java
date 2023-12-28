package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DM_Job {
    private LocalDateTime createdTime;
    private DM_JobCategory jobCategory;



    // Getters and setters...
}

