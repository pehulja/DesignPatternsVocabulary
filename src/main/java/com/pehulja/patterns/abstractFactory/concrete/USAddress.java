package com.pehulja.patterns.abstractFactory.concrete;

import com.pehulja.patterns.abstractFactory.common.Address;

public class USAddress extends Address {
    private static final String country;

    static {
	country = "USA";
    }

    @Override
    public String getCountry() {
	return country;
    }
}
