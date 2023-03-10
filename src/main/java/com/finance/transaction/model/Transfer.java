package com.finance.transaction.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_transfer")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transfer")
    private Long id;

    @Column(name = "origin_account")
    private String originAccount;

    @Column(name = "destination_account")
    private String destinationAccount;

    @Column(name = "value_transfer")
    private double value;

    @Column(name = "date_transfer")
    private LocalDateTime dateTransfer;

    @Column(name = "date_scheduling")
    private LocalDateTime dateScheduling;
}
