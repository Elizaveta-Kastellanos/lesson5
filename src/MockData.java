import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockData {
    public static List<Fio> MockFio(){
        List<Fio> people = new ArrayList<>();
        people.add(new Fio("Petr","Pivovarov", "Ivanov", 37 ));
        people.add(new Fio("Irina", "Pivovarova", "Sergeevna", 33));
        people.add(new Fio("Mikola", "Slesaraev", "Petrov", 19));
        people.add(new Fio("Marina", "Ivanova", "Inokentievna", 45));
        people.add(new Fio("Ksenia", "Kleshuck", "Trampovna", 11));
        Collections.sort(people);
        return people;
    }
}
