import javax.swing.*;
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        int input_sector = 0;
        Roles programador_junior = new Roles("Programador júnior", 3500, 8493874);
        Roles programador_infra = new Roles("Programador de infraestrutura", 5250.25, 8500323);
        Roles artista_java = new Roles("Programador de infraestrutura", 4200, 8533944);
        Roles diretor_geral = new Roles("Diretor geral de software", 9250.88, 8543323);
        Roles estagiario = new Roles("Estagiário", 1400, 8143222);

        Employee funcionario1 = new Employee("Alice", "1533990603-5", "alice@hotmail.com", "22/11/1992", programador_junior);
        Employee funcionario2 = new Employee("Bruno", "5909220802-7", "bruno@hotmail.com", "01/12/1990", programador_junior);
        Employee funcionario3 = new Employee("Fernanda", "7430355404-9", "fernanda@hotmail.com", "02/04/1998", estagiario);
        Employee funcionario4 = new Employee("Bernardo", "1390216900-1", "bernardo@hotmail.com", "06/08/1988", programador_infra);


        Employee funcionario5 = new Employee("Bianca", "6996716004-7", "bianca@hotmail.com", "29/10/1994", programador_infra);
        Employee funcionario6 = new Employee("Clarice", "9491081802-2", "clarice@hotmail.com", "23/02/1983", programador_junior);
        Employee funcionario7 = new Employee("Danilo", "3750811601-1", "danilo@hotmail.com", "13/05/2003", artista_java);
        Employee funcionario8 = new Employee("Paula", "6085744200-7", "paula@hotmail.com", "27/12/2002", programador_junior);

        Employee funcionario9 = new Employee("Eva", "5799331206-0", "eva@hotmail.com", "03/04/1978", diretor_geral);

        diretor_geral.print_role();
        funcionario9.print_employee();

        ArrayList employee_collection = new ArrayList();
        employee_collection.add(funcionario1);
        employee_collection.add(funcionario2);
        employee_collection.add(funcionario3);
        employee_collection.add(funcionario4);
        employee_collection.add(funcionario5);
        employee_collection.add(funcionario6);
        employee_collection.add(funcionario7);
        employee_collection.add(funcionario8);
        employee_collection.add(funcionario9);
        Sector setor1 = new Sector(null, "Setor de Base", 30);
        System.out.println("");
        for(int i = 0; i<employee_collection.size(); i++){
            Employee aux = (Employee) employee_collection.get(i);
            System.out.println("[NOME]: " + aux.getName() + "   [CPF]: "
                    + aux.getCpf() + "   [EMAIL]: " + aux.getEmail() + "   [DATA DE NASC]: " + aux.getBirthday() + "   [CARGO]: " + aux.getPost().getName());
            JOptionPane.showMessageDialog(null, "Deseja adicionar [" + aux.getName() + "] ao setor [" + setor1.getName() + "] ?");
            input_sector = Integer.parseInt((JOptionPane.showInputDialog("1 = SIM  /    2 = NÃO")));
            if(input_sector == 1){
            }
        }

    }
}
