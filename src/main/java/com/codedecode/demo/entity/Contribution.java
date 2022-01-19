package com.codedecode.demo.entity;

import java.time.LocalDateTime;

public class Contribution {
	
	private String contributionId;
	private String transactionId;
	private String contributionValue;
	private LocalDateTime contributionDate;
	private String transactionDescription;
	
	public String getContributionId() {
		return contributionId;
	}
	public void setContributionId(String contributionId) {
		this.contributionId = contributionId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getContributionValue() {
		return contributionValue;
	}
	public void setContributionValue(String contributionValue) {
		this.contributionValue = contributionValue;
	}
	public LocalDateTime getContributionDate() {
		return contributionDate;
	}
	public void setContributionDate(LocalDateTime contributionDate) {
		this.contributionDate = contributionDate;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	
}
