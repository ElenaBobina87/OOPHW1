
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        //Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        //System.out.println(cat.getName());
        //cat.setIllness(new Illness(null));
        //System.out.println(cat.getIllness());
        //Animal animal = new Animal();
        Animal dog = new Dog("Шарик", LocalDate.of(2019, 04, 23), new Illness("Бешенство"));
        //System.out.println(dog.getType());
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(dog);
        //list.add(cat);
        list.add(new Bird("Кеша", LocalDate.of(2021, 05, 30), null, 2));
        // System.out.println(list);
        //dog.lifeCycle();
        Bat bat = new Bat("Жак", LocalDate.of(2023, 11, 20), null, 6);
        list.add(bat);
        list.add(new Fish());
        list.add(new FlyingSquirrel());
        list.add(new Parrot());
        list.add(new Turtule());
        // System.out.println(list);
        VeterinaryClinic vc = new VeterinaryClinic();
        //List<Animal> fly = vc.getFlyable(list);
        //System.out.println(fly);

        ArrayList<Personal> listPersonals = new ArrayList<Personal>();
        listPersonals.add(new Doctor());
        listPersonals.add(new Doctor());
        listPersonals.add(new Nurse());
        listPersonals.add(new Nurse());
        listPersonals.add(new Nurse());

        //List<Doctor> doctors = vc.getDoctors(listPersonals);
        //System.out.println(doctors);

        // решение препода

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(bat);
        Doctor doctor = new Doctor(); 
        clinic.addEmployes(doctor);

        System.out.println(doctor.doDiagnose(bat));


            
                
        
    }

    
}
