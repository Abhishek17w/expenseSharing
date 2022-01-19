package com.codedecode.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.Expense;
import com.codedecode.demo.entity.UserShare;
import com.codedecode.demo.service.ExpenseService;

@RestController
public class ExpenseController {
	
	@Autowired
    ExpenseService expenseService;
	
	@PostMapping("/createExpense")
	@ResponseBody
	public Expense createExpense(@RequestParam(name="expenseCreatorId") String expenseCreatorId,@RequestParam LocalDateTime expenseDate,@RequestParam String expenseStatus,@RequestParam int expense,@RequestParam List<String> expenseGroup, List userShareList) {
		
		System.out.println(expenseCreatorId + " " + expenseDate + " " + expenseStatus + " " + expense + " " + expenseGroup);
		Expense exp = new Expense(expenseCreatorId,expenseDate,expenseStatus,expense,expenseGroup);
		
		System.out.println(userShareList);
		return exp;
		//return expenseService.createExpense(exp);
	}
}
