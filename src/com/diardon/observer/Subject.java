package com.diardon.observer;

import java.util.ArrayList;

public class Subject
{
	private ArrayList<Observer> observers = new ArrayList<>();

	public void agregarObservador(Observer observer)
	{
		observers.add(observer);
	}
	public void eliminarObservador(Observer observer)
	{
		observers.remove(observer);
	}
	public void notificarObservadores(String mensaje)
	{
		for(Observer observer : observers)
		{
			observer.update(mensaje);
		}
	}
}
