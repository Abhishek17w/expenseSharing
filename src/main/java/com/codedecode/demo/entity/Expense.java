package com.codedecode.demo.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="expense")
public class Expense {
	
	@Id
	private String id;
	private String expenseCreatorId;
	private LocalDateTime expenseDate;
	private String expenseStatus;
	private int expense;
	private List<String> expenseGroup;
	
	public Expense(String expenseCreatorId, LocalDateTime expenseDate, String expenseStatus, int expense,
			List<String> expenseGroup) {
		super();
		//this.id = id;
		this.expenseCreatorId = expenseCreatorId;
		this.expenseDate = expenseDate;
		this.expenseStatus = expenseStatus;
		this.expense = expense;
		this.expenseGroup = expenseGroup;
	}
	public String getExpenseId() {
		return id;
	}
	public void setExpenseId(String expenseId) {
		this.id = expenseId;
	}
	public String getExpenseCreator() {
		return expenseCreatorId;
	}
	public void setExpenseCreator(String expenseCreatorId) {
		this.expenseCreatorId = expenseCreatorId;
	}
	public LocalDateTime getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(LocalDateTime expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getExpenseStatus() {
		return expenseStatus;
	}
	public void setExpenseStatus(String expenseStatus) {
		this.expenseStatus = expenseStatus;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public List<String> getExpenseGroup() {
		return expenseGroup;
	}
	public void setExpenseGroup(List<String> expenseGroup) {
		this.expenseGroup = expenseGroup;
	}
	
	
}
