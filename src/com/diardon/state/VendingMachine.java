package com.diardon.state;

public class VendingMachine
{
	private VendingMachineState idleState;
	private VendingMachineState hasCoinState;
	private VendingMachineState dispensingState;

	private VendingMachineState currentState;

	public VendingMachine(){
		idleState = new IdleState(this);
		hasCoinState = new HasCoinState(this);
		dispensingState = new DispensingState(this);
		currentState = idleState; // Estado inicial
	}

	public void setState(VendingMachineState state)
	{
		currentState = state;
	}

	public void insertCoin()
	{
		currentState.insertCoin();
	}

	public void selectProduct()
	{
		currentState.selectProduct();
	}

	public void dispenseProduct()
	{
		currentState.dispenseProduct();
	}

	public VendingMachineState getIdleState()
	{
		return idleState;
	}

	public VendingMachineState getHasCoinState()
	{
		return hasCoinState;
	}

	public VendingMachineState getDispensingState()
	{
		return dispensingState;
	}
}
