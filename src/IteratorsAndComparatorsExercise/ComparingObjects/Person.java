package IteratorsAndComparatorsExercise.ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    Person(String name, int age, String town) {
        setName(name);
        setAge(age);
        setTown(town);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if (getName().equals(person.getName())) {
            if (Integer.compare(getAge(), person.getAge()) == 0) {
                if (getTown().equals(person.getTown())) {
                    return 0;
                }
            }
        }
        return -1;
    }
}
