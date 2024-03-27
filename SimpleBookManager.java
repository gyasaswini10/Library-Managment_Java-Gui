package Library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class SimpleBookManager {
	public static void main(String[] args) {
        new SimpleBookManager();
    }
	    JFrame frame;
	    JTextField idField, nameField, authorField, priceField;
	    JButton addButton, displayButton;
	    JTextArea displayArea;
	    JLabel idLabel, nameLabel, authorLabel, priceLabel;
	    ArrayList<Book> books = new ArrayList<>();

	    public SimpleBookManager() {
	        frame = new JFrame("Simple Book Manager");
	        frame.setSize(400, 300);
	        frame.setLayout(null);

	        idField = new JTextField();
	        idField.setBounds(10, 10, 100, 25);
	        frame.add(idField);

	        nameField = new JTextField();
	        nameField.setBounds(120, 10, 100, 25);
	        frame.add(nameField);

	        authorField = new JTextField();
	        authorField.setBounds(230, 10, 100, 25);
	        frame.add(authorField);
	        idLabel = new JLabel("ID:"); // Initialize JLabels here
	        idLabel.setBounds(10, 10, 30, 25);
	        frame.add(idLabel);

	        idField = new JTextField();
	        idField.setBounds(50, 10, 100, 25);
	        frame.add(idField);

	        nameLabel = new JLabel("Name:");
	        nameLabel.setBounds(160, 10, 50, 25);
	        frame.add(nameLabel);

	        nameField = new JTextField();
	        nameField.setBounds(210, 10, 100, 25);
	        frame.add(nameField);

	        authorLabel = new JLabel("Author:");
	        authorLabel.setBounds(10, 40, 50, 25);
	        frame.add(authorLabel);

	        authorField = new JTextField();
	        authorField.setBounds(60, 40, 100, 25);
	        frame.add(authorField);

	        priceLabel = new JLabel("Price:");
	        priceLabel.setBounds(170, 40, 50, 25);
	        frame.add(priceLabel);

	        priceField = new JTextField();
	        priceField.setBounds(340, 10, 100, 25);
	        frame.add(priceField);

	        addButton = new JButton("Add Book");
	        addButton.setBounds(10, 40, 150, 25);
	        addButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                long id = Long.parseLong(idField.getText());
	                String name = nameField.getText();
	                String author = authorField.getText();
	                float price = Float.parseFloat(priceField.getText());
	                books.add(new Book(id, name, author, price));
	                displayBooks();
	            }
	        });
	        frame.add(addButton);

	        displayButton = new JButton("Display Books");
	        displayButton.setBounds(170, 40, 150, 25);
	        displayButton.addActionListener((ActionListener) new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                displayBooks();
	            }
	        });
	        frame.add(displayButton);

	        displayArea = new JTextArea();
	        displayArea.setBounds(10, 70, 400, 180);
	        frame.add(displayArea);

	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public void displayBooks() {
	        displayArea.setText("");
	        for (Book book : books) {
	            displayArea.append("ID: " + book.id + ", Name: " + book.name + ", Author: " + book.author + ", Price: " + book.price + "\n");
	        }
	    }

	    
	}

