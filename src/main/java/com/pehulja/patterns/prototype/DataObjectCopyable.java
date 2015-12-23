package com.pehulja.patterns.prototype;

/**
 * Deep copy
 * 
 * @author baske
 *
 */
public class DataObjectCopyable implements Copyable<DataObjectCopyable> {
    private String value;
    private Integer number;

    public DataObjectCopyable(String value, Integer number) {
	super();
	this.value = value;
	this.number = number;
    }

    @Override
    public String toString() {
	return "DataObject [value=" + value + ", number=" + number + "]";
    }

    // That makes a shallow copy
    public DataObjectCopyable clone() throws CloneNotSupportedException {
	DataObjectCopyable clone = (DataObjectCopyable) super.clone();

	clone.value = this.value;
	clone.number = this.number;

	return clone;
    }

    @Override
    public DataObjectCopyable copy() {
	DataObjectCopyable copy = new DataObjectCopyable(new String(this.value), new Integer(this.number));
	return copy;
    }
}
