package opps;

import java.util.Date;

public final class Imutable {
    private final String name;
    private final Date dateofBirth;
    Imutable(String name, Date dateofBirth) {
        this.name = name;

        this.dateofBirth = new Date(dateofBirth.getTime());// defenciveCopy
    }
    public String getName() {
        return name;
    }



    public Date getDateOfBirth() {

        return new Date(this.dateofBirth.getTime());// return a copy not aoriginal

    }


    public static void main(String[] args) {
        Date dob= new Date(9,1,1);

        Imutable person = new Imutable("Amit",dob);
        System.out.println("Name: " + person.getName());
        System.out.println("Date of Birth: " + person.getDateOfBirth());

        dob.setYear(95); // Change the year of the original Date object to 1995

        // Print the person's name and date of birth again to see if it changed
        System.out.println("After modifying the original Date object:");
        System.out.println("Name: " + person.getName());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
    }

}
