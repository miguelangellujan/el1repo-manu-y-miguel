package herencia.ejercicio2;

import herencia.ejercicio2.Person;

public class Staff extends Person {
    private String school;
    private double pay;
    public Staff(String name,String address,String school,Double pay){
        super(name,address);
        this.school=school;
        this.pay=pay;}
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString(String name,String address,String school,Double pay){
        return "Staff[Person["+super.toString()+"],school= "+school+",pay= "+pay+"]";

    }
}
