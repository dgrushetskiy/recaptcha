package ru.gothmog.recaptcha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "last_name", length = 50)
    private String lastName;

    @NotEmpty
    @Size(max = 128)
    @Column(name = "email", length = 128)
    private String email;

    @NotEmpty
    @Size(max = 60)
    @JsonIgnore
    @Column(name = "password", length = 60)
    private String password;

    @Transient
    @JsonIgnore
    private String confirmPassword;
}
