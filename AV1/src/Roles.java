
public class Roles {

    private String name;
    private double salary;
    private int ID;

    public Roles(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public void print_role(){
        System.out.println("[Role_Name] " + this.name + "   [Role_Salary] " + this.salary + "   [Role_ID] " + this.ID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }




}
