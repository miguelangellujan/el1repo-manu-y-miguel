package composicion_agregación.ejercicio1;

public class Author {
    private String name;
    private String email;
    public Author(String name,String email){
        this.name=name;
        this.email=email;}
    public String getName() {
        return name;}
    public String getEmail() {
        return email;}
    public void setEmail(String email) {
        this.email = email;}
    public String toString(){
        return "ejerciciosclase.ejercicio1.Author[name= "+name+",email= "+email+"]";
    }
}