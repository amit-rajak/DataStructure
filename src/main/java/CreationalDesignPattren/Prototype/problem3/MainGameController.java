package CreationalDesignPattren.Prototype.problem3;

public class MainGameController {

    public static void main(String[] args) {

        CharacterRegistry characterRegistry = new CharacterRegistry();
        characterRegistry.setRegistry("Warrior",new GameCharacter("roda","80%", "80%", "Scral"));
        GameCharacter originalGameCharacterObject  =  (GameCharacter) characterRegistry.getRegistry("Warrior");

        System .out.println("Character registry main object  :"+ originalGameCharacterObject);

        System.out.println("========Now clone and tweak orignalGameCharacterObject========");

        GameCharacter colnedObject = (GameCharacter) originalGameCharacterObject.clone();
        System.out.println("cloned object :"+ originalGameCharacterObject);

        System.out.println("===================Tweak the cloned object==================");
        colnedObject.setStrength("90%");
        colnedObject.setEquipment("AK47");

        System.out.println("\n" + colnedObject);





    }
}
