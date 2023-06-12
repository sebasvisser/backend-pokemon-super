public class FirePokemon extends Pokemon {
    private int firePower;
    private String fireAttack;

    public FirePokemon(String name, int level, int firePower, String fireAttack) {
        super(name, level);
        this.firePower = firePower;
        this.fireAttack = fireAttack;
    }

    public void useFireAttack() {
        System.out.println(getName() + " used " + fireAttack + "!");
    }

    public void gainFirePower() {
        this.firePower++;
        System.out.println(getName() + " gained fire power. Current fire power: " + firePower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with fire!");
    }

    public int getFirePower() {
        return firePower;
    }

    public String getFireAttack() {
        return fireAttack;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public void setFireAttack(String fireAttack) {
        this.fireAttack = fireAttack;
    }
}
