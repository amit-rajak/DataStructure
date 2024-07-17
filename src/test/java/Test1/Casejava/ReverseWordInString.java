package Test1.Casejava;
public class ReverseWordInString {
    public static void main(String[] args) {
        String qi = "Java Concept Of The Day";
        String result = reverseWords(qi);
        System.out.println(result); // Output: avaj tpecnoc fo eht yad
    }
    private static String reverseWords(String str) {

        String word[]=str.split(" ");

         StringBuilder stringBuilder = new StringBuilder();

                 for(String ch: word){

                     StringBuilder reverseWord= new StringBuilder(ch).reverse();
                     stringBuilder.append(reverseWord).append(" ");
                 }


        return stringBuilder.toString();
    }
}
