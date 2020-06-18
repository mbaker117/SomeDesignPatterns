package com.erabia.design_pattern.creational.prototype.prototype;

public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	public abstract void draw();
	public String getType() {
		return type;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public Shape clone()  {
		Shape clone = null;
		try {
			clone =(Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clone;
	}

}
