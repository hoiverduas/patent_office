package com.example.patents;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "inventorContracts")
public class InventorContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;
    private LocalDate contractDate;
    @ManyToOne
    @JoinColumn(name = "patent_id")
    private Patent patent;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "inventor_id")
    private Inventor inventor;

}
