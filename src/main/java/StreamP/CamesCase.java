package StreamP;

public class CamesCase {
    public static void main(String[] args) {
        String input = "hello world amit";
        String camelCase = toCamelCaseCoverter(input);
        System.out.println(camelCase); // Output: HelloWorld
        StringBuilder data = new StringBuilder();

        boolean[] capitalizeNext = {false};
        //Using Java 8
        input.chars().mapToObj(c->(char)c)
                .forEach(
                        c->{
                            if(Character.isWhitespace(c)){
                                capitalizeNext[0]=true;
                                data.append(c);

                            }else {
                                if(capitalizeNext[0]){
                                    data.append(Character.toUpperCase(c));
                                    capitalizeNext[0]=false;
                                }else{
                                    data.append(Character.toLowerCase(c));
                                }
                            }
                        }
                );
        System.out.println(data);

    }

    private static String toCamelCaseCoverter(String input) {


        StringBuilder builder= new StringBuilder();

        boolean capitalizeNext=false;
        for(int i=0;i<input.length();i++){

            char c= input.charAt(i);
            if(Character.isWhitespace(c)){
                capitalizeNext= true;
                builder.append(c);
            }
            else{
                if(capitalizeNext){
                    builder.append(Character.toUpperCase(c));
                    capitalizeNext=false;
                }else
                {
                    builder.append(Character.toLowerCase(c));
                }
            }
        }


        return builder.toString();
    }
}
