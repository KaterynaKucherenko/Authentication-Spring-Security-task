package com.mjc.school.service.dto;



import java.time.LocalDateTime;


public record CommentDtoResponse (
    Long id,
     String content,
    String created,
    String modified,
    Long newsId){}

