import javax.swing.*;             // Provides classes for creating graphical user interfaces (GUIs) in Java.
import java.awt.event.ActionEvent;       // Represents an action event in a GUI, like a button click.
import java.awt.event.ActionListener;     // Interface for classes that respond to action events.
import java.text.ParseException;           // Represents errors that occur while parsing text to a different format, such as dates.
import java.awt.Dimension;                // Represents the width and height dimensions of components in a GUI.
import javax.swing.JButton;               // Represents a GUI button that users can click on.
import java.awt.Font;                     // Represents fonts that can be used in GUI components.
import java.awt.*;                        // Core AWT (Abstract Window Toolkit) package, provides basic GUI components and layouts.
import java.awt.event.*;                  // Provides interfaces and classes for handling different types of GUI events.
import java.util.*;                       // Provides various utility classes and interfaces (e.g., lists, sets, maps).
import javax.swing.border.*;              // Provides borders that can be applied to GUI components.
import javax.swing.JLabel;                // Represents a text label in a GUI, which can display text or icons.
import javax.swing.text.*;                // Provides classes for advanced text display and manipulation in GUIs.
import java.awt.event.FocusEvent;         // Represents an event where a GUI component gains or loses focus.
import java.awt.event.FocusListener;      // Interface for classes that respond to focus events.
import java.util.ArrayList;               // A resizable array, part of the Java Collections Framework.
import java.awt.Toolkit;                  //for beep sound



//importing required packages
/**
 * Write a description of class Student_GUI here.
 *
 * @author (Aasutosh verma)
 * @version (1.0.0)
 */

public class Student_GUI implements ActionListener  //main class implements action listener
{
    // instance variables - replace the example below with your own
    private JFrame mainFrame;//Top level Container(Main window or Frame).
    //JPanel-A class in the Java Swing library that represents a container for holding and organizing other GUI components.
    private JPanel regularPanel, dropoutPanel1;
    //JLabel- It is used to display a single line of non-editable text or an image on a Java graphical user interface (GUI).
    private JLabel studentNameLabel,enrollmentIDLabel, dateOfEnrollmentLabel, courseNameLabel, courseDurationLabel, dateOfBirthLabel, tuitionFeeLabel, numOfModulesLabel, numOfCreditHoursLabel, daysPresentLabel, studentNameLabel1,enrollmentIDLabel1, dateOfEnrollmentLabel1, courseNameLabel1, courseDurationLabel1, dateOfBirthLabel1, tuitionFeeLabel1, numOfRemainingModulesLabel ,numOfMonthsAttendedLabel, dateOfDropoutLabel;

    //Text Field for Regular
    /* A class in the Java Swing library that represents a single-line text input field. */
    private JTextField studentNameText;
    private JTextField enrollmentIDText;
    private JTextField courseNameText;
    private JTextField courseDurationText;
    private JTextField tuitionFeeText;
    private JTextField numOfModulesText;
    private JTextField numOfCreditHoursText;
    private JTextField daysPresentText;
    private int numOfMonthsAttended, numOfRemainingModules;
    

    //Text Field for Dropout
    private JTextField studentNameText1;
    private JTextField enrollmentIDText1;
    private JTextField courseNameText1;
    private JTextField courseDurationText1;
    private JTextField tuitionFeeText1;
    private JTextField numOfRemainingModulesText;
    private JTextField numOfMonthsAttendedText;
    

    //JComboBox-A class in the Java Swing library that represents a drop-down list or combo box component in a graphical user interface (GUI). 
    private JComboBox<String> birthDateComboBox, birthDateComboBox1, birthDateComboBox2, birthDateComboBox0, birthDateComboBox01, birthDateComboBox02;
    private JComboBox<String> enrollmentDateComboBox, enrollmentDateComboBox1, enrollmentDateComboBox2, enrollmentDateComboBox0, enrollmentDateComboBox01, enrollmentDateComboBox02;
    private JComboBox<String> dropoutDateComboBox0, dropoutDateComboBox01, dropoutDateComboBox02;

    //JButton-It used to create clickable buttons that can trigger actions when pressed.
    private JButton addaRegularStudentButton, calculatepresentPercentageofRegularStudentButton, grantCertificateofRegularStudentButton, displayButton, clearButton;
    private JButton addaDropoutStudentButton, paythebillsofDropoutStudentButton, removeDropoutStudentButton, displayButton1, clearButton1;

    private JList<String> regularStudentList;
    private JList<String> dropoutStudentList;
    private double dayspresent;
    private  String studentName, dateOfBirth, courseName, dateOfEnrollment,dateOfDropout;;
    private int courseDuration,enrollmentID,numOfCreditHours,numOfModules;
    private double tuitionFee,daysPresent;

    //This is the declaration of the ArrayList.
    private ArrayList <Student> arraylist = new ArrayList <Student>(); //The ArrayList<Student>() is called a constructor, which initializes a new ArrayList. The <Student> in the constructor indicates that this ArrayList will store Student objects.

