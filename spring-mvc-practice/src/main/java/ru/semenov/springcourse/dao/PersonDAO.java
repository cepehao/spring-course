package ru.semenov.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.semenov.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT = 0;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Danil", 22, "danil@yandex.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Sergey", 25, "Seregea228@yandex.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Ivan", 33, "helloworld@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Alexey", 5, "alex@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person->person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);

        people.add(person);
    }

    public void update(Person newPerson, int id) {
        Person oldPerson = show(id);

        oldPerson.setName(newPerson.getName());
        oldPerson.setAge(newPerson.getAge());
        oldPerson.setEmail(newPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
