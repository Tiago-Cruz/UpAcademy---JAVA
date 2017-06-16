package io.altar.jseproject.repository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.jseproject.model.Entity;

public class EntityRepository<E extends Entity> {
	
	private Integer id = 0;
	
	private LinkedHashMap <Integer, Entity> entityList = new LinkedHashMap <Integer, Entity>();
	
	public Integer getNextId() {
	
		return ++id;
	}
	
	public void addToList(Entity entity) {
		
		entity.setId(getNextId());
		entityList.put(entity.getId(),entity);
	}
	
	public void alterElement() {}
	
	public Entity get(Integer id){
		return entityList.get(id);
	}
	
	public void remove(Integer id){
		
		entityList.remove(id);
	}
	
	public boolean isEmpty() {
		
		return entityList.isEmpty();
	}

	public Set<Integer> keySet() {
		
		return entityList.keySet();
	}
	
	public Collection<Entity> getAll() {
		
		return entityList.values();
	}
	
	public boolean containsKey(Integer key) {
		
		return entityList.containsKey(key);
	}
	
	public void displayElement(Integer key) {
		
		System.out.println(entityList.get(key).toString());
	}
}





//import java.util.Set;




	
	
	
	
	
	