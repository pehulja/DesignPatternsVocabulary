package com.pehulja.patterns.builder;

import java.util.Date;

/**
 * Used when need to create some complex object with many parameters, which may
 * differ, etc... The Builder pattern makes it easier to manage the overall flow
 * during the creation of complex objects.
 * 
 * For objects that need existing system resources during creation, such as
 * database connections or existing business objects, the Builder provides a
 * convenient central point to manage these resources.
 * 
 * @author baske
 */
public class Usage {

    public static void main(String[] args) throws Exception {
	Scheduler scheduler = new Scheduler();
	System.out.println(scheduler.createAppontement(new AppointmentBuilder(), new Date(2016, 1, 1), new Date(2016, 5, 1), "Description").toString());
	System.out.println(scheduler.createAppontement(new MeetingAppointmentBuilder(), new Date(2016, 1, 1), null, "Description").toString());
    }

}
