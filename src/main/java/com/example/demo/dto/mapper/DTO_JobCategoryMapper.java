package com.example.demo.dto.mapper;

import com.example.demo.domain.DM_JobCategory;
import com.example.demo.dto.DTO_JobCategory;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface DTO_JobCategoryMapper {

    @Named("toDtoJobCategory")
    default DTO_JobCategory toDTO(DM_JobCategory category) {
        // Your conversion logic...
        return DTO_JobCategory.EXAMPLE; // Simplified for example
    }
}
