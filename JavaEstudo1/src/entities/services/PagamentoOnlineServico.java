package entities.services;

public interface PagamentoOnlineServico {
    double paymentFee(double amount);
	double interest(double amount, int months);
}
