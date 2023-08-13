package com.arsilva.fstodobackend.models;

import com.arsilva.fstodobackend.enumerations.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "person")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String name;
    private String password;
    private Profile profile;
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Todo> tasks;
}
