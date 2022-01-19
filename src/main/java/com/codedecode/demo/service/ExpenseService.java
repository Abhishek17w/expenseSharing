package com.codedecode.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecode.demo.entity.Expense;
import com.codedecode.demo.entity.User;
import com.codedecode.demo.repository.ExpenseRepository;
import com.codedecode.demo.repository.UserRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepo;
	
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
}
