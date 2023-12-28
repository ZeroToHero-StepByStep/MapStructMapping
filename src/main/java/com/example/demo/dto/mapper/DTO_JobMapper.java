package com.example.demo.dto.mapper;


import com.example.demo.domain.DM_Job;
import com.example.demo.dto.DTO_Job;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring", uses = {DTO_JobCategoryMapper.class})

public interface DTO_JobMapper {

    @Mapping(source = "createdTime", target = "createdTime", qualifiedByName = "formatCreatedTime")
    @Mapping(source = "jobCategory", target = "jobCategory", qualifiedByName = "toDtoJobCategory")
    DTO_Job toDTO(DM_Job job);

    @Named("formatCreatedTime")
    default String formatCreatedTime(LocalDateTime createdTime) {
        // Your formatting logic...
        return "Formatted Time"; // Simplified for example
    }
}
