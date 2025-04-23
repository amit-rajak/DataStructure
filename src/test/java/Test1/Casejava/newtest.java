package Test1.Casejava;

public class newtest {

    public static void main(String[] args) {

        String str= "Amit@Ku&mar";
        int length= str.length();

        String result = null;

        for(int i=length;i<0;i--){

            if(Checkchar(str.charAt(i))){
                result=result +str.charAt(i)+"";
            }



        }
        System.out.println(result);



    }

    public  static boolean Checkchar(Character character){

        if(!character.isAlphabetic(character)){
            return false;
        }
        return true;
    }
}
