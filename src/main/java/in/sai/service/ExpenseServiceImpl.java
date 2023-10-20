package in.sai.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sai.entity.Expense;
import in.sai.repo.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	  @Autowired
	    private ExpenseRepository expenseRepository;

	    @Override
	    public List<Expense> getAllExpenses() {
	        return (List<Expense>) expenseRepository.findAll();
	    }

	    @Override
	    public Expense createExpense(Expense expense) {
	        return expenseRepository.save(expense);
	    }
}