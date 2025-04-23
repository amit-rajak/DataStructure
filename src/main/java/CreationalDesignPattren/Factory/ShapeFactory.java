package CreationalDesignPattren.Factory;

public class ShapeFactory {

   Shape getShape(String str){
        switch (str){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;

        }
    }

}
