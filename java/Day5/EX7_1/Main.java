package Day5.EX7_1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", true, "Premium");

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        double totalExpense = visit.getTotalExpense();
        System.out.println("Total Expense: $" + totalExpense);
    }
}