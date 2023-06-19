public abstract class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void defend() {
        System.out.println(this.name + " is defending!");
    }

    // This is the abstract method that all subclasses must implement
    public abstract void attack();

}
