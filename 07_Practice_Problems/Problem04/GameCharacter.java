package Problem04;

public abstract class GameCharacter {
    private String name;
    private int level;
    private double health;

    public GameCharacter(String name, int level, double health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public abstract void attack();
}
