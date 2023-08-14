package com.arsilva.fstodobackend.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class UserDto {
    private String name;
    private String login;
    private String password;
    private Integer profile;
}
