package CreationalDesignPattren.Prototype.problem3;

public class MageCharacter  implements  RPGgame{

   String specialSkill;
   String mana;

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public MageCharacter(String specialSkill, String mana) {
        this.specialSkill = specialSkill;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "MageCharacter{" +
                "specialSkill='" + specialSkill + '\'' +
                ", mana='" + mana + '\'' +
                '}';
    }

    @Override
    public RPGgame clone() {
        return new MageCharacter(this.specialSkill,this.mana);
    }
}
