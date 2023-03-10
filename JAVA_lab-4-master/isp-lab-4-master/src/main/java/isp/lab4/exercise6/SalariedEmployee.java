package isp.lab4.exercise6;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount(); 
        System.out.println("Payment Salaried Employee:");
        return weeklySalary;

    }

}
