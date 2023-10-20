package in.sai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.sai.entity.Expense;
import in.sai.service.ExpenseService;

@RestController

public class ExpenseController {
	 @Autowired
	    private ExpenseService expenseService;

	    @GetMapping
	    public List<Expense> getAllExpenses() {
	        return expenseService.getAllExpenses();
	    }

	    @PostMapping
	    public ResponseEntity<Expense> createExpense(@RequestBody Expense expense) {
	        Expense createdExpense = expenseService.createExpense(expense);
	        return new ResponseEntity<>(createdExpense, HttpStatus.CREATED);
	    }
	    // Other CRUD operations can be added here
	}
	








