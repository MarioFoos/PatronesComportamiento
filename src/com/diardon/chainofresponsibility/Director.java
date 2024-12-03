package com.diardon.chainofresponsibility;

public class Director extends ExpenseHandler
{
	@Override
	public void handleExpense(double amount)
	{
		if(amount <= 5000)
		{
			System.out.println("El director aprueba el gasto de $" + amount);
		}
		else if(nextHandler != null)
		{
			nextHandler.handleExpense(amount);
		}
	}
}
