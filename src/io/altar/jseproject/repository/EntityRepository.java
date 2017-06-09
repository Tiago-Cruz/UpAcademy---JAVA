package io.altar.jseproject.repository;

import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;

public class EntityRepository<E extends Entity> {

	private LinkedHashMap <Integer, Entity> productLists = new LinkedHashMap <Integer, Entity>();
}

