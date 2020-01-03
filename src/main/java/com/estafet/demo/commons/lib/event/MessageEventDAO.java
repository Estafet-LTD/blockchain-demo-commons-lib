package com.estafet.demo.commons.lib.event;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MessageEventDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly = true)
	public AbstractMessageEvent getMessageEvent(String topic) {
		return entityManager.find(AbstractMessageEvent.class, topic);
	}
	
	@Transactional
	public void create(AbstractMessageEvent abstractMessageEvent) {
		entityManager.persist(abstractMessageEvent);
	}
	
	@Transactional
	public void update(AbstractMessageEvent abstractMessageEvent) {
		entityManager.merge(abstractMessageEvent);
	}

}
