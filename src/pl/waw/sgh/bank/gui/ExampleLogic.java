package pl.waw.sgh.bank.gui;

import pl.waw.sgh.bank.Account;
import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

public class ExampleLogic extends ExampleUI {

    private Bank bank = new Bank();

    private Customer curCust = null;

    private JPopupMenu contextMenu;

    public ExampleLogic(JFrame mainWindow) {
        super();
        //
        contextMenu = new JPopupMenu("Operations on accounts");

        JMenuItem newDebitAccount = new JMenuItem("New Debit Account");
        newDebitAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (curCust == null) {
                    JOptionPane.showMessageDialog(null, "Current customer is not set");
                    return;
                }
                Account newAcc = bank.newAccount(curCust, "Debit");
                accountsTableModel.addRow(newAcc);
            }
        });
        JMenuItem newSavingsAccount = new JMenuItem("New Savings Account");
        JMenuItem newCheckingAccount = new JMenuItem("New Checking Account");
        contextMenu.add(newDebitAccount);
        contextMenu.add(newSavingsAccount);
        contextMenu.add(newCheckingAccount);
        accTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                if (mouseEvent.isPopupTrigger()) {
                    contextMenu.show(mouseEvent.getComponent(),
                            mouseEvent.getX(), mouseEvent.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        addNewCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                public void actionPerformed (ActionEvent actionEvent){
                    try {
                        Integer curCustID = Integer.parseInt(customerIDLabel.getText());
                        // Existing Customer
                        Customer cust = bank.findCustomerByID(curCustID);
                        cust.setFirstName(firstNameTextField.getText());
                        cust.setLastName(lastNameTextField.getText());
                        cust.setEmail(emailTextField.getText());
                        curCust = bank.findCustomerByID(curCustID);
                        curCust.setFirstName(firstNameTextField.getText());
                        curCust.setLastName(lastNameTextField.getText());
                        curCust.setEmail(emailTextField.getText());
                    } catch (NumberFormatException e) {
                        // NEW Customer
                        Customer newCust = bank.newCustomer(firstNameTextField.getText(),
                                curCust = bank.newCustomer(firstNameTextField.getText(),
                                        lastNameTextField.getText(), emailTextField.getText());
                        customerIDLabel.setText(newCust.getCustomerID().toString());
                        customerIDLabel.setText(curCust.getCustomerID().toString());
                    }
                }
            });

            public void actionPerformed(ActionEvent actionEvent) {
            }

            public void displayCustomer(Customer cust) {
                // Pass the customer to display to curCust
                curCust = cust;
                //
                firstNameTextField.setText(cust.getFirstName());
                lastNameTextField.setText(cust.getLastName());
                emailTextField.setText(cust.getEmail());
            }
        }
    }
}
}
        }
        }