
import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    public Dog() {
        
    }

    @Override
    public double run() {
        return 40;
    }
}
