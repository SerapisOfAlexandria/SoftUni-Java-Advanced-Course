package DefiningClassesExercise.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int numOfBadges = 0;
    private List<Pokemon> pokemonCollection = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonCollection.add(pokemon);
    }

    public void checkForPokemon(String element) {
        for (Pokemon p : this.pokemonCollection) {
            if (p.getElement().equals(element)) {
                numOfBadges++;
                return;
            }
        }

        this.pokemonCollection = this.pokemonCollection.stream()
                .map(pokemon -> {
                    pokemon.reduceHealth(10);
                    return pokemon;
                }).filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }

    public int getNumOfBadges() {
        return numOfBadges;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, numOfBadges, pokemonCollection.size());
    }
}
