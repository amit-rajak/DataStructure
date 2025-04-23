package CreationalDesignPattren.AbstractFactory.problem1;

public class Client {

    public static void main(String[] args) {

        DeviceFactory factory = DeviceFactoryProvider.getFactory("ASIA");
        Laptop laptop =  factory.createLaptop();
         Phone phone  = factory.createPhone();

         System.out.println("Device from Specific region");
         laptop.specification();
         phone.specification();



    }
}
