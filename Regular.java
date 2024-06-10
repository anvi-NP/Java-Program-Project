
/**
 *This sub class represents a regular object.
 *It contains attributes for 
 * @author Aasutosh Kumar Verma
 * @since 5-5-2023
 */
//
public class Regular extends Student
{
    //initialise instance variables 
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    private char disPlay;
    //constructor
    /**
    Constructor for the Regular class

    @param studentName the name of the regular student
    @param dateOfBirth the date of birth of the regular student
    @param courseName the name of the course for the regular student
    @param courseDuration the duration of the course for the regular student
    @param enrollmentID the enrollment ID for the regular student
    @param dateOfEnrollment the date of enrollment for the regular student
    @param tuitionFee the tuition fee for the regular student

     */
    public Regular(String studentName, String dateOfBirth,  String courseName, int courseDuration, int enrollmentID, String dateOfEnrollment, double tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent)
    {
        // initialise instance variables
        super(studentName, dateOfBirth, courseDuration, tuitionFee); 
        this.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    /*
     * Getter method for the number of modules for the regular student
     * 
     * @return the number of modules for the regular student
     */
    public int getNumOfModules() 
    {
        return numOfModules;
    }

    /*
     * Getter method for the number of credit hours for the regular student
     * 
     * @return the number of credit hours for the regular student
     */
    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    /*
     * Getter method for the number of days present for the regular student
     * 
     * @return the number of days present for the regular student
     */
    public double getDaysPresent() {
        return daysPresent;
    }

    /*
     * Getter method for whether or not the regular student is granted scholarship
     * 
     * @return true if the regular student is granted scholarship, false otherwise
     */
    public boolean IsGrantedScholarship() {
        return isGrantedScholarship;
    }

    /**
     * Setter method for setting whether or not the regular student is granted scholarship
     * 
     * @param isGrantedScholarship true if the regular student is granted scholarship, false otherwise
     */
    public void setIsGrantedScholarship(boolean isGrantedScholarship) {
        this.isGrantedScholarship = isGrantedScholarship;
    }

    /*
     * Method for calculating the present percentage of the regular student
     * 
     * @param daysPresent the number of days present for the regular student
     */
    public char PresentPercentage(double daysPresent)
    {
        double presentpercentage = (daysPresent / (getCourseDuration() * 30)) * 100;
        this.daysPresent = daysPresent;
        if (daysPresent > (getCourseDuration() * 30)) {
            System.out.println("you can't attent more than course days");
        } else {
            if (presentpercentage >= 80 & presentpercentage <= 100) {
                setIsGrantedScholarship(true);
                return disPlay='A';
            }

            else if (presentpercentage < 80 & presentpercentage >=60) {
                return disPlay='B';
            }

            else if (presentpercentage < 60 & presentpercentage >=40) {
                return disPlay='C';
            } 

            else if (presentpercentage < 40 & presentpercentage >=20) {
                return disPlay='D';
            } 

            else{
                return disPlay='E';
            }
             
        }
        return disPlay;
    }
        /*
        Grants certificate to a student and displays the information about the student's graduation, including any granted scholarship.
        @param courseName the name of the course
        @param enrollmentID the enrollment ID of the student
        @param dateOfEnrollment the date of enrollment of the student
         */
        public void GrantCertificate(String courseName, int enrollmentID, String dateOfEnrollment) 
        {
        System.out.print(getStudentName() + " has graduated from " + getCourseName() + " with enrollment ID " + getEnrollmentID() + " and enrollment date " + getDateOfEnrollment() + ".");
        if (isGrantedScholarship) {
            System.out.print(" The scholarship has been granted.");
        } else{
            System.out.println("The student has not met the attendance requirements for the certificate. ");
        } 

    }

    /**

    Displays the information about a Regular student, including the number of modules, number of credit hours, and days present.
     */
    public void display() {
        super.display();
        System.out.println("Number of modules: " + this.numOfModules);
        System.out.println("Number of credit hours: " + this.numOfCreditHours);
        System.out.println("Days present: " + this.daysPresent);
    }

}

