package Drugstore.Pharmacy;

import Drugstore.Components.Component;
import Drugstore.Components.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterable implements Iterable<Component>, Comparable<PharmacyIterable> {
    private List<Component> components;
    private int idx;
    private int size = 0;
    private String name;

    

    public PharmacyIterable(String name) {
        this.components = new ArrayList<>();
        this.idx = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PharmacyIterable addComponent(Component item) {
        size++;
        components.add(item);
        return this;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getSize() {
        return size;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int idx) {
        return components.get(idx);
    }

    public int sumPower() {
        int res = 0;
        for (Component c : components) {
           res += c.getPower(); 
        }
        return res;
    }

    public double getSumWeight() {
        double res = 0;
        for (Component c : components) {
            res += c.getWeight();
        }
        return res;
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<>() {
//            @Override
//            public boolean hasNext() {
//                return idx < components.size();
//            }
//
//            @Override
//            public Component next() {
//                return components.get(idx++);
//            }
//        };
        return new MyIterator(this);
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public int compareTo(PharmacyIterable o) {
        // if (this.sumPower() > o.sumPower()) return 1;
        // if (this.sumPower() < o.sumPower()) return -1;
        // else return 0;
        return Integer.compare(this.sumPower(), o.sumPower());
    }

    @Override
    public String toString() {
        return String.format("\nPharmacy: %s, total power: %d", this.getName(), this.sumPower());
    }

    

    

    

    
}
