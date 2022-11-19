import java.util.*;

public class Main {

    public static void main(String[] args) {
        // one Map
        long start = System.currentTimeMillis();
        Map<Integer, Fio> people = CreateMap.NewCreateMap(MockData.MockFio());
        System.out.println(people);
        long end = System.currentTimeMillis();
        System.out.println("Прошло времени, мс: " + (end-start));
        // two treeMap
        long start1 = System.currentTimeMillis();
        System.out.println(CreateMap.CreateTreeMap(MockData.MockFio()));
        long end1 = System.currentTimeMillis();
        System.out.println("Прошло времени, мс: " + (end1-start1));
        // three LinkedMap
        long start2 = System.currentTimeMillis();
        System.out.println(CreateMap.CreateLinkedMap(MockData.MockFio()));
        long end2 = System.currentTimeMillis();
        System.out.println("Прошло времени, мс: " + (end2-start2));

        // Homework 6 - Set
        Comparator<Fio> sortFio = new Comparator<Fio>() {
            @Override
            public int compare(Fio o1, Fio o2) {
                return o2.getAge()-o1.getAge();
            }
        };
        Set ts = new TreeSet(sortFio);
        Collections.sort(MockData.MockFio());
        MySet ls6 = new MySet();
        for (int i = 0; i < MockData.MockFio().size(); i++){
            ls6.Add(MockData.MockFio().get(i));
        }
        ls6.person.forEach((k,v) -> System.out.println(k));



    }
}
