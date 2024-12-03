package com.diardon.state;

/**
 * Interfaz State: Define los m�todos comunes a todos los estados
 */
public interface VendingMachineState
{
	void insertCoin();
	
	void selectProduct();
	
	void dispenseProduct();
}
