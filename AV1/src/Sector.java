import java.util.ArrayList;

public class Sector {

    private ArrayList employee_collection;
    private String name;
    private int employee_amount;

    public Sector(ArrayList employee_collection, String name, int employee_amount) {
        this.employee_collection = employee_collection;
        this.name = name;
        this.employee_amount = employee_amount;
    }

    public ArrayList getEmployee_collection() {
        return employee_collection;
    }

    public void setEmployee_collection(ArrayList employee_collection) {
        this.employee_collection = employee_collection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_amount() {
        return employee_amount;
    }

    public void setEmployee_amount(int employee_amount) {
        this.employee_amount = employee_amount;
    }



}
