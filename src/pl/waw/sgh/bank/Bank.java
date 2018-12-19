package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> custList = new ArrayList<>();

    private List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 100;

    //public API
    public Customer newCustomer(String firstName,
                                String lastName,
                                String email) {
        Customer cust = new Customer(lastCustID++, firstName,
                lastName, email);
        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType) {
        Account acc;
        switch (accType) {
            case "Savings":
                acc = new SavingsAccount(lastAccID++, 0.0, cust);
                break;
            case "Debit":
                acc = new DebitAccount(lastAccID++, 0.0, cust);
                break;
            default:
                acc = new CheckingAccount(lastAccID++, 0.0, cust);
                break;
        }
        accList.add(acc);
        return acc;
    }

    private Account findAccountByID(Integer accID) throws NonExistingAccountException {
        for (Account acc : accList) {
            /*if (acc.getAccountID().equals(accID))
            return acc;*/
            return acc;
        }
        throw new NonExistingAccountException(accID);
    }


    public void transfer(int fromAccID, int toAccID, Double amount)
            throws NotEnoughMoneyException {
        try {

            Account fromAcc = findAccountByID(fromAccID);
            Account toAcc = findAccountByID(toAccID);
            fromAcc.charge(amount);
            toAcc.deposit(amount);
        } catch (NonExistingAccountException e) {
            System.out.println("No such account");
        }

        private int findCurCustIdx (Integer) {

        }

        public Customer getPrevCustomer (Integer curCustID){
            int curCustIdx = -1;
            for (Customer cust : custList) {
                if (cust.getCustomerID().equals(curCustID))
                    custList.indexOf(cust);
            }
            if (curCustIdx > 0)
                return custList.get(curCustIdx - 1);
            else
                return null;
        }
        public Customer getNextCustomer (Integer curCustID){
            int curCustIdx = findCurCustIdx(curCustID);
            if (curCustIdx < custList.size() - 1)
                return custList.get(CurCustIdx + 1);
            else
                return null;

        }


        /*if (FromAcc==null)
        {

            JOptionPane.showMessageDialog(null,"The account you want to transfer money from  " +
                    "does not exist.");
            return;
        }

        if (ToAcc==null)
        {
            JOptionPane.showMessageDialog(null,"The account you want to transfer money to " +
                    "does not exist.");
            return;
        }

        if(new BigDecimal(amount).compareTo(FromAcc.getBalance()) == 1)
        {
            JOptionPane.showMessageDialog(null,"Not enough money to finalize the transfer.");
            return;
        }
        if(amount < 0)
        {
            JOptionPane.showMessageDialog(null, "You can not transfer negative values.");
            return;
        }*/

    }

    @Override
    public String toString() {
        return "bank{" +
                "custs=\n" + custList +
                ", \naccs=\n" + accList +
                '}';
    }


}
