
package com.expensetracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensetracker.backend.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
