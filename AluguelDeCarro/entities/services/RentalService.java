package entities.services;

import entities.CarRental;
import entities.InVoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrasilTax taxService;


    public RentalService() {
    }

    public RentalService(Double pricePerHour, Double pricePerDay, BrasilTax taxService) {
        super();
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double basicpayment;
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double)(t2-t1)/1000/60/60;
        if(hours <=12.0){
            basicpayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicpayment = Math.ceil(hours/24) * pricePerDay;
        }
        double tax = taxService.tax(basicpayment);

        carRental.setInVoice(new InVoice(basicpayment, tax));
    
    }
}
