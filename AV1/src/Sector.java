import java.util.ArrayList;

public class Sector {

    private String name;
    private int employee_amount;
    private Employee[] employee_compilation = new Employee[50];

    public Sector(Employee[] compilation_input, String name, int employee_amount) {
        this.name = name;
        this.employee_amount = employee_amount;
        for(int i = 0; i <= compilation_input.length; i++){

        }

    }

    public Employee[] getEmployee_compilation() {
        return employee_compilation;
    }

    public void setEmployee_compilation(Employee[] employee_compilation) {
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






}
