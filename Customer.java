//2- Create Customer class, it should extend Person  class
// and it should have extra customerID(auto genarate we will not have it on constructor) and balance.
//
//Required extra functions: getBalance, setBalance.
//
//Overide toString again and print extra customerID
//override equals function and check if username and password matchs or customerID and password match.
// IF any of cases are correct we will return true.

import java.util.Objects;

class Customer extends Person{
    private int customerID;
    private double balance;
     public Customer(String name, int age, String userName, String password, double balance) {
         super(name, age, userName, password);
         this.balance = balance;
         this.customerID = (int)(1000000*Math.random());
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

    public int getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", balance=" + balance +
                "} " ;
    }
    //override equals function and check if username and password matchs or customerID and password match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return super.equals(o) || (customerID == customer.customerID && password.equals(customer.password));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerID, balance);
    }




    }


