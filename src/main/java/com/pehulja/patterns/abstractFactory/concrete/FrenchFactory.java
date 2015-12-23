package com.pehulja.patterns.abstractFactory.concrete;

import com.pehulja.patterns.abstractFactory.common.Address;
import com.pehulja.patterns.abstractFactory.common.Factory;
import com.pehulja.patterns.abstractFactory.common.Phone;

public class FrenchFactory extends Factory{

    @Override
    public Address buildAddress() {
	return new FrenchAddress();
    }

    @Override
    public Phone buildPhone() {
	return new FrenchPhone();
    }

}
