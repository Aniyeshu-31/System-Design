public class Main {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape shapeobj = obj.getShape("CIRCLE");
        shapeobj.draw();
    }
}
