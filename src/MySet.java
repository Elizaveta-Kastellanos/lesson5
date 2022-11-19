import java.util.HashMap;
import java.util.Map;

public class MySet {
//    Реализовать множество (set) с помощью TreeMap.
//    Создать метод add, добавляющий элемент в ваше множество.
//    Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
//    Объявить и инициализировать TreeSet использующий ваш копаратор.
//    Добавить несколько эллементов в сет и вывести в консоль.
    private static final Object OBJ = new Object();
    Map<Fio, Object> person = new HashMap<>();

    public boolean Add(Fio person){
       return this.person.put(person, OBJ) == null;
    }
}
