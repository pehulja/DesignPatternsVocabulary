package com.pehulja.patterns.prototype;

/**
 * To make dynamic creation easier by defining classes whose objects can create
 * duplicates of themselves.
 * 
 * While this approach solves the problem, it has one serious drawback—it
 * violates the object-oriented principle of encapsulation. To achieve the
 * solution mentioned above, you have to put method calls to copy the Address
 * information, outside of the Address class. This means that it becomes harder
 * and harder to maintain the Address code, since it exists throughout the code
 * for the project. It is also difficult to reuse the Address class in some new
 * project in the future
 * 
 * Use the Prototype pattern when you want to create an object that is a copy of an existing object. 
 * @author baske
 */
public class Usage {

    public static void main(String[] args) throws CloneNotSupportedException {
	DataObjectClonable object1 = new DataObjectClonable("value", 5);
	object1 = object1.clone();
	
	Copyable<DataObjectCopyable> object2 = new DataObjectCopyable("value2", 10);
	object2 = object2.copy();
    }

}
