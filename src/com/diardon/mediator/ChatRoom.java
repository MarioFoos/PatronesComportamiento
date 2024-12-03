package com.diardon.mediator;

import java.util.ArrayList;

/**
 * Clase ConcreteMediator: Implementa la lógica de comunicación:
 */
public class ChatRoom implements ChatMediator
{
	private ArrayList<User> users;

	public ChatRoom()
	{
		this.users = new ArrayList<>();
	}
	@Override
	public void addUser(User user)
	{
		users.add(user);
	}
	@Override
	public void sendMessage(String message, User sender)
	{
		for(User user : users)
		{
			// No enviar el mensaje al remitente
			if(user != sender)
			{
				user.receive(message);
			}
		}
	}
}
