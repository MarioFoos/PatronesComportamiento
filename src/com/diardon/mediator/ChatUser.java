package com.diardon.mediator;

/**
 * Clase Colleague (Usuario)
 * Representa a los participantes que interact�an a trav�s del mediador
 */
public class ChatUser extends User
{
	public ChatUser(ChatMediator mediator, String name)
	{
		super(mediator, name);
	}
	@Override
	public void send(String message)
	{
		System.out.println(name + " env�a: " + message);
		mediator.sendMessage(message, this);
	}
	@Override
	public void receive(String message)
	{
		System.out.println(name + " recibe: " + message);
	}
}
