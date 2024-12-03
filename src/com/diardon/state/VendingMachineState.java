package com.diardon.state;

/**
 * Interfaz State: Define los métodos comunes a todos los estados
 */
public interface VendingMachineState
{
	void insertCoin();
	
	void selectProduct();
	
	void dispenseProduct();
}
