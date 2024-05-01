package com.blogbackend.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 3, message = "title should be atleast 3 characters")
    private String title;
    @NotEmpty
    @Size(min = 3,message = "Description should be atleast 3 characters ")
    private String description;

    private String content;
}
