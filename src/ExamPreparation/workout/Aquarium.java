package ExamPreparation.workout;
//package workout;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Aquarium {
    private Map<String, Fish> fishInPool = new LinkedHashMap<>();
    private String name;
    private int capacity;
    private int size; //the volume of the pool

    public Aquarium(String name, int capacity, int size) {
        setName(name);
        setCapacity(capacity);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        if (!fishInPool.containsKey(fish.getName()) && getFishInPool() < capacity) {
            fishInPool.put(fish.getName(), fish);
        }
    }

    public boolean remove(String name) {
        if (fishInPool.containsKey(name)) {
            fishInPool.remove(name);
            return true;
        }
        return false;
    }

    public Fish findFish(String name) {
        if (fishInPool.containsKey(name)) {
            return fishInPool.get(name);
        }
        return null;
    }

    public String report() {
        return String.format("Aquarium: %s ^ Size: %d\n" +
                "%s", getName(), getSize(), fishInPool.entrySet().stream().map(stringFishEntry -> stringFishEntry.getValue()
                .toString())
                .collect(Collectors.joining("\n")));
    }
}
