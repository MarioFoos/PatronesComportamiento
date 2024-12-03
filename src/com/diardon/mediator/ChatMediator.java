package com.diardon.mediator;

/**
 * Interfaz Mediator: Define el contrato para la comunicación
 */
public interface ChatMediator
{
    void sendMessage(String message, User user);
    void addUser(User user);
}
