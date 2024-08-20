package StreamP;


@FunctionalInterface
public interface CodeCheck {
    int sum(int a,int b);

    public static void sum1(int a,int b){
      System.out.println(a+b);
    }
    public static int sumn(int a,int b){
       return a+b;
    }
    default void sum3(){

    }
    default void sum4(){

    }
}

class IntMain{
    public static void main(String[] args) {

        CodeCheck codeCheck=(a,b)->a+b;
        System.out.println(codeCheck.sum(10,20));

        CodeCheck.sum1(20,40);

        int result= CodeCheck.sumn(90,10);
        System.out.println(result);
    }
}
