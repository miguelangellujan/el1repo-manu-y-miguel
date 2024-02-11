import static java.awt.Color.green;

public class TestCircle {
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println("El radio mide "
                + c1.getRadius() + " y el area tiene un valor de   " + c1.getArea());

        circle c2 = new circle(2.0);

        System.out.println("El radio mide "
                + c2.getRadius() + " y el area tiene un valor de " + c2.getArea());

        circle c3 = new circle(4.3, "rojo");
        System.out.println("El radio mide: " + c3.getRadius() + ",el area tiene un valor de: " + c3.getArea() + ",y es de color: " + c3.getColor());

        circle c4 = new circle();
        c4.setRadius(6.8);
        c4.setColor("azul");
        System.out.println("El radio mide: " + c4.getRadius() + ",el area tiene un valor de: " + c4.getArea() + ",y es de color: " + c4.getColor());

        //Forma explícita
        circle c5 = new circle();
        System.out.println(c5.toString());
        //Forma implícita
        circle c6=new circle(7.3);
        System.out.println(c6);
    }}


