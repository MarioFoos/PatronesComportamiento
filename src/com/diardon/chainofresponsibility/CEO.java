package com.diardon.chainofresponsibility;

public class CEO extends ExpenseHandler
{
	@Override
	public void handleExpense(double amount)
	{
		if(amount > 5000)
		{
			System.out.println("El CEO aprueba el gasto de $" + amount);
		}
	}
}
