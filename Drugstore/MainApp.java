package Drugstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import Drugstore.Components.Component;
import Drugstore.Components.Penicillin;
import Drugstore.Components.Salt;
import Drugstore.Components.Water;
import Drugstore.Pharmacy.Pharmacy;
import Drugstore.Pharmacy.PharmacyIterable;

public class MainApp {
    
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy
            .addComponent(new Penicillin("Component1", 2.0, 10))
            .addComponent(new Water("Water", 5.0, 100));

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1
            .addComponent(new Salt("Salt", 10.0, 50));

        Iterator<Component> iter = pharmacy;

        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        PharmacyIterable components = new PharmacyIterable("components");
        components
            .addComponent(new Penicillin("Component1", 2.0, 10))
            .addComponent(new Salt("Salt", 10.0, 50))
            .addComponent(new Water("Water", 5.0, 100));

        // for (Component c : components) {
        //     System.out.println(c);
        // }

    //     for (int i = 0; i < components.getSize(); i++) {
    //         System.out.println(components.getComponent(i));
    //     }

        PharmacyIterable p1 = new PharmacyIterable("p1");
        p1
            .addComponent(new Penicillin("Component1", 2.0, 10))
            .addComponent(new Salt("Salt", 10.0, 50))
            .addComponent(new Water("Water", 5.0, 100));

        PharmacyIterable p2 = new PharmacyIterable("p2");
        p2
            .addComponent(new Penicillin("Penicillin", 2.0, 10))
            .addComponent(new Salt("Salt", 10.0, 50))
            .addComponent(new Water("Water", 5.0, 70));

        PharmacyIterable p3 = new PharmacyIterable("p3");
        p3
            .addComponent(new Penicillin("Penicillin", 2.0, 20))
            .addComponent(new Salt("Salt", 15.0, 50))
            .addComponent(new Water("Water", 5.0, 70));

        ArrayList<PharmacyIterable> pharmacyIterable = new ArrayList<>();
        pharmacyIterable.add(p1);
        pharmacyIterable.add(p2);
        pharmacyIterable.add(p3);
        Collections.sort(pharmacyIterable);
        System.out.println(pharmacyIterable);
        Collections.sort(pharmacyIterable, Comparator.reverseOrder());
        System.out.println(pharmacyIterable);

        // Component c1 = new Penicillin("p", 25, 120);
        // Component c2 = new Water("p", 25, 34);
        // Component c3 = new Salt("p", 25, 1);

        // ArrayList<Component> componentis = new ArrayList<>();
        // componentis.add(c1);
        // componentis.add(c2);
        // componentis.add(c3);
        // componentis.add(c3);
        // System.out.println(componentis);
        // Collections.sort(componentis, Comparator.reverseOrder());
        // System.out.println(componentis);

    }
}
