package com.diardon.state;

public class IdleState implements VendingMachineState
{
	private VendingMachine machine;

	public IdleState(VendingMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertCoin()
	{
		System.out.println("Moneda insertada. Puede seleccionar un producto.");
		machine.setState(machine.getHasCoinState());
	}

	@Override
	public void selectProduct()
	{
		System.out.println("Inserte una moneda primero.");
	}

	@Override
	public void dispenseProduct()
	{
		System.out.println("No se puede dispensar sin seleccionar un producto.");
	}
}