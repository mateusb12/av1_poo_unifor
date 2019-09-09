import java.util.ArrayList;

public class Sector {

    private ArrayList employee_compilation;
    private String name;
    private int employee_amount;

    public ArrayList getEmployee_compilation() {
        return employee_compilation;
    }

    public void setEmployee_compilation(ArrayList employee_compilation) {
        this.employee_compilation = employee_compilation;
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

    public Sector(ArrayList employee_compilation, String name, int employee_amount) {
        this.employee_compilation = employee_compilation;
        this.name = name;
        this.employee_amount = employee_amount;
    }




}
