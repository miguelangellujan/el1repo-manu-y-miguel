package polimorfismos.interfaces.ejercicio4;
public class ResizableCircle extends Circle implements Resizable{
    ResizableCircle(double radius){
        super(radius);
        this.radius=radius;}
    public String toString(){
        return "Resizable["+super.toString()+"]";}
    @Override
    public void resize(int percent){
        radius*=percent/100.0;}}