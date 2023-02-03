package ar.com.llegolaslutz.chatapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.llegolaslutz.chatapi.dao.ChatRepository;
import ar.com.llegolaslutz.chatapi.document.Message;

public interface I_ChatService {

	public List<Message> obtenerUltimos10Mensajes();

	public Message guardar(Message message);

}
