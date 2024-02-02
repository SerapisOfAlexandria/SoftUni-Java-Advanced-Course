package DefiningClassesExercise.PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String ,Trainer> trainerMap = new LinkedHashMap<>();

        String[] pokemonInfo = scanner.nextLine().split("\\s+");
        while (!pokemonInfo[0].equals("Tournament")) {
            String trainerName = pokemonInfo[0];
            String pokemonName = pokemonInfo[1];
            String pokemonElement = pokemonInfo[2];
            int pokemonHealth = Integer.parseInt(pokemonInfo[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (trainerMap.containsKey(trainerName)) {
                trainerMap.get(trainerName).addPokemon(pokemon);
            } else {
                Trainer trainer = new Trainer(trainerName);
                trainer.addPokemon(pokemon);
                trainerMap.put(trainerName, trainer);
            }

            pokemonInfo = scanner.nextLine().split("\\s+");
        }

        String element = scanner.nextLine();
        while (!element.equals("End")) {
            for (Trainer trainer : trainerMap.values()) {
                trainer.checkForPokemon(element);
            }
            element = scanner.nextLine();
        }

        Comparator<Trainer> comparator = ((t2, t1) -> Integer.compare(t1.getNumOfBadges(), t2.getNumOfBadges()));

        List<Trainer> trainerList = trainerMap.values().stream()
                .collect(Collectors.toList()).stream()
                .sorted(comparator)
                .collect(Collectors.toList());


        for (Trainer trainer : trainerList) {
            System.out.println(trainer.toString());
        }
    }
}
