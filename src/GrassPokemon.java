public class GrassPokemon extends Pokemon {
    private int grassPower;
    private String grassAttack;

    public GrassPokemon(String name, int level, int grassPower, String grassAttack) {
        super(name, level);
        this.grassPower = grassPower;
        this.grassAttack = grassAttack;
    }

    public void useGrassAttack() {
        System.out.println(getName() + " used " + grassAttack + "!");
    }

    public void gainGrassPower() {
        this.grassPower++;
        System.out.println(getName() + " gained grass power. Current grass power: " + grassPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with grass!");
    }

    public int getGrassPower() {
        return grassPower;
    }

    public String getGrassAttack() {
        return grassAttack;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }

    public void setGrassAttack(String grassAttack) {
        this.grassAttack = grassAttack;
    }
}
