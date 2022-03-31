package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members;

    HealthcareWorkerTeam() {
        members = new HashSet<HealthcareServiceable>();
    }

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        members.remove(member);
    }

    @Override
    public void service() {
        for (HealthcareServiceable worker : members) {
            worker.service();
        }
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (HealthcareServiceable worker : members) {
            price += worker.getPrice();
        }
        return price;
    }

}
