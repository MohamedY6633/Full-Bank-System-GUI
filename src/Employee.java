import java.util.*;

public class Employee extends Person {
    private double salary;
    private Queue<customer> waitingCustomers = new LinkedList<>();
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addCustomer(customer customer) {
        waitingCustomers.add(customer);
    }

    public void deletecustomer(){
        waitingCustomers.poll();
    }
    public boolean isempty(){
        return (waitingCustomers.isEmpty());


    }

    public String waitingCustomersToString() {
        StringBuilder customersString = new StringBuilder("Waiting Customers Are:  ");
        for (customer customer : waitingCustomers) {
            customersString.append(customer.getName()).append("  ,  ");
        }
        return customersString.toString();
    }
    
}
