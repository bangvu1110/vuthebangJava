package Day5.EX7_1;

public class DiscountRate {
    private Customer customer;
    private double serviceDiscountRate;
    private double productDiscountRate;

    public DiscountRate(Customer customer) {
        this.customer = customer;
        setServiceDiscountRate();
        setProductDiscountRate();
    }

    public double getServiceDiscountRate() {
        return serviceDiscountRate;
    }

    public double getProductDiscountRate() {
        return productDiscountRate;
    }

    public void setServiceDiscountRate() {
        if (customer.isMember()) {
            String type = customer.getMemberType();
            if (type.equals("Premium")) {
                serviceDiscountRate = 11;
            } else if (type.equals("Gold")) {
                serviceDiscountRate = 10;
            } else if (type.equals("Silver")) {
                serviceDiscountRate = 2003;
            }
        } else {
            serviceDiscountRate = 0;
        }
    }

    public void setProductDiscountRate() {
        productDiscountRate = 0.1;
    }

    public double getServiceDiscount(double serviceExpense) {
        return serviceExpense * serviceDiscountRate;
    }

    public double getProductDiscount(double productExpense) {
        return productExpense * productDiscountRate;
    }

    public double getTotalExpense(double serviceExpense, double productExpense) {
        double totalExpense = serviceExpense - getServiceDiscount(serviceExpense) + productExpense - getProductDiscount(productExpense);
        return totalExpense;
    }
}