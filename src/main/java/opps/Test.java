package opps;

public class Test {
    public void print(float obj) {
        System.out.print("float" + obj);
    }

    public void print(int obj) {
        System.out.print("int" + obj);
    }

    public static void main(String[] args) {
        Test t = new Test();
      //  float f =1;
        t.print(3);  // This will call the print(String obj) method
    }
}
