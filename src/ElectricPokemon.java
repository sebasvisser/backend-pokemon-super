public class ElectricPokemon extends Pokemon {
    private int electricPower;
    private String electricAttack;

    public ElectricPokemon(String name, int level, int electricPower, String electricAttack) {
        super(name, level);
        this.electricPower = electricPower;
        this.electricAttack = electricAttack;
    }

    public void useElectricAttack() {
        System.out.println(getName() + " used " + electricAttack + "!");
    }

    public void gainElectricPower() {
        this.electricPower++;
        System.out.println(getName() + " gained electric power. Current electric power: " + electricPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with electricity!");
    }

    public int getElectricPower() {
        return electricPower;
    }

    public String getElectricAttack() {
        return electricAttack;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }

    public void setElectricAttack(String electricAttack) {
        this.electricAttack = electricAttack;
    }
}
