package com.mjc.school.service.dto;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public record AuthorDtoRequest (

    @NotNull
    @Size(min = 3, max = 15)
    String name){



}