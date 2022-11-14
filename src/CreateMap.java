import java.util.*;

public class CreateMap {
    public static Map<Integer, Fio> NewCreateMap(List<Fio> people){
        int id = 0;
        Map<Integer, Fio> dicPeople = new HashMap<>();
        for (int i=0;i<people.size();i++){
            dicPeople.put(id, people.get(i));
            id++;
        }
        return dicPeople;
    }

    public static TreeMap<Integer, Fio> CreateTreeMap(List<Fio> people){
        TreeMap<Integer, Fio> treeMap = new TreeMap<>();
        int id = 0;
        for (int i=0;i<people.size();i++){
            treeMap.put(id, people.get(i));
            id++;
        }
        return treeMap;
    }

    public static LinkedHashMap<Integer, Fio> CreateLinkedMap(List<Fio> people){
        LinkedHashMap<Integer, Fio> linkedMap = new LinkedHashMap<>();
        int id = 0;
        for (int i=0;i<people.size();i++){
            linkedMap.put(id, people.get(i));
            id++;
        }
        return linkedMap;
    }
}
