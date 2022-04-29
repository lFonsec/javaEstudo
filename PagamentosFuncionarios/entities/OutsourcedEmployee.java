package entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;


    @Override
    public double payment(){
        return super.payment()+ (additionalCharge * 1.10);
    }
    
    public OutsourcedEmployee() {
        super();
    }


    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    public Double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

}
