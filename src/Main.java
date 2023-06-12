public class Main {
    public static void main(String[] args) {
        FirePokemon charizard = new FirePokemon("Charizard", 100, 50, "Flamethrower");
        WaterPokemon blastoise = new WaterPokemon("Blastoise", 100, 45, "Hydro Pump");
        GrassPokemon venusaur = new GrassPokemon("Venusaur", 100, 48, "Solar Beam");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 100, 55, "Thunderbolt");

        // use their methods
        charizard.attack();
        charizard.useFireAttack();
        charizard.gainFirePower();

        blastoise.attack();
        blastoise.useWaterAttack();
        blastoise.gainWaterPower();

        venusaur.attack();
        venusaur.useGrassAttack();
        venusaur.gainGrassPower();

        pikachu.attack();
        pikachu.useElectricAttack();
        pikachu.gainElectricPower();
    }
}