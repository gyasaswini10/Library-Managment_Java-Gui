package Library;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class LibraryFrame implements ActionListener{
	JFrame s;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton bu1,bu2,bu3,bu4;
	 ArrayList<Book> b=new ArrayList<Book>();
	public static void main(String[] args) 
	{
		new LibraryFrame();	
	}
	LibraryFrame()
	{
		s=new JFrame("Simple library managment system");
		s.setSize(700, 900);
		s.setLayout(null);
		l1=new JLabel("NAME");
		l1.setBounds(100, 50, 100, 50);
		s.add(l1);
		t1=new JTextField();
		t1.setBounds(250, 50, 100, 50);
		s.add(t1);
		
		l2=new JLabel("ID");
		l2.setBounds(100, 150, 100, 50);
		s.add(l2);
		t2=new JTextField();
		t2.setBounds(250, 150, 100, 50);
		s.add(t2);
		
		l3=new JLabel("	Author");
		l3.setBounds(100, 250, 100, 50);
	
		s.add(l3);
		t3=new JTextField();
		t3.setBounds(250, 250, 100, 50);
		s.add(t3);
		l4=new JLabel("Price");
		l4.setBounds(100,350,100,50);
		
		s.add(l4);
		t4=new JTextField();
		t4.setBounds(250, 350, 100, 50);
		s.add(t4);

		
		bu1=new JButton("Add Book ");
		bu1.setBounds(250, 450, 100, 50);
		bu1.addActionListener(this);
		s.add(bu1);

		bu2=new JButton( "Display Available books");
	
		bu2.setBounds(200, 550, 200, 50);
		bu2.addActionListener(this);
		s.add(bu2);
		l5=new JLabel("search book by name");
		l5.setBounds(100,650,150,50);
		
		s.add(l5);
		t5=new JTextField();
		t5.setBounds(250, 650, 100, 50);
		s.add(t5);
		bu3=new JButton("search ");
		bu3.setBounds(400, 650, 100, 50);
		bu3.addActionListener(this);
		s.add(bu3);
		l6=new JLabel("search book by id");
		l6.setBounds(100,750,100,50);
		
		s.add(l6);
		t6=new JTextField();
		t6.setBounds(250, 750, 100, 50);
		s.add(t6);
		bu4=new JButton("search ");
		bu4.setBounds(400, 750, 100, 50);
		bu4.addActionListener(this);
		s.add(bu4);
		
		s.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bu1) {
			System.out.println("Book added");
	
			b.add(new Book(Long.parseLong(t2.getText()),t1.getText(),t3.getText(),Float.parseFloat( t4.getText())));
		
		}
		if(e.getSource()==bu2) {
			System.out.println(b);
		}
		if(e.getSource()==bu3) {
			String nameTosearch=t5.getText();
			 int i;
			 for(i=0;i<b.size();i++) {
			
			 if(b.get(i).name.equals(  nameTosearch)) {
				 System.out.println("Found by "+nameTosearch);
				 break;
			 }
			 }
			 if(i==b.size()) {
				 System.out.println("Not found of name");
			 }
		}
		if(e.getSource()==bu4) {
			long idTosearch=Long.parseLong(t6.getText());
			 int i;
			 for(i=0;i<b.size();i++) {
			
			 if(b.get(i).id==idTosearch) {
				 System.out.println("book Found by id"+idTosearch);
				 break;
			 }
			 }
			 if(i==b.size()) {
				 System.out.println("Not found of id"+idTosearch);
			 }
		}
	}
		}

//The owner of a library wants to digitalize the process of library management, so help 
//him in this process by witing a java program that stores the details(book id, book name, 
//author, price) of books in a file, It should be able to add new books to file, Lend books to 
//Readers and their details in order to lend books. The reader can search books by book 
//name, book id. He wants to do this in proper and easy manner as he feels that compiler 
//and terminal inputs are difficult and not easy to understand so, you have to use 
//Graphical User Interface  
//----------------------------------------------------------
//|                 Library Management System              |
//|--------------------------------------------------------|
//| ID:   [             ]                                  |
//| Name: [             ]                                  |
//| Author:[             ]                                 |
//| Price: [            ]                                  |
//| Add Book Button                                        |
//|--------------------------------------------------------|
//|                      Display                                  |
//|                                                        |
//|--------------------------------------------------------|
//| Search by ID: [                ]                        |
//| Search by ID Button                                     |
//|                                                        |
//| Search by Name: [             ]                         |
//| Search by Name Button                                  |
//----------------------------------------------------------

