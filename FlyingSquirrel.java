package Seminar1;

public class FlyingSquirrel extends Animal{
    @Override
    protected void fly() {
        System.out.println("Белка летяга не летает, а парит");
    }

    @Override
    protected void swim() {
        System.out.println("Белка летяга не умеет плавать");
    }
}
