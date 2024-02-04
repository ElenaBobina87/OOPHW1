import java.util.ArrayList;



public class VeterinaryClinic {
    // ArrayList<String> flyableAnimal = (ArrayList<String>) List.of("Bat", "Bird", "Parrot");
    
    public ArrayList<Animal> getFlyable(ArrayList<Animal> list) {
        ArrayList<String> flyableAnimal = new ArrayList<>();
        flyableAnimal.add("Bat");
        flyableAnimal.add("Bird");
        flyableAnimal.add("Parrot");
        
        ArrayList<Animal> listFlyable = new ArrayList<Animal>();
        for (int i = 0; i < list.size(); i++) {
            Animal a = list.get(i);
            if (flyableAnimal.contains(a.getType())) {
                listFlyable.add(a);
            }
        
        }
        return listFlyable;
    }

    public ArrayList<Animal> getGoable(ArrayList<Animal> list) {
        ArrayList<String> goableAnimal = new ArrayList<>();
        goableAnimal.add("Turtule");
        goableAnimal.add("Parrot");
        goableAnimal.add("FlyingSquirrel");
        goableAnimal.add("Dog");
        goableAnimal.add("Bird");
        goableAnimal.add("Bat");

        ArrayList<Animal> listGoable = new ArrayList<Animal>();
        for (int i = 0; i < list.size(); i++) {
            Animal a = list.get(i);
            if (goableAnimal.contains(a.getType())) {
                listGoable.add(a);
            }
        
        }
        return listGoable;
    }
    
    public ArrayList<Animal> getSwimable(ArrayList<Animal> list) {
        ArrayList<String> swimableAnimal = new ArrayList<>();
        swimableAnimal.add("Turtule");
        swimableAnimal.add("Fish");
        

        ArrayList<Animal> listSwimable = new ArrayList<Animal>();
        for (int i = 0; i < list.size(); i++) {
            Animal a = list.get(i);
            if (swimableAnimal.contains(a.getType())) {
                listSwimable.add(a);
            }
        
        }
        return listSwimable;
    }

    public ArrayList<Doctor> getDoctors(ArrayList<Personal> list) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Personal a = list.get(i);
            if (a.getType().equals("Doctor")) {
                doctors.add((Doctor)a);
            }
                
            
        }
        return doctors;
    }

    public ArrayList<Nurse> getNurse(ArrayList<Personal> list) {
        ArrayList<Nurse> nurses = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Personal a = list.get(i);
            if (a.getType().equals("Nurse")) {
                nurses.add((Nurse)a);
            }
                
            
        }
        return nurses;
    }
    
}
