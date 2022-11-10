package com.springboot.firstdto.domain;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name ="users")
public class User {
    @Id
    //PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String email;
    @Column(name="First_Name")
    private String firstName;
    @Column(name="Last_Name")
    private String lastName;
    private String password;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
   @JoinColumn(name = "location_id")
    private Location location;

}
