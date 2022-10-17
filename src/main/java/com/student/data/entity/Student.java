package com.student.data.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "studentDetails")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private Long id;

    @Column(name = "first_name", nullable = false)
    @NonNull private String firstName;

    @Column(name = "last_name", nullable = false)
    @NonNull private String lastName;

    @Column(name = "email", nullable = false)
    @NonNull private String emailId;

}
