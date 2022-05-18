package entities;

import java.util.Date;

public class CarRental {
    private Date start;
    private Date finish;

    private Veiculo veiculo;
    private InVoice inVoice;


    public CarRental(Date start, Date finish, Veiculo veiculo) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public CarRental() {
    }

    public Date getStart() {
        return this.start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return this.finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public InVoice getInVoice() {
        return this.inVoice;
    }

    public void setInVoice(InVoice inVoice) {
        this.inVoice = inVoice;
    }

}
