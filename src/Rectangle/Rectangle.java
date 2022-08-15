package Rectangle;


public class Rectangle {
    private double side2, side1;
    public Rectangle() {
    }
    public void setside1(double side1) {
        this.side1 = side1;
    }
    public void setside2(double side2) {
        this.side2 = side2;
    }
    //расчет
    public static double perimeterCalculator(double side1, double side2) {
        double pr = (side1 + side2) * 2;
        return pr;
    }
    public double areaCalculator(double side1, double side2) {
        double sq = side1 * side2;
        return sq;
    }
    //вывод
    public void viewRectangle() {
        System.out.println("Периметр: " + perimeterCalculator(side1, side2));
        System.out.println("Площадь: " + areaCalculator(side1, side2));
    }

}
