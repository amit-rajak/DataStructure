package IntesrviewTest;

public class ReverseStringPreservedSpecialChar {

    public static void main(String[] args) {
        String str = "Wal@ma&rt";
        //Output:  str = "tra@ml&aW"
        System.out.println(reverse(str,0,str.length()-1));
    }

    public static  String reverse(String str,int start, int end){

       StringBuilder result = new StringBuilder(str);

        while (start<end){
            if(!Character.isLetterOrDigit(str.charAt(start))){
                start++;
            }
            else  if(!Character.isLetterOrDigit(str.charAt(end))){
                end--;
            }
            else{
                char temp=str.charAt(start);
               result.setCharAt(start,str.charAt(end));
               result.setCharAt(end,temp);
               end--;
               start++;
            }
        }
        return result.toString();
    }
}
