package CreationalDesignPattren.biulder;

public class MainBuilder {
    public static void main(String[] args) {
        User user= new User.UserBuilder().setUserId("1bosun").setMailid("dsf").setName("vzscgs").build();
        System.out.println(user);
    }
}


