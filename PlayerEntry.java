import java.sql.SQLOutput;
import java.util.Scanner;

public class PlayerEntry {

    PlayerEntry(){

    }

    public void playerInformationRequest(){

        Scanner in = new Scanner(System.in);
        String trainerName, pokeName, pokeType;
        int pokeLevel, pokedexNum, attackCheck, defenseCheck, hpCheck;;

        System.out.println("Please enter your name: ");
        trainerName = in.nextLine();

        Trainer trainer = new Trainer(trainerName);

        for (int i = 1; i < 4; i++) {

            if (i == 1){

                System.out.println("Hello, please enter the Pokedex number of your first Pokemon: ");
                pokedexNum = in.nextInt();

                System.out.println("Please enter the name of your Pokemon: ");
                pokeName = in.nextLine();
                in.nextLine();

                System.out.println("Enter your chosen Pokemon Type: ");
                pokeType = in.nextLine();
                in.nextLine();

                System.out.println("Enter your chosen Pokemon's Level: ");
                pokeLevel = in.nextInt();

                System.out.println("Enter this Pokemon's Attack IV: ");
                attackCheck = in.nextInt();

                System.out.println("Enter this Pokemon's Defense IV: ");
                defenseCheck = in.nextInt();

                System.out.println("Enter this Pokemon's HP IV: ");
                hpCheck = in.nextInt();

                Pokemon pokemonOne = new Pokemon(pokedexNum, pokeName, pokeType, pokeLevel, attackCheck, defenseCheck, hpCheck);
                pokemonOne.getPokemonStats();




            }
            if (i == 2){

                System.out.println("Hello, please enter the Pokedex number of your second Pokemon: ");
                pokedexNum = in.nextInt();

                System.out.println("Please enter the name of your Pokemon: ");
                pokeName = in.nextLine();

                System.out.println("Enter your chosen Pokemon Type: ");
                pokeType = in.nextLine();

                System.out.println("Enter this Pokemon's Attack IV: ");
                attackCheck = in.nextInt();

                System.out.println("Enter this Pokemon's Defense IV: ");
                defenseCheck = in.nextInt();

                System.out.println("Enter this Pokemon's HP IV: ");
                hpCheck = in.nextInt();

            }
            if (i == 3){

                System.out.println("Hello, please enter the Pokedex number of your third Pokemon: ");
                pokedexNum = in.nextInt();

                System.out.println("Please enter the name of your Pokemon: ");
                pokeName = in.nextLine();

                System.out.println("Enter your chosen Pokemon Type: ");
                pokeType = in.nextLine();

                System.out.println("Enter this Pokemon's Attack IV: ");
                attackCheck = in.nextInt();

                System.out.println("Enter this Pokemon's Defense IV: ");
                defenseCheck = in.nextInt();

                System.out.println("Enter this Pokemon's HP IV: ");
                hpCheck = in.nextInt();

            }

        }



    }



}
