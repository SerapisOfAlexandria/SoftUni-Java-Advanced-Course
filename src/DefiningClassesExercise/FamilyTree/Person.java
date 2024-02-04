package DefiningClassesExercise.FamilyTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name = "n/a";
    private String date = "n/a";
    private List<Person> children = new ArrayList<>();
    private List<Person> parents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChildren(Person child) {
        children.add(child);
    }

    public void addParent(Person parent) {
        parents.add(parent);
    }

    public List<Person> getParents() {
        return parents;
    }

    @Override public String toString() {
        return name + " " + date;
    }
}
