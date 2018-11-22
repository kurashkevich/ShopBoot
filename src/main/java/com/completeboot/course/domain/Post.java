package com.completeboot.course.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Post {
    private String title;
    private String body;
    private Date posted;
    private String author;

    @Override public String toString() {
        return "Post{" + "title='" + title + '}';
    }
}
