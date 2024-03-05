package herencia.ejercicio5;

public class Circle extends Shape {
    private double radius=1.0;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;}
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;}
    public double getRadius() {return radius;}
    public void setRadius(double newRadius){this.radius= newRadius;}
    public double getArea() {
        return radius * radius * Math.PI;}
    public double getPerimeter(){
        return 2*Math.PI*radius;}
    @Override
    public String toString(){
        return "Circle[Shape[color= "+getColor()+",filled= "+isFilled()+"],radius= "+radius+"]";}}