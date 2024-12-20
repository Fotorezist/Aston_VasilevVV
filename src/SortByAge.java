import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class SortByAge {
//    Выберите только тех людей, которые старше 18 лет.
//    Отсортируйте отфильтрованный список по имени.
//    Соберите имена отфильтрованных и отсортированных объектов в новый список List<String>.
//    Выведите на экран полученный список имен.

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 17),
                new Person("Charlie", 22),
                new Person("David", 19),
                new Person("Eve", 15)
        );

        List<String> filtered = people.stream()
                .filter(person -> person.getAge() > 18)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
