package entities;

public class Funcionario {
    private Integer id;
    public String name;
    private Double salary;


    public Funcionario(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumentarSalario(double porcentagem){
        salary += salary * porcentagem /100;
    }

    public String toString(){
        return id + ", " + name + ", " + salary;
    }
}
