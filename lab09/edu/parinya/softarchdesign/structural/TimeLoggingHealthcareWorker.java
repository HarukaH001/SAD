package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate %s with TimeLogging.\n", super.getName());
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("%s: ", new Date().toString());
    }
}
