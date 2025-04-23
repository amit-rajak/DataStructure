package StreamP;

import java.util.Arrays;

public class RemoveSpacesBeforeAfterComma {
    public static void main(String[] args) {
        String input = "This     is   ,  sample string    , , for test.";

        System.out.println(removeSpace(input));


    }

    public static String removeSpace(String str){

        boolean previousWasComma = false;
        StringBuilder output = new StringBuilder();

        for(int i=0;i<str.length();i++){

            char currentChar= str.charAt(i);
            if(currentChar==','){
                int lastCharIndex= output.length()-1;
                while (lastCharIndex>=0&& output.charAt(lastCharIndex)==' '){
                    output.deleteCharAt(lastCharIndex);
                    lastCharIndex--;
                }
                output.append(currentChar);
                previousWasComma=true;
            }else if(currentChar!=' ' || !previousWasComma){
                output.append(currentChar);
                previousWasComma = false;
            }



        }


        return output.toString();
    }
}
