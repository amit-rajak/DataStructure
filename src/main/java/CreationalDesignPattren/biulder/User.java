package CreationalDesignPattren.biulder;

public class User {

    private final String UserId;
    private final String mailid;
    private final String name;

    private User(UserBuilder builder){
       this.UserId= builder.UserId;

        this.mailid = builder.mailid;
        this.name = builder.name;
    }


    public String getUserId() {
        return UserId;
    }

    public String getMailid() {
        return mailid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + UserId + '\'' +
                ", mailId='" + mailid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    //inner class
    static  class  UserBuilder{
        private  String UserId;
        private  String mailid;
        private  String name;


        public UserBuilder setUserId(String userId) {
            UserId = userId;
            return  this;
        }

        public UserBuilder setMailid(String mailid) {
            this.mailid = mailid;
            return  this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build(){
            User user= new User(this);
            return user;
        }
    }


}
