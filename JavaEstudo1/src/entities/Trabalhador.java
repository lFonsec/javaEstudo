package entities;

import entities.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Trabalhador {
    
    private String name;
    private NivelTrabalhador level;
    private Double baseSalary;

    private DepartamentoTrabalhador departamento;
    private List<HorasTrabalhador> contratos = new ArrayList<>();


    public void addContract(HorasTrabalhador contrato){
        contratos.add(contrato);
    }

    public void removeContract(HorasTrabalhador contrato){
        contratos.remove(contrato);
    }

    public Double income(int ano, int mes){
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HorasTrabalhador c : contratos){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                soma += c.totalValue();
            }
        }
        return soma;
    }

    public Trabalhador() {
    }


    public Trabalhador(String name, NivelTrabalhador level, Double baseSalary, DepartamentoTrabalhador departamento) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
        
    }
 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalhador getLevel() {
        return this.level;
    }

    public void setLevel(NivelTrabalhador level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public DepartamentoTrabalhador getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(DepartamentoTrabalhador departamento) {
        this.departamento = departamento;
    }

    public List<HorasTrabalhador> getContratos() {
        return this.contratos;
    }  
}
