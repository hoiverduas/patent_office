package com.example.patents;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Companies")
public class Company {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int CompanyId;
       private String companyCode;
       private String name;
       private String address;
       private String phoneNumber;

       @OneToMany(mappedBy = "company")
       private Set<Purchase> purchases;

       @OneToMany(mappedBy = "company")
       private Set<InventorContract> contratosInventor;

       @OneToMany(mappedBy = "company")
       private Set<AssistantContract> contratosAyudante;

}
