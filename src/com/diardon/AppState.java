package com.diardon;

import com.diardon.state.VendingMachine;

/**
 * Clase principal para demostrar el uso del patrón State
 */
public class AppState
{
	public static void main(String[] args)
	{
		VendingMachine vendingMachine = new VendingMachine();

		System.out.println("=== Proceso 1 ===");
		vendingMachine.insertCoin();
		vendingMachine.selectProduct();
		vendingMachine.dispenseProduct();

		System.out.println("\n=== Proceso 2 ===");
		vendingMachine.selectProduct(); // Sin moneda
		vendingMachine.insertCoin();
		vendingMachine.insertCoin(); // Doble moneda
		vendingMachine.selectProduct();
		vendingMachine.dispenseProduct();
	}
}
