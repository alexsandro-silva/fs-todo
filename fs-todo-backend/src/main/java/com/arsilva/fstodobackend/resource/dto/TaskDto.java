package com.arsilva.fstodobackend.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class TaskDto {
    private String title;
    private String description;
    private Date targetDate;
    private Date creationDateTime;
    private boolean completed;
    private Long userId;
}
