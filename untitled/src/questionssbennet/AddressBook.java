package questionssbennet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddressBook implements ActionListener {
    JFrame frame;
    JLabel nameLabel, phoneLabel, emailLabel;
    JTextField nameField, phoneField, emailField;
    JButton addButton, deleteButton;
    JList<String> contactList;
    DefaultListModel<String> listModel;

    ArrayList<Contact> contacts;

    AddressBook() {
        frame = new JFrame("Address Book");
        nameLabel = new JLabel("Name:");
        phoneLabel = new JLabel("Phone:");
        emailLabel = new JLabel("Email:");
        nameField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel);

        contacts = new ArrayList<>();

        JPanel panel = new JPanel();
        panel.setLayout(null);

        nameLabel.setBounds(20, 20, 80, 25);
        nameField.setBounds(100, 20, 200, 25);
        phoneLabel.setBounds(20, 50, 80, 25);
        phoneField.setBounds(100, 50, 200, 25);
        emailLabel.setBounds(20, 80, 80, 25);
        emailField.setBounds(100, 80, 200, 25);
        addButton.setBounds(20, 110, 80, 25);
        deleteButton.setBounds(120, 110, 80, 25);
        contactList.setBounds(20, 140, 300, 150);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(contactList);

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        frame.add(panel);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            Contact newContact = new Contact(name, phone, email);
            contacts.add(newContact);
            listModel.addElement(newContact.getName() + " - " + newContact.getPhone() + " - " + newContact.getEmail());
            clearFields();
        } else if (e.getSource() == deleteButton) {
            int selectedIndex = contactList.getSelectedIndex();
            if (selectedIndex != -1) {
                contacts.remove(selectedIndex);
                listModel.remove(selectedIndex);
            }
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        new AddressBook();
    }

    class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }
    }
}
