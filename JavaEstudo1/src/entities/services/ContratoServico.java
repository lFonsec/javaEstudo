package entities.services;
import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ContratoServico {
    private PagamentoOnlineServico onlinePaymentService;
	
	public ContratoServico(PaypalServico paypalServico) {
    }

    public void ContractService(PagamentoOnlineServico onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contrato contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota =  updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            contract.addParcela(new Parcela(date, fullQuota));
        }
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
