
/**
 *This class represents a student object.
 *It contains attributes for enrollment ID, date of birth, course name,
 *student name, date of enrollment, course duration in months, and tuition fee in number.
 *
 * @author Aasutosh Kumar Verma
 * @since 5-5-2023
 */

public class Student
{
    //Attributes
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration; //in months
    private double tuitionFee;

    //Constructor

    /**

    This constructor initializes a new Student object with the given attributes.
    @param studentName the name of the student
    @param dateOfBirth the date of birth of the student
    @param courseDuration the duration of the course in months
    @param tuitionFee the tuition fee of the course
     */
    public Student(String studentName, String dateOfBirth, int courseDuration, double tuitionFee) 
    {

        this.enrollmentID = 0; 
        this.dateOfBirth = dateOfBirth;
        this.courseName = "";
        this.studentName = studentName;
        this.dateOfEnrollment = "";
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
    }

    //getters
    /**
     * Getter method for enrollment ID
     * @return the enrollment ID
     */
    public int getEnrollmentID()
    {
        return this.enrollmentID;
    }

    /**
     * Getter method for date of birth
     * @return the date of birth
     */
    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    /**
     * Getter method for course Of Name
     * @return the course Of Name
     */
    public String getCourseName()
    {
        return this.courseName;
    }

    /**
     * Getter method for studentName
     * @return the studentName
     */
    public String getStudentName()
    {
        return this.studentName;
    }

    /**
     * Getter method for dateOfEnrollment
     * @return the dateOfEnrollment
     */
    public String getDateOfEnrollment()
    {
        return this.dateOfEnrollment;
    }

    /**
     * Getter method for courseDuration
     * @return the courseDuration
     */
    public int getCourseDuration()
    {
        return this.courseDuration;
    } 

    /**
     * Getter method for tuitionFee
     * @return the tuitionFee
     */
    public double getTuitionFee()
    {
        return this.tuitionFee;
    }
    //setters
    /**
     * Setter method for enrollment ID
     * @param enrollmentID the ID to set
     */
    public void setEnrollmentID(int enrollmentID)
    {
        this.enrollmentID = enrollmentID;
    } 

    /**
     * Setter method for date of birth
     * @param dateOfBirth the date of birth to set
     */
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Setter method for course Name
     * @param courseName the course Name to set
     */
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    } 

    /**
     * Setter method for student Name
     * @param studentName the student Name to set
     */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    } 

    /**
     * Setter method for date of Enrollment
     * @param dateOfEnrollment the date Of Enrollment to set
     */
    public void setDateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    /**
     * Setter method for course Duration
     * @param courseDuration the courseDuration to set
     */
    public void setCourseDuration(int courseDuration)
    {
        this.courseDuration = courseDuration;
    } 

    /**
     * Setter method for tuition Fee
     * @param tuitionFee the tuitinFee to set
     */
    public void setTuitionFee(double tuitionFee)
    {
        this.tuitionFee= tuitionFee;
    }  

    /**
     *This method displays the details of the student.
     *If any required detail is missing, an appropriate message is displayed.
     */
    //Display method
    public void display()
    //using if & else if condition to check wheather its is declared, missing or not
    {
        //Checking if enrolmentID is declared
        if  (enrollmentID == 0) {
            System.out.println("Enrollment ID is not declared!");
        } 
        //Checking if CourseName is missing
        else if (courseName == "" || courseName == null) {
            System.out.println("Course Name is not mentioned!");
        }
        //Checking if dateOfEnrollment is missing
        else if (dateOfEnrollment.equals("") || dateOfEnrollment == null) {
            System.out.println("Date of Enrollment Value is missing!");
        }
        else {
            //Display student information details if all required details are available
            System.out.println("Enrollment ID: " + getEnrollmentID());
            System.out.println("Date of Birth: " + getDateOfBirth());
            System.out.println("Course Name: " + getCourseName());
            System.out.println("Student Name: " + getStudentName());
            System.out.println("Date Enrolled: " + getDateOfEnrollment());
            System.out.println("Course Duration: " + getCourseDuration() + " months");
            System.out.println("Tuition Fee: " + getTuitionFee());
            //for spacing or visual separation between current output and any previous output a blank line
            System.out.println();
            System.out.println();
        }
    }

}
