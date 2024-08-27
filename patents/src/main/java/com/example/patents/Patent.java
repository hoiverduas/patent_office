package com.example.patents;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "patents")
public class Patent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patentId;
    private String patentNumber;
    private String inventorName;

    @ManyToOne
    @JoinColumn(name = "inventor_id")
    private Inventor inventor;

    @OneToMany(mappedBy = "patent")
    private Set<Purchase> purchases;

    @OneToMany(mappedBy = "patent")
    private Set<InventorContract> inventorContracts;

}
