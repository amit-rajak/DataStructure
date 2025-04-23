package CreationalDesignPattren.Prototype.problem3;

public class GameCharacter  implements  RPGgame{


     String  name;
     String health;
     String strength;
     String equipment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public GameCharacter(String name, String health, String strength, String equipment) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.equipment = equipment;
    }

    @Override
    public RPGgame clone() {
        return new GameCharacter(this.name,this.health,this.strength,this.equipment);
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health='" + health + '\'' +
                ", strength='" + strength + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
