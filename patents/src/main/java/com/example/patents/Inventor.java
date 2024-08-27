package com.example.patents;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "inventors")
public class Inventor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventorId;
    private String name;
    private String cedula;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "inventor")
    private Set<Patent> patents;

    @OneToMany(mappedBy = "inventor")
    private Set<Assistant> assistants;

}
