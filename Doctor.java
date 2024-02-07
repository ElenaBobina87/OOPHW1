import java.util.ArrayList;
import java.util.Map;
import java.util.Random;


public class Doctor extends Personal {

    private Map<Integer, String> diagnoses = Map.of(1, "Лишай", 2, "Чумка", 3, "Простуда");

    public String doDiagnose(Animal patient) {
        Random r = new Random();
        int random = r.nextInt(1, diagnoses.size()+1);
        String d = diagnoses.get(random);
        patient.setIllness(new Illness(d));
        return d;
    }
    public ArrayList<String> getArrayPatients() {
        ArrayList<String> listPatients = new ArrayList<>();
        return listPatients;
    }
}
