package com.diardon;

import com.diardon.mediator.ChatMediator;
import com.diardon.mediator.ChatRoom;
import com.diardon.mediator.ChatUser;
import com.diardon.mediator.User;

/**
 * Clase principal para demostrar el uso del patrón Mediator
 */
public class AppMediator
{
	public static void main(String[] args)
	{
		ChatMediator chatRoom = new ChatRoom();

		User user1 = new ChatUser(chatRoom, "Alice");
		User user2 = new ChatUser(chatRoom, "Bob");
		User user3 = new ChatUser(chatRoom, "Charlie");
		User user4 = new ChatUser(chatRoom, "Diana");

		chatRoom.addUser(user1);
		chatRoom.addUser(user2);
		chatRoom.addUser(user3);
		chatRoom.addUser(user4);

		user1.send("Hola a todos.");
		user3.send("¡Hola Alice!");
	}
}
