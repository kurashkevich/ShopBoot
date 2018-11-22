package com.completeboot.course.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class User {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String email;
}
