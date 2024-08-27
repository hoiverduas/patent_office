package com.example.patents;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "AssistantContracts")
public class AssistantContract {

         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private int assistantContractId;
         private LocalDate assistantContractDate;
         @ManyToOne
         @JoinColumn(name = "assistant_id")
         private Assistant assistant;

         @ManyToOne
         @JoinColumn(name = "company_id")
         private Company company;

}
