package Pharmacy;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(new Component("Penicillin", "0,5", 15))
                .addComponent(new Component("Water", "1,2", 4));

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("Penicillin", "0,5", 10))
                .addComponent(new Component("Water", "1,2", 4));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Penicillin", "0,5", 18))
                .addComponent(new Component("Water", "1,2", 6))
                .addComponent(new Component("Water", "1,2", 5));

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Penicillin", "0,5", 18))
                .addComponent(new Component("Water", "1,2", 6))
                .addComponent(new Component("Water", "1,2", 5));

        // while (pharmacy.hasNext()) {
        // System.out.println(pharmacy.next());
        // }

        // for (Component item : pharmacy) {
        // System.out.println(item);
        // }

        // List<Pharmacy> pharmacyList = new ArrayList<>();
        // pharmacyList.add(pharmacy1);
        // pharmacyList.add(pharmacy2);
        // pharmacyList.add(pharmacy3);
        // pharmacyList.add(pharmacy4);

        // System.out.println(pharmacyList);
        // Collections.sort(pharmacyList);
        // System.out.println("---------------");
        // System.out.println(pharmacyList);

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);

        System.out.println(result.size());
    }
}
