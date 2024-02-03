package DefiningClassesExercise.Google;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private List<personPokemon> pokemonsList = new ArrayList<>();
    private List<personParents> parentsList= new ArrayList<>();
    private List<personChildren> childrenList = new ArrayList<>();
    private personCompany currentCompany;
    private personCar currentCar;

    public Person(String name) {
        this.name = name;
    }

    public static class personCompany {
        private String companyName;
        private String department;
        private double salary;

        public personCompany(String companyName, String department, double salary) {
            this.companyName = companyName;
            this.department = department;
            this.salary = salary;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    public static class personPokemon {
        private String pokemonName;
        private String pokemonType;

        public personPokemon(String pokemonName, String pokemonType) {
            this.pokemonName = pokemonName;
            this.pokemonType = pokemonType;
        }

        public String getPokemonName() {
            return pokemonName;
        }

        public void setPokemonName(String pokemonName) {
            this.pokemonName = pokemonName;
        }

        public String getPokemonType() {
            return pokemonType;
        }

        public void setPokemonType(String pokemonType) {
            this.pokemonType = pokemonType;
        }
    }

    public static class personParents {
        private String parentName;
        private String parentBirthday;

        public personParents(String parentName, String parentBirthday) {
            this.parentName = parentName;
            this.parentBirthday = parentBirthday;
        }

        public String getParentName() {
            return parentName;
        }

        public void setParentName(String parentName) {
            this.parentName = parentName;
        }

        public String getParentBirthday() {
            return parentBirthday;
        }

        public void setParentBirthday(String parentBirthday) {
            this.parentBirthday = parentBirthday;
        }
    }

    public static class personChildren {
        private String childName;
        private String childBirthday;

        public personChildren(String childName, String childBirthday) {
            this.childName = childName;
            this.childBirthday = childBirthday;
        }

        public String getChildName() {
            return childName;
        }

        public void setChildName(String childName) {
            this.childName = childName;
        }

        public String getChildBirthday() {
            return childBirthday;
        }

        public void setChildBirthday(String childBirthday) {
            this.childBirthday = childBirthday;
        }
    }

    public static class personCar {
        private String model;
        private int carSpeed;

        public personCar(String model, int carSpeed) {
            this.model = model;
            this.carSpeed = carSpeed;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCarSpeed() {
            return carSpeed;
        }

        public void setCarSpeed(int carSpeed) {
            this.carSpeed = carSpeed;
        }
    }

    public void addPokemon(personPokemon pokemon) {
        pokemonsList.add(pokemon);
    }

    public void addParent(personParents parent) {
        parentsList.add(parent);
    }

    public void addChild(personChildren child) {
        childrenList.add(child);
    }

    public void updateCompany (personCompany newCompany) {
        currentCompany = newCompany;
    }

    public void updateCar (personCar newCar) {
        currentCar = newCar;
    }

    public personCompany getCurrentCompany() {
        return currentCompany;
    }

    public void setCurrentCompany(personCompany currentCompany) {
        this.currentCompany = currentCompany;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Company:%s\n" +
                "Car:%s\n" +
                "Pokemon:%s\n" +
                "Parents:%s\n" +
                "Children:%s\n",
                name,   //Name
                currentCompany == null ? "" :String.format("\n%s %s %.2f" ,currentCompany.getCompanyName(), //Company
                        currentCompany.getDepartment(),
                        currentCompany.getSalary()),
                currentCar == null ? "" :String.format("\n%s %d", currentCar.model, currentCar.carSpeed), //Car
                pokemonsList.isEmpty() ? "" : "\n" + pokemonsList.stream()   //Pokemons
                        .map(pokemon -> pokemon.getPokemonName() + " " + pokemon.getPokemonType())
                        .collect(Collectors.joining("\n")),
                parentsList.isEmpty() ? "" : "\n" + parentsList.stream()    //Parents
                        .map(parent -> parent.getParentName() + " " + parent.parentBirthday)
                        .collect(Collectors.joining("\n")),
                childrenList.isEmpty() ? "" : "\n" + childrenList.stream()   //Children
                        .map(child -> child.getChildName() + " " + child.getChildBirthday())
                        .collect(Collectors.joining("\n")));

    }
}
