package questionssbennet;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoList implements ActionListener {
    private JFrame frame;
    private JTextField taskField;
    private JButton addButton;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;

    public TodoList() {
        // Frame setup
        frame = new JFrame("To-Do List");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Panel for input and button
        JPanel inputPanel = new JPanel();
        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        addButton.addActionListener(this);
        inputPanel.add(taskField);
        inputPanel.add(addButton);

        // Panel for displaying tasks
        JPanel listPanel = new JPanel();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setPreferredSize(new Dimension(250, 120));
        listPanel.add(scrollPane);

        // Add panels to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(listPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TodoList();
            }
        });
    }
}
