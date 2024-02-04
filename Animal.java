

import java.time.LocalDate;

/**
 * Animal
 */
public abstract class Animal {

    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animal(String name, LocalDate birthday, Illness illness){
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }

    public Animal(){
        this("Вася", LocalDate.now(), new Illness("Чумка"));
    }

    public void setIllness(Illness illnes){
        this.illness = illness;
    }

    public String getName(){
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    private void wakeUp(){
        System.out.println(getType() + " проснулся");
    }

    private void wakeUp(String time){
        System.out.println(getType() + " проснулся в " + time);
    }

    private void hunt(){
        System.out.println(getType() + " охотится");
    }

    private void eat(){
        System.out.println(getType() + " кушает");
    }

    private void slip(){
        System.out.println(getType() + " спит");
    }

    public void lifeCycle(){
        wakeUp();
        
        hunt();
        eat();
        slip();
    }

    

    @Override
    public String toString() {
        return String.format("name = %s, birthday = %s, illness = %s", name, birthday, illness);
        
    }


    
}