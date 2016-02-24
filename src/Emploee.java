
public class Emploee {
    private String firstname;
    private String lastname;
    private String occupation;
    private long telephone;
    static int numberOfEmployees=0;

public  void set(String Firstname,String Lastname,String occupation, long telephone){
this.firstname=firstname;this.lastname=lastname;}

public void get(){
System.out.println(this.firstname+" "+this.lastname+" "+this.occupation+" "+telephone+" "+numberOfEmployees);};

    public Emploee(){numberOfEmployees++;}

}
