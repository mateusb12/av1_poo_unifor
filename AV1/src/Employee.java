
public class Employee {

    private String name;
    private String cpf;
    private String email;
    private String birthday;
    private Roles post;

    public Employee(String name, String cpf, String email, String birthday, Roles post) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birthday = birthday;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Roles getPost() {
        return post;
    }

    public void setPost(Roles post) {
        this.post = post;
    }

}
