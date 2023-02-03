package ar.com.llegolaslutz.chatapi.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.com.llegolaslutz.chatapi.document.Message;

public interface ChatRepository extends MongoRepository<Message, String> {

	public List<Message> findFirst10ByOrderByFechaDesc();
}
