package CreationalDesignPattren.Factory;

public class MainFactory {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape= shapeFactory.getShape("CIRCLE");
        shape.shape();

    }
}
