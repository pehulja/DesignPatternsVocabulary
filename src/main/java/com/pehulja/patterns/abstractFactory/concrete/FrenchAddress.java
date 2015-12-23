package com.pehulja.patterns.abstractFactory.concrete;

import com.pehulja.patterns.abstractFactory.common.Address;

public class FrenchAddress extends Address {
    private static final String country;

    static {
	country = "France";
    }

    @Override
    public String getCountry() {
	return country;
    }
}
