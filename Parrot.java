

public class Parrot extends Animal implements Flyable, Goable{

    
    

    @Override
    public double run() {
        return 3;
    }

    @Override
    public double fly() {
        return 20;
    }
}