    public Student_GUI()
    {
        mainFrame = new JFrame("Student GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(1, 2));

        /*----------------------------PANEL-1--------------------------------------*/
        regularPanel = new JPanel(null);

        /*-----------------------------LABEL---------------------------------------*/
        JLabel titleLabel = new JLabel("REGULAR FORM");
        studentNameLabel = new JLabel("Student Name");
        enrollmentIDLabel = new JLabel("Enrollment ID");
        daysPresentLabel = new JLabel("Days Present");
        tuitionFeeLabel = new JLabel("Tuition Fee");
        courseNameLabel = new JLabel("Course Name");
        courseDurationLabel = new JLabel("Course Duration");
        numOfModulesLabel = new JLabel("Number Of Modules");
        numOfCreditHoursLabel = new JLabel("Number Of Credit Hours");
        dateOfEnrollmentLabel = new JLabel("Date of Enrollment: ");
        String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        enrollmentDateComboBox = new JComboBox<String>(days);
        String month[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        enrollmentDateComboBox1 = new JComboBox<String>(month);
        String year[] = {"1999", "2000", "2001", "2002", "2003", "2004", "2005"};
        enrollmentDateComboBox2 = new JComboBox<String>(year);
        dateOfBirthLabel = new JLabel("Date Of Birth");

        //TEXT FIELD for Regular components
        studentNameText = new JTextField();
        enrollmentIDText = new JTextField();
        daysPresentText = new JTextField();
        tuitionFeeText = new JTextField();
        courseNameText = new JTextField();
        courseDurationText = new JTextField();
        numOfModulesText = new JTextField();
        numOfCreditHoursText = new JTextField();
        //COMBOBOX for Regular components

        enrollmentDateComboBox = new JComboBox<String>(days);
        enrollmentDateComboBox1 = new JComboBox<String>(month);
        enrollmentDateComboBox2 = new JComboBox<String>(year);
        birthDateComboBox = new JComboBox<String>(days);
        birthDateComboBox1 = new JComboBox<String>(month);
        birthDateComboBox2 = new JComboBox<String>(year);

        //Buttons
        addaRegularStudentButton = new JButton("Create Regular Student");
        calculatepresentPercentageofRegularStudentButton = new JButton("Present Percentage");
        grantCertificateofRegularStudentButton = new JButton("Grant Certificate");
        displayButton = new JButton("Display");
        clearButton = new JButton("Clear");

        //Label Set Bounds For Regular components
        titleLabel.setBounds(200, 15, 450, 50);
        studentNameLabel.setBounds(10, 130, 100, 20);
        enrollmentIDLabel.setBounds(10, 100, 100, 20);
        daysPresentLabel.setBounds(10, 210, 100, 20);
        tuitionFeeLabel.setBounds(10, 240, 100, 20);
        courseNameLabel.setBounds(310, 135, 100, 20);
        courseDurationLabel.setBounds(310, 160, 100, 20);
        numOfModulesLabel.setBounds(310, 190, 160, 20);
        numOfCreditHoursLabel.setBounds(310, 215, 160, 20);
        dateOfEnrollmentLabel.setBounds(310, 100, 118, 20);
        dateOfBirthLabel.setBounds(10, 160, 100, 20);

        //Text Set Bounds for Regular components
        studentNameText.setBounds(100, 130, 100, 20);
        enrollmentIDText.setBounds(100, 100, 100, 20);
        daysPresentText.setBounds(100, 210, 50, 20);
        tuitionFeeText.setBounds(100, 240, 100, 20);
        courseNameText.setBounds(430, 135, 110, 20);
        courseDurationText.setBounds(510, 160, 30, 20);
        numOfModulesText.setBounds(510, 190, 30, 20);
        numOfCreditHoursText.setBounds(510, 215, 30, 20);
        enrollmentDateComboBox.setBounds(430, 100, 50, 32);
        enrollmentDateComboBox1.setBounds(480, 100, 50, 32);
        enrollmentDateComboBox2.setBounds(530, 100, 70, 32);
        birthDateComboBox.setBounds(100, 160, 50, 32); 
        birthDateComboBox1.setBounds(150, 160, 50, 32);
        birthDateComboBox2.setBounds(200, 160, 70, 32);
        //SET BOUNDS FOR BUTTONS
        addaRegularStudentButton.setBounds(250, 240, 180, 30);
        calculatepresentPercentageofRegularStudentButton.setBounds(10, 290, 180, 30);
        grantCertificateofRegularStudentButton.setBounds(250, 290,180, 30);
        displayButton.setBounds(460, 290, 100, 30);
        clearButton.setBounds(460, 240, 100, 30);

       

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //PANEL - 2
        dropoutPanel1= new JPanel(null);

        //JLABEL
        JLabel titleLabel1 = new JLabel("DROPOUT FORM");
        studentNameLabel1 = new JLabel("Student Name");
        enrollmentIDLabel1 = new JLabel("Enrollment ID");
        tuitionFeeLabel1 = new JLabel("Tuition Fee");
        courseNameLabel1 = new JLabel("Course Name");
        courseDurationLabel1 = new JLabel("Course Duration");
        numOfRemainingModulesLabel = new JLabel("Number Of Remaining Modules");
        numOfMonthsAttendedLabel = new JLabel("Number Of Months Attended");
        dateOfEnrollmentLabel1 = new JLabel("Date of Enrollment: ");
        String days1[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        enrollmentDateComboBox0 = new JComboBox<String>(days1);
        String month1[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        enrollmentDateComboBox01 = new JComboBox<String>(month1);
        String year1[] = {"1999", "2000", "2001", "2002", "2003", "2004", "2005"};
        enrollmentDateComboBox02 = new JComboBox<String>(year1);
        dateOfBirthLabel1 = new JLabel("Date Of Birth");
        dateOfDropoutLabel = new JLabel("Date Of Dropout");

        //JTEXT FIELD
        studentNameText1 = new JTextField();
        enrollmentIDText1 = new JTextField();
        tuitionFeeText1 = new JTextField();
        courseNameText1 = new JTextField();
        courseDurationText1 = new JTextField();
        numOfRemainingModulesText = new JTextField();
        numOfMonthsAttendedText = new JTextField();

        //JCOMBOBOX
        enrollmentDateComboBox0 = new JComboBox<String>(days1);
        enrollmentDateComboBox01 = new JComboBox<String>(month1);
        enrollmentDateComboBox02 = new JComboBox<String>(year1);
        birthDateComboBox0 = new JComboBox<String>(days1);
        birthDateComboBox01 = new JComboBox<String>(month1);
        birthDateComboBox02 = new JComboBox<String>(year1);
        dropoutDateComboBox0 = new JComboBox<String>(days1);
        dropoutDateComboBox01 = new JComboBox<String>(month1);       
        dropoutDateComboBox02 = new JComboBox<String>(year1);

        //Buttons
        addaDropoutStudentButton = new JButton("Create Dropout Student");
        removeDropoutStudentButton = new JButton("Remove Student");
        paythebillsofDropoutStudentButton = new JButton("Bills check");
        displayButton1 = new JButton("Display");
        clearButton1 = new JButton("Clear");

        //JLabel Set Bounds For DROPOUT components
        titleLabel1.setBounds(200, 15, 450, 50);
        studentNameLabel1.setBounds(10, 130, 100, 20);
        enrollmentIDLabel1.setBounds(10, 100, 100, 20);
        dateOfDropoutLabel.setBounds(10, 210, 100, 20);
        tuitionFeeLabel1.setBounds(10, 260, 100, 20);
        courseNameLabel1.setBounds(310, 135, 100, 20);
        courseDurationLabel1.setBounds(310, 160, 100, 20);
        numOfRemainingModulesLabel.setBounds(310, 190, 250, 20);
        numOfMonthsAttendedLabel.setBounds(310, 215, 250, 20);
        dateOfEnrollmentLabel1.setBounds(310, 100, 118, 20);
        dateOfBirthLabel1.setBounds(10, 160, 100, 20);

        //Text Set Bounds for DROPOUT components
        studentNameText1.setBounds(100, 130, 100, 20);
        enrollmentIDText1.setBounds(100, 100, 100, 20);
        dropoutDateComboBox0.setBounds(115, 210, 50, 32); 
        dropoutDateComboBox01.setBounds(165, 210, 50, 32);
        dropoutDateComboBox02.setBounds(215, 210, 70, 32);
        tuitionFeeText1.setBounds(100, 260, 100, 20);
        courseNameText1.setBounds(430, 135, 110, 20);
        courseDurationText1.setBounds(510, 160, 30, 20);
        numOfRemainingModulesText.setBounds(510, 190, 30, 20);
        numOfMonthsAttendedText.setBounds(510, 215, 30, 20);
        enrollmentDateComboBox0.setBounds(430, 100, 50, 32);
        enrollmentDateComboBox01.setBounds(480, 100, 50, 32);
        enrollmentDateComboBox02.setBounds(530, 100, 70, 32);
        birthDateComboBox0.setBounds(100, 160, 50, 32); 
        birthDateComboBox01.setBounds(150, 160, 50, 32);
        birthDateComboBox02.setBounds(200, 160, 70, 32);

        //SET BOUNDS FOR BUTTONS
        addaDropoutStudentButton.setBounds(250, 260, 180, 25);
        removeDropoutStudentButton.setBounds(10, 290, 180, 30);
        paythebillsofDropoutStudentButton.setBounds(250, 290,180, 30);
        displayButton1.setBounds(460, 290, 100, 30);
        clearButton1.setBounds(460, 260, 100, 25);

        /*--------------------Set the DocumentFilter  to accept only integers------*/
        
        ((AbstractDocument) courseDurationText.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) enrollmentIDText.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) numOfModulesText.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) numOfCreditHoursText.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) courseDurationText1.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) enrollmentIDText1.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) numOfRemainingModulesText.getDocument()).setDocumentFilter(new IntegerOnlyFilter());
        ((AbstractDocument) numOfMonthsAttendedText.getDocument()).setDocumentFilter(new IntegerOnlyFilter());

        /*------------------Placeholder for JTextField---------------------------------------------------------*/
        setPlaceholder(studentNameText, "Full Name");
        setPlaceholder(courseNameText, "Module code");

        setPlaceholder(studentNameText1, "Full Name");
        setPlaceholder(courseNameText1, "Module code");

        /*-----------------SET FONT,SIZE,TYPE FOR COMPONENTS INSIDE REGULAR PANEL--*/
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel1.setFont(new Font("Arial", Font.BOLD, 30));

        /*-----------------SET COLORS FOR COMPONENTS INSIDE REGULAR PANEL----------*/
        regularPanel.setBackground(Color.ORANGE);
        dropoutPanel1.setBackground(Color.WHITE);

        /*-------------------------COMPONENTS OF REGULAR PANEL---------------------*/
        regularPanel.add(titleLabel);
        regularPanel.add(studentNameLabel);
        regularPanel.add(dateOfEnrollmentLabel);
        regularPanel.add(enrollmentDateComboBox);
        regularPanel.add(enrollmentDateComboBox1);
        regularPanel.add(enrollmentDateComboBox2);
        regularPanel.add(dateOfBirthLabel);
        regularPanel.add(birthDateComboBox);
        regularPanel.add(birthDateComboBox1);
        regularPanel.add(birthDateComboBox2);
        regularPanel.add(enrollmentIDLabel);
        regularPanel.add(courseNameLabel);
        regularPanel.add(courseDurationLabel);
        regularPanel.add(tuitionFeeLabel);
        regularPanel.add(numOfModulesLabel);
        regularPanel.add(numOfCreditHoursLabel);
        regularPanel.add(daysPresentLabel);
        //TEXT ADD
        regularPanel.add(enrollmentIDText);
        regularPanel.add(studentNameText);
        regularPanel.add(daysPresentText);
        regularPanel.add(tuitionFeeText);
        regularPanel.add(numOfModulesText);
        regularPanel.add(numOfCreditHoursText);
        regularPanel.add(courseNameText);
        regularPanel.add(courseDurationText);
        //BUTTONS ADD
        regularPanel.add(addaRegularStudentButton);
        regularPanel.add(calculatepresentPercentageofRegularStudentButton);
        regularPanel.add(grantCertificateofRegularStudentButton);
        regularPanel.add(displayButton);
        regularPanel.add(clearButton);

        /*-----------------------COMPONENTS OF DROPOUT-----------------------------*/
        dropoutPanel1.add(titleLabel1);
        dropoutPanel1.add(studentNameLabel1);
        dropoutPanel1.add(dateOfEnrollmentLabel1);
        dropoutPanel1.add(enrollmentDateComboBox0);
        dropoutPanel1.add(enrollmentDateComboBox01);
        dropoutPanel1.add(enrollmentDateComboBox02);
        dropoutPanel1.add(dateOfBirthLabel1);
        dropoutPanel1.add(birthDateComboBox0);
        dropoutPanel1.add(birthDateComboBox01);
        dropoutPanel1.add(birthDateComboBox02);
        dropoutPanel1.add(enrollmentIDLabel1);
        dropoutPanel1.add(courseNameLabel1);
        dropoutPanel1.add(courseDurationLabel1);
        dropoutPanel1.add(tuitionFeeLabel1);
        dropoutPanel1.add(numOfRemainingModulesLabel);
        dropoutPanel1.add(numOfMonthsAttendedLabel);
        dropoutPanel1.add(dateOfDropoutLabel);
        dropoutPanel1.add(dropoutDateComboBox0);
        dropoutPanel1.add(dropoutDateComboBox01);
        dropoutPanel1.add(dropoutDateComboBox02);
        //TEXT ADD
        dropoutPanel1.add(enrollmentIDText1);
        dropoutPanel1.add(studentNameText1);
        dropoutPanel1.add(tuitionFeeText1);
        dropoutPanel1.add(numOfRemainingModulesText);
        dropoutPanel1.add(numOfMonthsAttendedText);
        dropoutPanel1.add(courseNameText1);
        dropoutPanel1.add(courseDurationText1);
        //BUTTONS ADD
        dropoutPanel1.add(addaDropoutStudentButton);
        dropoutPanel1.add(removeDropoutStudentButton);
        dropoutPanel1.add(paythebillsofDropoutStudentButton);
        dropoutPanel1.add(displayButton1);
        dropoutPanel1.add(clearButton1);

        //adding action listener to buttons
        //Dropout
        addaDropoutStudentButton.addActionListener(this);
        removeDropoutStudentButton.addActionListener(this);
        paythebillsofDropoutStudentButton.addActionListener(this);
        displayButton1.addActionListener(this);
        clearButton1.addActionListener(this);
        //Regular
        addaRegularStudentButton.addActionListener(this);
        calculatepresentPercentageofRegularStudentButton.addActionListener(this);
        grantCertificateofRegularStudentButton.addActionListener(this);
        displayButton.addActionListener(this);
        clearButton.addActionListener(this);

        //mainFrame.pack();
        mainFrame.setLocationRelativeTo(null); // Center the mainFrame in the middle of the screen
        mainFrame.add(regularPanel); // Add the regular and dropout panels to the main frame
        mainFrame.add(dropoutPanel1);
        mainFrame.setVisible(true); // Make the main frame visible to the user
    }

    // Custom DocumentFilter to accept only integer input
    /*
 * IntegerOnlyFilter is a DocumentFilter that ensures only integer values
 * are allowed in the text components where it's applied.
 */
    private static class IntegerOnlyFilter extends DocumentFilter {
        /**
     * Called when new text is being inserted into the document. 
     * This method checks each character of the inserted string and removes 
     * non-digit characters.
     *
     * @param fb FilterBypass that can be used to mutate Document
     * @param offset the offset into the document to insert the content >= 0
     * @param text the text to insert
     * @param attr the attributes to associate with the inserted content
     */
        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            StringBuilder builder = new StringBuilder(text);
            for (int i = builder.length() - 1; i >= 0; i--) {
                char ch = builder.charAt(i);
                if (!Character.isDigit(ch)) {
                    builder.deleteCharAt(i);
                }
            }
            super.insertString(fb, offset, builder.toString(), attr);
        }
          /**
     * Called when a part of the document's text is being replaced.
     * This method checks each character of the replacement string and 
     * removes non-digit characters. If any non-digit characters are found,
     * it raises an alert notifying the user to input only integer values.
     *
     * @param fb FilterBypass that can be used to mutate Document
     * @param offset the offset into the document to insert the content >= 0
     * @param length length of text to remove
     * @param text the text to insert
     * @param attrs the attributes to associate with the inserted content
     */
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
        throws BadLocationException {
            if (text == null) {
                return;
            }
            StringBuilder builder = new StringBuilder(text);
            for (int i = builder.length() - 1; i >= 0; i--) {
                char ch = builder.charAt(i);
                if (!Character.isDigit(ch)) {
                    builder.deleteCharAt(i);
                }
            }
            super.replace(fb, offset, length, builder.toString(), attrs);
            if (!builder.toString().equals(text)) {
                Toolkit.getDefaultToolkit().beep(); // Play beep sound when a non-digit character is found
                JOptionPane.showMessageDialog(null, "Please enter only integer values.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Method to set the placeholder for the JTextField
    /**
 * Sets a placeholder text for a JTextField. When the field is unfocused and empty,
 * the placeholder text will be shown in a gray color. When the field gains focus, the 
 * placeholder text disappears and the text color becomes black.
 *
 * @param textField The JTextField for which the placeholder needs to be set.
 * @param placeholder The placeholder text to be displayed when the JTextField is empty.
 */
    private void setPlaceholder(JTextField textField, String placeholder) {
         // Initially set the JTextField with the placeholder and a gray color
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
          // Add a focus listener to the JTextField to handle the appearance and disappearance of the placeholder
        textField.addFocusListener(new FocusListener() {
             /**
         * This method is called when the JTextField gains focus. If the current text
         * in the JTextField is the placeholder, it clears the text and sets the 
         * color to black.
         *
         * @param e The focus event
         */
                @Override
                public void focusGained(FocusEvent e) {
                    if (textField.getText().equals(placeholder)) {
                        textField.setText("");
                        textField.setForeground(Color.BLACK);
                    }
                }
         /**
         * This method is called when the JTextField loses focus. If the JTextField
         * is empty, it sets the text to the placeholder and changes the color to gray.
         *
         * @param e The focus event
         */
                @Override
                public void focusLost(FocusEvent e) {
                    if (textField.getText().isEmpty()) {
                        textField.setText(placeholder);
                        textField.setForeground(Color.GRAY);
                    }
                }
            });
    }
    /**
 * This method is responsible for creating a RegularStudent object by extracting and 
 * processing information from various UI elements like JTextFields and JComboBoxes.
 */
    private void createRegularStudent() {
         boolean canCreateStudent = true;
        try{
            // Fetching the student name from the JTextField
            studentName = studentNameText.getText();
            //System.out.println(studentName);
            // Extracting the selected year, month, and day from the date of birth JComboBoxes
            String dateOfBirthyear = String.valueOf(birthDateComboBox.getSelectedItem());
            String dateOfBirth1=String.valueOf(birthDateComboBox1.getSelectedItem());
            String dateOfBirth2=String.valueOf(birthDateComboBox2.getSelectedItem());
            // Constructing the full date of birth string
            dateOfBirth=dateOfBirthyear+dateOfBirth1+dateOfBirth2;
            // Fetching the course name and duration from their respective JTextFields
            courseName = courseNameText.getText();
            courseDuration = Integer.parseInt(courseDurationText.getText());
            // Fetching the enrollment ID from the JTextField
            enrollmentID = Integer.parseInt(enrollmentIDText.getText());
            //System.out.println(enrollmentID);
            // Extracting the selected year, month, and day from the date of enrollment JComboBoxes
            String dateOfEnrollmenty = String.valueOf(enrollmentDateComboBox.getSelectedItem());
            String a=String.valueOf(enrollmentDateComboBox1.getSelectedItem());
            String b=String.valueOf(enrollmentDateComboBox2.getSelectedItem());
            // Constructing the full date of enrollment string
            dateOfEnrollment=dateOfEnrollmenty+a+b;
            // Fetching tuition fee, number of modules, number of credit hours, and days present
            // from their respective JTextFields
            tuitionFee = (int)Double.parseDouble(tuitionFeeText.getText());
            numOfModules = Integer.parseInt(numOfModulesText.getText());
            numOfCreditHours = Integer.parseInt(numOfCreditHoursText.getText());           
            daysPresent = (int)Double.parseDouble(daysPresentText.getText());
            
            // Check if course name is vacant, enrollment ID is vacant, or days present is 0
        if(courseName.trim().isEmpty() || enrollmentID <= 0 || daysPresent <= 0) {
            Toolkit.getDefaultToolkit().beep();
            throw new IllegalArgumentException("Failed to create object! Ensure course name, enrollment ID, and days present are valid.");
             
        }
         // If we reach this point, the inputs are valid, and we can create the object
        Regular regularStudent = new Regular(studentName, dateOfBirth, courseName, courseDuration, enrollmentID, dateOfEnrollment, tuitionFee, numOfModules, numOfCreditHours, daysPresent);
        arraylist.add(regularStudent); // Assuming arraylist is the collection to hold students

        // Success message
        JOptionPane.showMessageDialog(mainFrame, "Regular Student created successfully.");
        } catch(Exception e) {
        // Displaying an error message if there is an exception (like incorrect input formats)
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(mainFrame, "Failed to create object!" ,"Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method without proceeding to create the object
    }
    

    
    
}
   
    /**
 * This method extracts values entered by the user in the Dropout student form fields.
 * It retrieves the user inputs from the form components and sets them to class properties.
 * If any error occurs during the extraction of data, a simple error message is displayed to the user.
 */
    public void Dropoutgetvalue()
    {
        try{
            // Retrieve data from the form components for Dropout students
            studentName = studentNameText1.getText();
            // For debugging purposes: Print the retrieved data
            System.out.println(studentName);
            String dateOfBirthyear = String.valueOf(birthDateComboBox0.getSelectedItem());
            String dateOfBirth1=String.valueOf(birthDateComboBox01.getSelectedItem());
            String dateOfBirth2=String.valueOf(birthDateComboBox02.getSelectedItem());
            dateOfBirth=dateOfBirthyear+dateOfBirth1+dateOfBirth2;
            System.out.println(dateOfBirth);
            courseName = courseNameText1.getText();
            System.out.println(courseName);
            courseDuration = Integer.parseInt(courseDurationText1.getText());
            System.out.println(courseDuration );
            enrollmentID = Integer.parseInt(enrollmentIDText1.getText());
            System.out.println(enrollmentID);
            String dateOfEnrollmenty = String.valueOf(enrollmentDateComboBox0.getSelectedItem());
            String a=String.valueOf(enrollmentDateComboBox01.getSelectedItem());
            String b=String.valueOf(enrollmentDateComboBox02.getSelectedItem());
            dateOfEnrollment=dateOfEnrollmenty+a+b;
            System.out.println( dateOfEnrollment );
            tuitionFee = (int)Double.parseDouble(tuitionFeeText1.getText());
            System.out.println( tuitionFee );
            String dateofDropout=String.valueOf(dropoutDateComboBox0.getSelectedItem());
            String dateofDropout1=String.valueOf(dropoutDateComboBox01.getSelectedItem());
            String dateofDropout2=String.valueOf(dropoutDateComboBox02.getSelectedItem());
            dateOfDropout=dateofDropout+dateofDropout1+dateofDropout2;
            System.out.println( dateOfDropout );
            numOfMonthsAttended=Integer.parseInt(numOfMonthsAttendedText.getText());
            System.out.println( numOfMonthsAttended);
            numOfRemainingModules=Integer.parseInt(numOfRemainingModulesText.getText());
            System.out.println( numOfRemainingModules);

        }
        catch(Exception e)
        {
             // Display error message if there's any exception during data retrieval
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(mainFrame, "Error!");
        }
    }
    /**
 * This method is invoked to create a Dropout student instance and add it to the ArrayList.
 * It first retrieves values from the Dropout form fields, then creates a Dropout student 
 * object with the retrieved values, and finally adds the object to the ArrayList.
 */
    public void adddropout()
    {
        try{
            // Extract values from the Dropout form fields
            this.Dropoutgetvalue();
            // Create a new instance of Dropout student with the gathered information
            Dropout d=new Dropout(courseName,dateOfEnrollment,dateOfBirth,studentName,courseDuration,tuitionFee, numOfRemainingModules, numOfMonthsAttended,dateOfDropout,enrollmentID );
            // Add the newly created Dropout student instance to the arraylist
            arraylist.add(d);
            // Notify the user about the successful creation of the Dropout student
            JOptionPane.showMessageDialog(mainFrame, "Dropout student created successfully!");
        }
        catch(Exception e)
        {
            // Display error message if there's any exception during the creation process
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(mainFrame, "Error!");
        }
    }
    /**
 * This method is invoked when the "Add Regular Student" button is pressed.
 * It initiates the creation of a Regular student, encapsulates the student 
 * information into a Regular object, and adds the object to an ArrayList.
 */
    public void addaRegularStudentButton()
    {
         // Generate the properties for the regular student from user input
        this.createRegularStudent();
       
    }
    /**
 * This method clears all input fields and resets the combo boxes related to 
 * the RegularStudent data entry section of the UI.
 */
    private void clearRegularStudentFields() {
        // Clear the text fields and reset combo boxes
        setPlaceholder(studentNameText, "Full Name");
        setPlaceholder(courseNameText, "Module code");
        enrollmentIDText.setText("");
        daysPresentText.setText("");
        tuitionFeeText.setText("");
        courseDurationText.setText("");
        numOfModulesText.setText("");
        numOfCreditHoursText.setText("");
        
         // Resetting JComboBoxes for date fields to their default values
         // (assuming the first index, 0, is a default or placeholder value)
        enrollmentDateComboBox.setSelectedIndex(0);
        enrollmentDateComboBox1.setSelectedIndex(0);
        enrollmentDateComboBox2.setSelectedIndex(0);
        birthDateComboBox.setSelectedIndex(0);
        birthDateComboBox1.setSelectedIndex(0);
        birthDateComboBox2.setSelectedIndex(0);
    }
    /**
 * This method clears all input fields and resets the combo boxes related to 
 * the DropoutStudent data entry section of the UI.
 */
    private void clearDropoutStudentFields() {
        // Clear the text fields and reset combo boxes
        setPlaceholder(studentNameText1, "Full Name");
        setPlaceholder(courseNameText1, "Module code");
        enrollmentIDText1.setText("");
        numOfRemainingModulesText.setText("");
        tuitionFeeText1.setText("");
        courseDurationText1.setText("");
        numOfMonthsAttendedText.setText("");
        
         // Resetting JComboBoxes for date fields to their default values
        // (assuming the first index, 0, is a default or placeholder value)
        dropoutDateComboBox0.setSelectedIndex(0);
        birthDateComboBox01.setSelectedIndex(0);
        dropoutDateComboBox02.setSelectedIndex(0);
        enrollmentDateComboBox0.setSelectedIndex(0);
        enrollmentDateComboBox01.setSelectedIndex(0);
        enrollmentDateComboBox02.setSelectedIndex(0);
        birthDateComboBox0.setSelectedIndex(0);
        birthDateComboBox01.setSelectedIndex(0);
        birthDateComboBox02.setSelectedIndex(0);
    }

     @Override
       public void actionPerformed(ActionEvent e)  {
         // Check if the action is triggered by the 'addaRegularStudentButton' button
        if (e.getSource() == addaRegularStudentButton)  
        {
            this.addaRegularStudentButton();
        } 
        // Check if the action is triggered by the 'calculatepresentPercentageofRegularStudentButton' button
        if (e.getSource() == calculatepresentPercentageofRegularStudentButton)
        {
            // Calculate the present percentage for a Regular Student based on the given enrollment ID
            int id=Integer.parseInt(JOptionPane.showInputDialog("What is Enrollment"));
            boolean isFound = false;
            for (Student s:arraylist)//calculatepresentPercentageofRegularStudentButton.addActionListener(this);
            {
                if(s instanceof Regular)
                {
                    Regular r=(Regular)s;
                  
                    if (id==r.getEnrollmentID()) {
                     System.out.println("Entered Enrollment ID: " + id);
                  System.out.println("Found Enrollment ID: " + r.getEnrollmentID());
                        isFound = true; // Found a matching ID
                    // Input number of days present and calculate the grade
                    
                        // Prompt for the number of days present
                        int dayspresent=(int)Double.parseDouble(JOptionPane.showInputDialog("Enter number  of dayspresent"));
                        if ((r.getEnrollmentID())*30 >= dayspresent)
                        {
                            char grade=r.PresentPercentage(dayspresent);
                            JOptionPane.showMessageDialog(mainFrame, "Present percentage is calculated");
                            JOptionPane.showMessageDialog(mainFrame, "Your Grade is " +  grade);

                        }
                        break;// Exit loop once a match is found
                    }
                }
            }
                    // If the ID was not found in the list, show the error message
                    if (!isFound) {
                        Toolkit.getDefaultToolkit().beep();
                        throw new IllegalArgumentException("enrollment ID not found");
                    
                    }
                

            
        }
        // Grant certificate for the Regular Student
    if (e.getSource() == grantCertificateofRegularStudentButton) {
    String enrollmentInput = JOptionPane.showInputDialog("What is Enrollment");
    if (enrollmentInput == null || enrollmentInput.trim().isEmpty()) {
        JOptionPane.showMessageDialog(mainFrame, "Enrollment ID must be provided");
        return; // Exit the method if there is no input
    }
    int id;
    try {
        id = Integer.parseInt(enrollmentInput);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(mainFrame, "Enrollment ID must be a valid number");
        return; // Exit the method if the input is not a valid integer
    }

    boolean isFound = false; // Add a flag to check if the enrollment ID is found
    for (Student s : arraylist) {
        if (s instanceof Regular) {
            Regular r = (Regular) s;
            if (id == r.getEnrollmentID()) {
                String cs = JOptionPane.showInputDialog("Enter number of days present");
                if (cs == null || cs.trim().isEmpty()) {
                JOptionPane.showMessageDialog(mainFrame, "Number of days must be provided");
                return; // Exit the method if there is no input
            }
            
            // Continue with granting the certificate
                r.GrantCertificate(cs, id, dateOfEnrollment);
                JOptionPane.showMessageDialog(mainFrame, "Certificate granted");
                System.out.println("\nVerfied by the school Administrative."); // Print to console
                isFound = true; // Mark the enrollment ID as found
                break; // Exit loop once a match is found
            }
        }
    }

    if (!isFound) { // If the ID was not found in the list, show the error message
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(mainFrame, "Enrollment ID not found");
    }
}

        // Display the details of a Regular Student based on enrollment ID
        if (e.getSource() == displayButton)
    {
    try 
    {
        int id = Integer.parseInt(JOptionPane.showInputDialog("What is Enrollment"));
        boolean studentFound = false;

        for (Student s : arraylist)
        {
            if (s instanceof Regular)
            {
                Regular r = (Regular) s;
                if (id == r.getEnrollmentID()) 
                {
                    r.display();
                    JOptionPane.showMessageDialog(mainFrame, "Displayed");
                    studentFound = true;
                    break; // exit the loop once the student is found
                }
            } 
        }

        if (!studentFound)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(mainFrame, "Enrollment ID not found");
        }
    } 
    catch (NumberFormatException nfe) 
    {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(mainFrame, "Please enter a valid enrollment number.");
    }
    // You might also want to catch other potential exceptions
    catch (Exception ex) 
    {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(mainFrame, "An error occurred: " + ex.getMessage());
    }
}

       
   // Clear fields for Regular Student input
        if (e.getSource() == clearButton)
        {
            clearRegularStudentFields();
            JOptionPane.showMessageDialog(mainFrame, "Fields cleared.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
// Add a Dropout Student
        if(e.getSource()==addaDropoutStudentButton)
        {
            this.adddropout();
        }
         // Calculate bills payable for a Dropout Student
        if(e.getSource()==paythebillsofDropoutStudentButton)
        {
            int sdid= Integer.parseInt(JOptionPane.showInputDialog("Enter your EnrollmentID"));
             boolean idMatchFound = false;
            for(Student s:arraylist)
            {
                if (s instanceof Dropout) {
                    Dropout drop = (Dropout) s;
                    if (sdid==drop.getEnrollmentID()) 
                    {
                        drop.billsPayble();
                        JOptionPane.showMessageDialog(mainFrame,"Bills payable calculated succesfully");
                        idMatchFound = true;
                        break;
                    }
                }
            }
                    
                    if (!idMatchFound) {
                        Toolkit.getDefaultToolkit().beep();
                       JOptionPane.showMessageDialog(mainFrame, "Enrollment ID did not match any records");
                  }
                
            
        }
// Remove a Dropout Student if they have paid the bills
        if(e.getSource()==removeDropoutStudentButton)
        {
             String enrollmentIdInput = JOptionPane.showInputDialog("Enter your EnrollmentID");
    if (enrollmentIdInput == null || enrollmentIdInput.trim().isEmpty()) {
        JOptionPane.showMessageDialog(mainFrame, "Enrollment ID must be provided");
        return; // Exit the method if there is no input
    }

    int sdid;
    try {
        sdid = Integer.parseInt(enrollmentIdInput);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(mainFrame, "Enrollment ID must be a valid number");
        return; // Exit the method if the input is not a valid integer
    }
            
            boolean studentRemoved = false;  // To check if a student was actually removed
            boolean billsCleared = false;    // To check if student's bills are cleared
            
            for(Student s:arraylist)
            {
                if (s instanceof Dropout) {
                    Dropout drop = (Dropout) s;
                    if (sdid==drop.getEnrollmentID()) 
                    {
                        if(drop.getHasPaid())
                        {
                            drop.removeStudent();
                        studentRemoved = true;

                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(mainFrame, "Student removed successfully.");
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(mainFrame, "Cannot remove student as bills are not cleared.", "Warning", JOptionPane.WARNING_MESSAGE);
                    
                }
                break; // Exit the loop once a student's condition is checked
            }
        }
    }

    // If no matching student was found, show an error message
    if (!studentRemoved) {
        Toolkit.getDefaultToolkit().beep();
        
    }
    
        }
        // Display attributes of all Dropout Students
 if (e.getSource() == displayButton1) {
    try {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Dropout Student Enrollment ID"));
        boolean studentFound = false;

        for (Student s : arraylist) {
            if (s instanceof Dropout) {
                Dropout drop = (Dropout) s;
                if (id == drop.getEnrollmentID()) {
                    drop.display();
                    JOptionPane.showMessageDialog(mainFrame, "Dropout student details displayed.");
                    studentFound = true;
                    break; // exit the loop once the student is found
                }
            }
        }

        if (!studentFound) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(mainFrame, "Enrollment ID not found for Dropout student.");
        }
    } catch (NumberFormatException nfe) {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(mainFrame, "Please enter a valid enrollment number for Dropout student.");
    } catch (Exception ex)// You might also want to catch other potential exceptions
    {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(mainFrame, "An error occurred: " + ex.getMessage());
    }
}


        if (e.getSource() == clearButton1) {
         clearDropoutStudentFields();
         JOptionPane.showMessageDialog(mainFrame, "Dropout student fields cleared.", "Success", JOptionPane.INFORMATION_MESSAGE);
       
    }
}

public static void main(String[]args)
{
    Student_GUI student=new Student_GUI();
}
    
}