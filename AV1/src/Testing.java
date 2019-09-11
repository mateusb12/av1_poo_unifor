public class Testing {
    public static void main(String[] args) {
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

    }
}
