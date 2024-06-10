
/**

Dropout is a subclass of Student that represents a student who has dropped out of a course.

It contains information about the remaining modules, months attended, date of dropout, remaining amount of tuition fee, and whether the student has paid all their bills.
* @author Aasutosh Kumar Verma
* @since 5-5-2023
*/
public class Dropout extends Student 
{
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private double remainingAmount;
    private boolean hasPaid; 
    
    //constructor
    /*

Creates a new instance of the Dropout class with the given parameters.
@param studentName the name of the student
@param dateOfBirth the date of birth of the student
@param courseDuration the duration of the course in months
@param tuitionFee the tuition fee per month
@param numOfRemainingModules the number of modules the student has remaining
@param numOfMonthsAttended the number of months the student has attended
@param dateOfDropout the date on which the student dropped out
*/
    public Dropout(String courseName,String dateOfEnrollment,String studentName,String dateOfBirth, int courseDuration, double tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout,int enrollmentID) 
    { 
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setCourseName(courseName);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }
//getters
/**

Returns the number of remaining modules the student has.
@return the number of remaining modules
*/
    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }
     
    /**
     * 
     * {

Returns the number of months the student has attended the course.
@return the number of months attended
*/
    public int getNumOfMonthsAttended() {
        return this.numOfMonthsAttended;
    }
    
    /*

Returns the date on which the student dropped out of the course.
@return the date of dropout
*/
    public String getDateOfDropout() {
        return dateOfDropout;
    }
    
    /*

Returns the remaining amount of tuition fee that the student needs to pay.
@return the remaining amount of tuition fee
*/
    public double getRemainingAmount() {
        return remainingAmount;
    }
    
    /*

Returns whether the student has paid all their bills.
@return true if the student has paid all their bills, false otherwise
*/
    public boolean getHasPaid() {
        return hasPaid;
    }
    
/*

Calculates the remaining tuition fees that the student needs to pay and sets the hasPaid field accordingly.
*/
    //This method calculates the remaining tuition fees that the student needs to pay.
    //formul:-getCourseDuration()-numOfMonthsAttended)*getTuitionFee();
     public void billsPayble() {
        String disPlay = "";
        this.remainingAmount = (getCourseDuration() - numOfMonthsAttended) * getTuitionFee();
        if (this.remainingAmount == 0) {
            hasPaid = true;
            disPlay = "All bills cleared by the student";
        } else {
            disPlay =  "The total amount of bills needed to be paid Rs" + "" + this.remainingAmount;
        }
        System.out.println(disPlay);
    }
    /**

Removes the student from the system if they have paid all their bills.
Otherwise, prints an error message.
*/
        public void removeStudent() {
            
        if (this.hasPaid) {
            super.setDateOfBirth("");
            super.setCourseName("");
            super.setStudentName("");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.dateOfDropout = "";
            this.remainingAmount = 0;
            super.setEnrollmentID(0);
        } else {
            System.out.println("All bills not cleared");
        }
        
    }
    /**

Overrides the display method from the Student class to add additional information related to a student who has dropped out of the course.
Displays the student's name, date of birth, course name, enrollment ID, course duration, tuition fee, number of remaining modules, number of months attended, date of dropout and remaining amount to be paid.
@see Student#display()
*/
      @Override
    public void display() {
        super.display();
        System.out.println("Number of remaining modules: " + numOfRemainingModules);
        System.out.println("Number of months attended: " + numOfMonthsAttended);
        System.out.println("Date of dropout: " + dateOfDropout);
        System.out.println("Remaining amount: Rs " + remainingAmount);
    }
    }
    
    

