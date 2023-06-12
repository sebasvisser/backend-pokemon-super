public class Pokemon {
    private String name;
    private int level;

    // Constructor
    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Methods
    public void attack() {
        System.out.println(this.name + " is attacking!");
    }

    public void defend() {
        System.out.println(this.name + " is defending!");
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
