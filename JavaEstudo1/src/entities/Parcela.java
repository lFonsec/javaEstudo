package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");

    public Date dataVencimento;
    public Double total;



    public Parcela(Date dataVencimento, Double total) {
        this.dataVencimento = dataVencimento;
        this.total = total;
    }

    public Date getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Parcela() {
    }

    @Override
	public String toString() {
		return sdf.format(dataVencimento) + " - " + String.format("%.2f", total);
 	}

}
