package org.pawan.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userId;
    private String firstname;
    private String lastname;
    private String email;
    private Long departmentId;
}
