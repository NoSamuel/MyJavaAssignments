import java.util.ArrayList;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Animal implements Comparable<Animal> {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        String s = this.getClass().getName() +
                String.format(" [name = %s, weight (lbs) = %.2f]", name, weight);
        return s;
    }

    public static double calcAvg(ArrayList<Animal> list) {
        double sum = 0;
        if (list.size() == 0) {
            return 0;
        }
        for (Animal animal : list) {
            sum = sum + animal.getWeight();
        }
        return sum / list.size();
    }

    public int compareTo(Animal o) {
        final double SMALLNUMBER = 1e-10;
        if (Math.abs(this.weight - o.getWeight()) < SMALLNUMBER) {
            return 0;
        } else if (this.weight > o.getWeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}