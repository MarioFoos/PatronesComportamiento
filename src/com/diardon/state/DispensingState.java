package com.diardon.state;

public class DispensingState implements VendingMachineState
{
	private VendingMachine machine;

	public DispensingState(VendingMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertCoin()
	{
		System.out.println("Espere a que el producto sea dispensado.");
	}

	@Override
	public void selectProduct()
	{
		System.out.println("Ya se está dispensando un producto.");
	}

	@Override
	public void dispenseProduct()
	{
		System.out.println("Producto dispensado. Volviendo al estado inicial.");
		machine.setState(machine.getIdleState());
	}
}
