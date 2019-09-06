import javax.swing.*;
import java.util.ArrayList;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Roles> role_collection = new ArrayList();
        ArrayList<Employee> employee_collection = new ArrayList();

        int choice = 3;

        while(choice != 0){
            JOptionPane.showMessageDialog(null, "MENU PRINCIPAL");
            System.out.println("0 = Cancelar");
            System.out.println("@@@@@@@@@@@@@@@@");
            System.out.println("1 = Cadastrar cargos");
            System.out.println("2 = Excluir cargos");
            System.out.println("3 = Listar cargos");
            System.out.println("4 = Editar cargos");
            System.out.println("@@@@@@@@@@@@@@@@");
            System.out.println("5 = Cadastrar funcionários");
            System.out.println("6 = Excluir funcionários");
            System.out.println("7 = Listar funcionários");
            System.out.println("8 = Editar funcionários");

            choice = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção do menu"));

            if(choice == 1){
                JOptionPane.showMessageDialog(null, "CADASTRO DE CARGOS");
                int role_input_amount = Integer.parseInt(JOptionPane.showInputDialog("Quantos cargos deseja cadastrar?"));

                if(role_input_amount > 0){
                    for(int i = 1; i<=role_input_amount; i++){
                        JOptionPane.showMessageDialog(null, "#" + i);
                        String input_name = (JOptionPane.showInputDialog("Digite o nome do cargo"));
                        Float input_salary = Float.parseFloat((JOptionPane.showInputDialog("Digite o salário do cargo de " + input_name)));
                        int input_id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cargo de " + input_name));
                        Roles r = new Roles(input_name, input_salary, input_id);
                        role_collection.add(r);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "VOCÊ DIGITOU UMA QUANTIDADE INVÁLIDA");
                }
            }

            if(choice==2){
                JOptionPane.showMessageDialog(null, "REMOÇÃO DE CARGOS");
                for(int i = 0; i<role_collection.size(); i++){
                    JOptionPane.showMessageDialog(null, "[NÚMERO SEQUENCIAL]: " + i + "       [NOME]: " + role_collection.get(i).getName());
                }
                int input_remove = Integer.parseInt(JOptionPane.showInputDialog("Digite o número sequencial do cargo que você deseja remover:"));
                JOptionPane.showMessageDialog(null, "[NOME]: " + role_collection.get(input_remove).getName() + "   [SALÁRIO]: "
                        + role_collection.get(input_remove).getSalary() + "   [ID]: " + role_collection.get(input_remove).getID());
                role_collection.remove(input_remove);
                JOptionPane.showMessageDialog(null, "O cargo foi removido");
            }

            if(choice == 3){
                JOptionPane.showMessageDialog(null, "LISTAGEM DE CARGOS");
                for(int i = 0; i<role_collection.size(); i++){
                    int fixed_interator = i + 1;
                    JOptionPane.showMessageDialog(null, "CARGO #" + fixed_interator);
                    JOptionPane.showMessageDialog(null, "[NOME]: " + role_collection.get(i).getName() + "   [SALÁRIO]: "
                            + role_collection.get(i).getSalary() + "   [ID]: " + role_collection.get(i).getID());
                }
            }

            if(choice == 4){
                JOptionPane.showMessageDialog(null, "EDIÇÃO DE CARGOS");
                for(int i = 0; i<role_collection.size(); i++){
                    JOptionPane.showMessageDialog(null, "[NÚMERO SEQUENCIAL]: " + i + "       [NOME]: " + role_collection.get(i).getName());
                }
                int input_edit = Integer.parseInt(JOptionPane.showInputDialog("Digite o número sequencial do cargo que você deseja editar:"));
                String input_name = (JOptionPane.showInputDialog("Digite o nome do cargo"));
                Float input_salary = Float.parseFloat((JOptionPane.showInputDialog("Digite o salário do cargo de " + input_name)));
                int input_id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cargo de " + input_name));
                role_collection.get(input_edit).setName(input_name);
                role_collection.get(input_edit).setSalary(input_salary);
                role_collection.get(input_edit).setID(input_id);
                JOptionPane.showMessageDialog(null, "O cargo foi editado");
            }

            if(choice == 5){
                JOptionPane.showMessageDialog(null, "CADASTRO DE FUNCIONÁRIOS");
                int employee_input_amount = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários deseja cadastrar?"));

                if(employee_input_amount > 0){
                    for(int i = 1; i<=employee_input_amount; i++){
                        JOptionPane.showMessageDialog(null, "#" + i);
                        String input_name = (JOptionPane.showInputDialog("Digite o nome do funcionário"));
                        String input_cpf = (JOptionPane.showInputDialog("Digite o CPF do funcionário"));
                        String input_mail = (JOptionPane.showInputDialog("Digite o e-mail do funcionário"));
                        String input_birthday = (JOptionPane.showInputDialog("Digite a data de nascimento do funcionário"));
                        String input_id = (JOptionPane.showInputDialog("Digite o nome do cargo do funcionário"));
                        int index_role = 0;

                        for(int j = 0; j<role_collection.size(); j++){
                            if(input_id.equals(role_collection.get(j).getName())){
                                index_role = j;
                            }
                        }

                        Roles input_role = role_collection.get(index_role);
                        Employee e = new Employee(input_name, input_cpf, input_mail, input_birthday, input_role);
                        employee_collection.add(e);
                        JOptionPane.showMessageDialog(null, "[NOME]: " + e.getName() + "   [CPF]: "
                                + e.getCpf() + "   [EMAIL]: " + e.getEmail() + "   [DATA DE NASC]: " + e.getBirthday() + "   [CARGO]: " + e.getPost().getName());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "VOCÊ DIGITOU UMA QUANTIDADE INVÁLIDA");
                }
            }

            if(choice == 6){

            }




        }

    }


}
