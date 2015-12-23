package com.pehulja.patterns.abstractFactory.concrete;

import com.pehulja.patterns.abstractFactory.common.Phone;

public class FrenchPhone extends Phone {
    private static final String format;

    static {
	format = "+XXXXXXXXXXXX";
    }

    @Override
    public String getFormat() {
	return format;
    }

}
