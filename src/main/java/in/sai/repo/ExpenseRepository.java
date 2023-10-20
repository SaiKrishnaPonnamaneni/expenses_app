package in.sai.repo;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sai.entity.Expense;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Serializable>{

}
