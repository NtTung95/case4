package com.blogdemo.model.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @Column(unique = true, length = 50)
    @Size(min = 6, max = 32)
    @NotEmpty
    private String username;
    @Size(min = 6, max = 32)
    @NotEmpty
    private String password;
    @Size(min = 1, max = 10)
    @NotEmpty
    private String firstname;
    @Size(min = 1, max = 10)
    @NotEmpty
    private String lastname;
    @Email
    private String email;
    private String phoneNumber;
    @CreatedDate
    private Date createdDate;

    private Date lastLogin;
}
