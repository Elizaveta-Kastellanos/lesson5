import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // one Map
        long start = System.currentTimeMillis();
        Map<Integer, Fio> people = CreateMap.NewCreateMap(MockData.MockFio());
        System.out.println(people);
        long end = System.currentTimeMillis();
        System.out.println("Прошло времени, мс: " + (end-start));
        // two treeMap
        start = System.currentTimeMillis();
        System.out.println(CreateMap.CreateTreeMap(MockData.MockFio()));
        end = System.currentTimeMillis();
        System.out.println("Прошло времени, мс: " + (end-start));
        // three LinkedMap
        start = System.currentTimeMillis();
        System.out.println(CreateMap.CreateLinkedMap(MockData.MockFio()));
        end = System.currentTimeMillis();
        System.out.println("Прошло времени, мс: " + (end-start));
    }
}
