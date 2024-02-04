

import java.time.LocalDate;



public class Bird extends Animal implements Goable, Flyable {

    private int wingQuantity;

    public Bird(String name, LocalDate birthday, Illness illness, int wingQuantity) {
        super(name, birthday, illness);
        this.wingQuantity = wingQuantity;
    }

    @Override
    public double fly() {
        return 20;
    }

    @Override
    public double run() {
        return 3;
    }
}
