package com.example.patents;

import jakarta.persistence.*;

@Entity
@Table(name = "assistants")
public class Assistant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int assistantId;
    private String name;
    private String address;
    private String phoneNumber;
    private String cedula;
    @ManyToOne
    @JoinColumn(name = "inventor_id")
    private Inventor inventor;
}
