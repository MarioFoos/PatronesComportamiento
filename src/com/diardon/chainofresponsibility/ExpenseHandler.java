package com.diardon.chainofresponsibility;

/**
 * Interfaz Handler: Define el contrato com�n
 */
public abstract class ExpenseHandler
{
	protected ExpenseHandler nextHandler;

	public void setNextHandler(ExpenseHandler nextHandler)
	{
		this.nextHandler = nextHandler;
	}
	public abstract void handleExpense(double amount);
}
