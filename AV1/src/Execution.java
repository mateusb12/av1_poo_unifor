import javax.swing.*;
import java.util.ArrayList;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Roles> role_collection = new ArrayList();
        ArrayList employee_collection;

        System.out.println("0 = Cancelar");
        System.out.println("1 = Cadastrar cargos");
        System.out.println("2 = Excluir cargos");
        System.out.println("3 = Listar cargos");
        System.out.println("4 = Editar cargos");
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção do menu"));
        while(choice != 0){
            if(choice == 1){
                JOptionPane.showMessageDialog(null, "CADASTRANDO FUNCIONÁRIOS");
                String input_name = (JOptionPane.showInputDialog("Digite o nome do funcionário"));
                Float input_salary = Float.parseFloat((JOptionPane.showInputDialog("Digite o salário do funcionário")));
                int input_id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário"));

                Roles r = new Roles(input_name, input_salary, input_id);
                role_collection.add(r);
            }
        }

    }


}
