package com.pehulja.patterns.builder;

public class MeetingAppointmentBuilder extends AppointmentBuilder {

    @Override
    public Appointment getAppontment() throws Exception {

	try {
	    return super.getAppontment();
	} finally {
	    if (appointment.getEndDate() == null) {
		requiredElements += END_DATE_REQUIRED;
	    }
	    if (requiredElements > 0) {
		throw new Exception("Rwquired information missing exception");
	    }
	}
    }
}
