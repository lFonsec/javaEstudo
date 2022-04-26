package entities;

import java.util.Date;


public class HorasTrabalhador {
    
    private Date date;
    private Double valuePerHour;
    private Integer hour;
    
    public double totalValue(){
        return hour*valuePerHour;
    }
    

    public HorasTrabalhador() {
    }

    public HorasTrabalhador(Date date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }


    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return this.valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return this.hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}

   
