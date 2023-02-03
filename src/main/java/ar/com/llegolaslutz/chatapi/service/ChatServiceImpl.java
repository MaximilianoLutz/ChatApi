package ar.com.llegolaslutz.chatapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.llegolaslutz.chatapi.dao.ChatRepository;
import ar.com.llegolaslutz.chatapi.document.Message;


@Service
public class ChatServiceImpl implements I_ChatService{
	
	@Autowired
	private ChatRepository chatDao;

	@Override
	public List<Message> obtenerUltimos10Mensajes() {
		return chatDao.findFirst10ByOrderByFechaDesc();
	}

	@Override
	public Message guardar(Message message) {
		return chatDao.save(message);
	}

}
