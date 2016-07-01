README
Mani Bhargavi Ketha
Student ID:W1186016
COEN 275 
Course Number: 36292
Assignment 3 
Due Date:May 19,2016

ENVIRONMENT:Eclipse IDE for Java Developers

Version: Luna Service Release 2 (4.4.2)

INTRODUCTION:
The original entity classes had  a lot of strings being printed to the console. In order to adapt for a GUI based JAVA application, changes were made to all of these system.out.println statements to return strings instead so that these string can be displayed on the GUI in result labels. 

In the encryptordecryptor class there were no changes made  except in the situations were println statements had been used. These were now made to return a string with the same message. Similarly for the DocStore class the return type for the getDoc() methods were changed so that they returned a string. This string was the encrypted or decrypted content or an error message. In the Document class there were no changes made to anything in regards to the return type. A getter method getName() was added. This was done because the program required a unique identifier to distinguish between docStore objects which were being saved in the DocSafe class. This identifier was used to pull the correct DocStore from which  correct Documents were retrieved.

All the methods were added in the DocSafe class with the main method where the GUI was created with a JFrame and tabbed panel. In this class code was added to save the docstore objects created in to an array list so that different documents can be saved into different docstores. Here the name was used as an identifier to distinguish between different docstores. Exception Handling was also implemented in the code to deal with exceptions such as java.lang.NumberFormatException.

Note: An icon image has been implemented which is to be displayed in the panels as well as the tabs. If the link is broken please update the link in the code. The code to be changed and updated with a fixed link has been highlighted. A .jpg image has also been supplied in the zip file submission made in Camino.