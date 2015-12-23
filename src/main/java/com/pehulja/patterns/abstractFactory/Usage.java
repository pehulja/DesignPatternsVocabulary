package com.pehulja.patterns.abstractFactory;

import com.pehulja.patterns.abstractFactory.common.Address;
import com.pehulja.patterns.abstractFactory.common.Factory;
import com.pehulja.patterns.abstractFactory.common.Phone;
import com.pehulja.patterns.abstractFactory.concrete.USFactory;

public class Usage {

    public static void main(String[] args) {
	Factory factory1 = new USFactory();
	
	Address address = factory1.buildAddress();
	Phone phone = factory1.buildPhone();
	
    }

}
