package com.app.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
	@Entity
	@Table(name = "ledger")
	public class Ledger {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "ledger_id")
	    private int ledgerId;

	 

	private LocalDate ledgerCreatedDate;
	private double totalLoanAmount;
	private double payableAmountwithInterest;
	private int tenure;
	private double monthlyEMI;
	private double amountPaidtillDate;
	private double remainingAmount;
	private LocalDate nextEmiDatestart;
	private LocalDate nextEmiDateEnd;
	private int defaulterCount;
	private String previousEmitStatus;
	private String currentMonthEmiStatus;
	private LocalDate loanEndDate;
	private String loanStatus;
	


}
