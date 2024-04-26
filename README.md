# Library-Managment_Java-Gui
The owner of a library wants to digitalize the process of library management, so help 
him in this process by witing a java program that stores the details(book id, book name, 
author, price) of books in a file, It should be able to add new books to file, Lend books to 
Readers and their details in order to lend books. The reader can search books by book 
name, book id. He wants to do this in proper and easy manner as he feels that compiler 
and terminal inputs are difficult and not easy to understand so, you have to use 
Graphical User Interface  






GUI (Graphical user interface) for library management system:
![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/d33a94f8-f04c-4af7-ad98-4198449c47fa)

Adding book to array list:

![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/da95dde3-bcac-49b0-97cd-844fbe1b47bd)
Display books:
![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/e79c550e-abb9-412e-8f66-70aeb88bec07)




 
 
Search book by name:

CASE 1: Book present in array list

 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/67214a7e-8933-4379-9073-a9f70928d7e7)

 Search by name(CASE 2: Book  not present in array list):
 
 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/6ce59538-661d-49c2-b4cd-9359964e80b8)
![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/8475cfd4-1753-4ecf-9278-3ad0f824e544)

Search book by id:


CASE 1: Book present in array list
![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/34dbac84-5ece-4776-bba4-746e291dc6c5)

  Search by id(CASE 2: Book  not present in array list)

 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/b2c28f40-7a47-46d5-9e05-cbaebad3da12)

LEND BOOK CASE 1:
1)Book lent to customer as book is present in available books in library 
 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/b6acbb83-8f02-41f2-94a2-8536427019a1)
 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/58957c94-a252-45f2-bca2-65318f8c3240)



 
2)Book not  lent to customer as book is not  present in available books in library  and it is taken by another customer.
 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/89732db9-ded2-428f-a3f6-49741c37083e)

3)Book not  lent to customer as book is not  at all present in library and is not available :

 ![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/af1b5607-09cd-470b-886b-97bdc704824e)

Display books lent to customer:

![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/2cee215b-9f47-46a2-9937-acaa4f664a01)


 
Corresponding  console input for each click in Gui :

![image](https://github.com/yasaswini2005/Library-Managment_Java-Gui/assets/139364347/d9f5fa23-35e9-4c5c-acb4-517d8806eca4)
 <br>ABSTRACT 
                                              
The library management system features a user-friendly GUI for efficient 
book management. Owners can input book details like ID, name, author, and 
price, all stored in a file for easy access. New books can be swiftly added to the 
inventory using the intuitive interface. When lending books, readers' details are 
recorded along with book information. Readers can conveniently search for books 
by name or ID through the GUI. The system eliminates the need for complex 
terminal interactions, enhancing usability. Data persistence ensures all records 
remain secure even after closing the application. This digitalization greatly 
streamlines library management tasks. With its intuitive design, the system makes 
book lending and inventory management hassle-free. It improves accessibility 
and organization in the library workflow. The GUI provides a seamless 
experience for both owners and readers alike. Overall, the system offers a robust 
solution for modern library management needs. <br>
 
INDEX 
S.NO    TITLE 
1 Introduction 
2 Aim of the Project                                 
2.1 Advantages & Disadvantages 
2.2 Future Implementation 
3 Software & Hardware Details           
4 Class Diagram                                             
5  Implementation                                                 
 6 Outputs/ScreenShots 
7 Conclusion 
 
 
 
 
 
 
 
6 
 
#INTRODUCTION 
 
      Introducing the Library Management System: 
Our Library Management System is a modern solution designed to 
digitalize and streamline the process of managing books and lending them to 
readers. With a user-friendly Graphical User Interface (GUI), this system offers 
an intuitive platform for efficient library management. Owners can easily store 
book details such as ID, name, author, and price, all securely stored in a file for 
quick access. Adding new books to the inventory is a breeze, thanks to the 
intuitive interface. When lending books, reader details are seamlessly recorded 
alongside book information. Readers can conveniently search for books by name 
or ID, enhancing accessibility. By eliminating complex terminal interactions, our 
system ensures a smooth and hassle-free experience for both owners and readers. 
With robust data persistence, all records remain secure even after closing the 
application. This digitalization revolutionizes library management, offering 
efficiency, accessibility, and organization like never before.                       
 
   
 
 
 
 
#AIM 
 
7 
 
 
The aim of this project is to create a Java program with a Graphical User 
Interface (GUI) for digitalizing the process of library management. The program 
should allow the owner of the library to store details of books (such as book ID, 
book name, author, and price) in a file, add new books to the file, and lend books 
to readers while recording their details. 
#Advantages: - 
Efficiency: Our system streamlines library operations, reducing manual tasks and 
saving time for both owners and readers. 
Accessibility: With a user-friendly GUI, the system is easy to navigate, making 
book management and lending accessible to all users. 
Organization: Book details and lending records are stored systematically in a file, 
ensuring a well-organized library inventory. 
Convenience: Owners can quickly add new books to the inventory and lend them 
to readers without hassle, thanks to the intuitive interface. 
Searchability: Readers can easily search for books by name or ID, enhancing their 
ability to find desired books efficiently. 
Digitalization: The system eliminates the need for manual bookkeeping, reducing 
paperwork and promoting environmental sustainability. 
Scalability: As the library grows, the system can easily accommodate an 
expanding inventory and increasing number of readers. 
 
#SOFTWARE REQUIREMENTS: 
 

 
 The major software requirements of the project are as follows: 
  Language           :   JAVA 
 Operating system:   Windows XP or later. 
 Tools                   :  Eclipse IDE 
  
#HARDWARE REQUIREMENTS: 
           The hardware requirements that map towards the software are as follows:  
            RAM             : just a few kilobytes  
            Processor       : Basic processor found in modern computer
CONCLUSION & FUTURE WORK 
In conclusion, our Library Management System offers a comprehensive 
solution for modernizing library operations. With its user-friendly Graphical User 
Interface (GUI), efficient book management, and seamless lending process, the 
system significantly enhances the overall efficiency and accessibility of library 
services. By storing book details and lending records in a secure file, the system 
ensures organization and data integrity. Moreover, its searchability feature allows 
readers to easily find books of interest, contributing to a satisfying user 
experience for both owners and readers. Overall, our system marks a significant 
advancement in library management, making operations smoother and more 
streamlined. 
Future Work: 
Looking ahead,  there are several avenues for further improvement and expansion 
of the Library Management System: 
Integration with Online Platforms: Developing an online platform that allows 
readers to browse and borrow books remotely. 
Enhanced Reporting: Implementing advanced reporting features to provide 
insights into book popularity, reader demographics, and lending trends. 
These future enhancements will further elevate the Library Management System, 
making it even more efficient, user-friendly, and adaptable to the evolving needs 
of libraries and their patrons. 
