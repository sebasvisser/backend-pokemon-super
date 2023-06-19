public class WaterPokemon extends Pokemon {
    private int waterPower;
    private String waterAttack;

    public WaterPokemon(String name, int level, int waterPower, String waterAttack) {
        super(name, level);
        this.waterPower = waterPower;
        this.waterAttack = waterAttack;
    }

    public void useWaterAttack() {
        System.out.println(getName() + " used " + waterAttack + "!");
    }

    public void gainWaterPower() {
        this.waterPower++;
        System.out.println(getName() + " gained water power. Current water power: " + waterPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with water!");
    }

    public int getWaterPower() {
        return waterPower;
    }

    public String getWaterAttack() {
        return waterAttack;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

    public void setWaterAttack(String waterAttack) {
        this.waterAttack = waterAttack;
    }
}


/* Laatste Bonus opdracht:
public interface WaterType {
    void useWaterAttack();
    void gainWaterPower();
}

Door er een interface ipv een klasse van te maken kunnen pokemons meerdere types zijn.
Nadeel is wel dat je minder consequente code kunt krijgen. Minder hierarchisch en mogelijk minder overzichtelijk.
 */