package com.pehulja.patterns.prototype;

/**
 * Shallow copy
 * @author baske
 *
 */
public class DataObjectClonable implements Cloneable{
    private String value;
    private Integer number;
    
    public DataObjectClonable(String value, Integer number) {
	super();
	this.value = value;
	this.number = number;
    }
    @Override
    public String toString() {
	return "DataObject [value=" + value + ", number=" + number + "]";
    }
    
    // That makes a shallow copy
    public DataObjectClonable clone() throws CloneNotSupportedException {
	DataObjectClonable clone = (DataObjectClonable) super.clone();
	
	clone.value = this.value;
	clone.number = this.number;
	
	return clone;
    }
}
