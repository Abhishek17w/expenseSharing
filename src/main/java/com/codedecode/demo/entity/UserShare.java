package com.codedecode.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserShare {
	
	@Id
	private String id;
	private String expenseId;
	private String userId;
	private int share;
	private List<Contribution> contributions;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getShare() {
		return share;
	}
	public void setShare(int share) {
		this.share = share;
	}
	public List<Contribution> getContributions() {
		return contributions;
	}
	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}
	
}
