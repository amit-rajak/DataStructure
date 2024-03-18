package codeing;

public class Nore {
    public static void main(String[] args) {
        String input = "ava articles are Awesome";
        //Find the first non-repeated character using Java 8 features
        System.out.println(NorepratingChar(input));
    }


    public static char NorepratingChar(String str)
    {
        int cout=1;
        for(int i=0;i<str.length();i++)
        {
            for(int j=1;i<str.length();j++)
            {
                if(str.charAt(i)!=str.charAt(j))
                {

                    continue;
                }
                else
                {
                    cout++;
                }

            }
        }
        return 0;
    }
}
