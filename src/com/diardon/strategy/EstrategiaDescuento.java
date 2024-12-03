package com.diardon.strategy;

/**
 * Interfaz Strategy
 * Define el contrato para las diferentes estrategias de descuento
 */
public interface EstrategiaDescuento
{
    double aplicarDescuento(double price);
}
