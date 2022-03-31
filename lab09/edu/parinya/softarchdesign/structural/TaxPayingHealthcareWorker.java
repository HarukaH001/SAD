package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {

    TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate %s with TaxPaying.\n", super.getName());
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.10;
    }
}
