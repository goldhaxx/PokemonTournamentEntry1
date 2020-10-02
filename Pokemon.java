class Pokemon {

    String trainerName, pokeName, pokeType;
    int pokeLevel, pokedexNum, attackCheck, defenseCheck, hpCheck;;

    public Pokemon(int pokedexNum, String pokeName, String pokeType, int pokeLevel, int attackCheck, int defenseCheck, int hpCheck){

        this.pokedexNum = pokedexNum;
        this.pokeName = pokeName;
        this.pokeType = pokeType;
        this.pokeLevel = pokeLevel;
        this.attackCheck = attackCheck;
        this.defenseCheck = defenseCheck;
        this.hpCheck = hpCheck;;

    }

    public void getPokemonStats(){

        System.out.println("Pokedex Num: "+pokedexNum);
        System.out.println("Pokemon Name: "+pokeName);

    }




}
