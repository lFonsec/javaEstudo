package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    public Integer number;
    public Date date;
    public Double totalValue;
    
    List<Parcela> parecelas = new ArrayList<>(); 

    public void addParcela(Parcela parecela){
        parecelas.add(parecela);
    }
    
    public void removeParcela(Parcela parcela){
        parecelas.remove(parcela);
    }

    public List<Parcela> getParcelas(){
        return parecelas;
    }

    public Contrato() {
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Contrato(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

}
