

import java.time.LocalDate;

public class Turtule extends Animal implements Swimable, Goable{
    int shellSize;
    public Turtule(String name, LocalDate birthday, Illness illness, int shellSize) {
        super(name, birthday, illness);
        this.shellSize = shellSize;
    }
    public Turtule() {
        
    }
   
    @Override
    public double run() {
        return 4;
    }
    @Override
    public double swim() {
        return 20;
    }
}
