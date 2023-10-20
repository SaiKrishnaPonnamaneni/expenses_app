package in.sai.service;

import java.util.List;

import in.sai.entity.Expense;

public interface ExpenseService {
	 public List<Expense> getAllExpenses();
	 public Expense createExpense(Expense expense);

}
