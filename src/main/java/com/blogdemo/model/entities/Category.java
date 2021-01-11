package com.blogdemo.model.entities;

import lombok.Data;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 100)
    @NotEmpty
    @Column(unique = true, nullable = false, length = 100)
    private String name;

}
