package DefiningClasses.PokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() { return this.element; }

    public String getName() { return this.name ; }

    public int getHealth() { return this.health; }

    public void decrement() {
        this.health -= 10;
    }
}
