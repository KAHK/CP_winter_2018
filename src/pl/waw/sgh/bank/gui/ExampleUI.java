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

public class ExampleUI {
    protected JPanel customerMainPanel;
    protected JButton nextButton;
    protected JButton saveButton;
    protected JButton deleteButton;
    protected JTable accTable;


    protected AccountTableModel accountsTableModel;

    protected void createUIComponents() {
        // TODO: place custom component creation code here
        accountsTableModel = new AccountTableModel();
        accTable = new JTable(accountsTableModel);
        // Accounts table
    }

}