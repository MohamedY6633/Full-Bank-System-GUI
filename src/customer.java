import java.util.ArrayList;
import java.util.List;

public class customer extends Person {
    
    private double account_balance;
    private double descriptiontransaction ;

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public double getDescriptiontransaction() {
        return descriptiontransaction;
    }

    public void setDescriptiontransaction(double descriptiontransaction) {
        this.descriptiontransaction = descriptiontransaction;
    }

    public double withdrawfunds (double x){
        setAccount_balance(getAccount_balance()-x);
        return getAccount_balance();
    }

    public double depositfunds (double x){
        setAccount_balance(getAccount_balance()+x);
        return getAccount_balance();
    }
    
    public double calculateunterest (){
        double x = (getAccount_balance()*0.001);
        return x;
    }

}
