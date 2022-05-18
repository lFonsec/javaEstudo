package entities;

public class InVoice {
    private Double payment;
    private Double tax;


    public Double getTotalPayment(){
        return getPayment() + getTax();
    }
    public InVoice() {
    }

    public Double getPayment() {
        return this.payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getTax() {
        return this.tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public InVoice(Double payment, Double tax) {
        this.payment = payment;
        this.tax = tax;
    }

}
