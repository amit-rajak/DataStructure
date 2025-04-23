package CreationalDesignPattren.AbstractFactory.problem1;

public class DeviceFactoryProvider {
    public static DeviceFactory getFactory(String region){
         DeviceFactory deviceFactory  = null;

        if(region.equalsIgnoreCase("ASIA")){

            deviceFactory= new AsiaDeviceFactory();
        }
        else if (region.equalsIgnoreCase("EU")){
            deviceFactory = new EUDeviceFactory();
        }
        else if (region.equalsIgnoreCase("US")){
            deviceFactory =  new USDeviceFactory();

        }
        return  deviceFactory;
    }
}
