package com.diardon.chainofresponsibility;

public class Manager extends ExpenseHandler
{
	@Override
	public void handleExpense(double amount)
	{
		if(amount <= 1000)
		{
			System.out.println("El gerente aprueba el gasto de $" + amount);
		}
		else if(nextHandler != null)
		{
			nextHandler.handleExpense(amount);
		}
	}
}
