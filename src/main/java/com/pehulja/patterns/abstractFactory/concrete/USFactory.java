package com.pehulja.patterns.abstractFactory.concrete;

import com.pehulja.patterns.abstractFactory.common.Address;
import com.pehulja.patterns.abstractFactory.common.Factory;
import com.pehulja.patterns.abstractFactory.common.Phone;

public class USFactory extends Factory{

    @Override
    public Address buildAddress() {
	return new USAddress();
    }

    @Override
    public Phone buildPhone() {
	return new USPhone();
    }

}
