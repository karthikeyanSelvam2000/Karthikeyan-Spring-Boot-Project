package com.example.alert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AlertFirstModel {
    private Integer id;
    private String student_name;
    private Integer age;
    private int created_by;
    private LocalDateTime created_on;
    private int updated_by;
    private LocalDateTime updated_on;
    private Boolean delete_flag;
}
