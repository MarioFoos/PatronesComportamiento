package com.diardon.state;

public class HasCoinState implements VendingMachineState
{
	private VendingMachine machine;

	public HasCoinState(VendingMachine machine)
	{
		this.machine = machine;
	}
	@Override
	public void insertCoin()
	{
		System.out.println("Ya hay una moneda. Seleccione un producto.");
	}
	@Override
	public void selectProduct()
	{
		System.out.println("Producto seleccionado. Dispensando...");
		machine.setState(machine.getDispensingState());
	}
	@Override
	public void dispenseProduct()
	{
		System.out.println("Seleccione un producto primero.");
	}
}
