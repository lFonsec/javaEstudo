package entities.services;

public class PaypalServico implements PagamentoOnlineServico {

    private static final double porcetagemFinal = 0.02;
	private static final double porcentagemMensal = 0.01;



	@Override
	public double paymentFee(double amount) {
		return amount * porcetagemFinal;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * porcentagemMensal * months;
	}
}
