package com.virtusa.travelline.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusType {
private int typeId;
private String typeName;


public BusType()
{
	super();
}
@Id
@GeneratedValue(strategy=GenerationType.TABLE,generator="bustypetbl")
public int getTypeId() {
	return typeId;
}

public void setTypeId(int typeId) {
	this.typeId = typeId;
}

public String getTypeName() {
	return typeName;
}

public void setTypeName(String typeName) {
	this.typeName = typeName;
}





}