package com.practice.json;

public class MyPojo {
	public int id;
	public String name;
	public String tags[];
	
	
	public MyPojo() {
		
	}
	
	public MyPojo(int id, String name, String[] tags) {
		this.id = id;
		this.name = name;
		this.tags = tags;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	
	
}
