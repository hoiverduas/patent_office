package com.example.patents;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchaseId;
    private LocalDate purchaseDate;
    @ManyToOne
    @JoinColumn(name = "patent_id")
    private Patent patent;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;


}
