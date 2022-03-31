package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("%s: ", new Date().toString());
    }
}
