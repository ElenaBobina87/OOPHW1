

import java.time.LocalDate;

public class Bat extends Animal implements Goable, Flyable {

    int wingspan;
   

    public Bat(String name, LocalDate birthday, Illness illness, int wingspan) {
        super(name, birthday, illness);
        this.wingspan = wingspan;
    }


    @Override
    public double fly() {
        return 10;
    }


    @Override
    public double run() {
        return 1;
    }

    
    
}
