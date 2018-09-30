public class ComplexDivision extends ComplexBase {

    // Declarations
    private double realD;   // Subtracted Real Part of Imaginary Number
    private double imaginaryD; // Subtracted Imaginary Part of Imaginary Number

    /*
     * Constructors
     */
    // Constructor takes in nothing and set its SuperClass', and its own variables
    // to a 0.0 default
    ComplexDivision() {
        super();
        this.realD = 0;
        this.imaginaryD = 0;

    } // End Constructor ComplexSubtract()

    // Constructor takes in 4 doubles and sets its SuperClass' variables
    // to the passed variables, then divides the real and imaginary numbers
    // and sets the multiplied values to realA and imaginaryA
    ComplexDivision (double r1, double i1, double r2, double i2) {

        // Creates a SuperClass with 4 doubles
        super(r1, i1, r2, i2);

        // Calculates the real part
        this.realD = ((r1 * r2) + (i1 * i2)) / ((r2 * r2) + (i2 * i2));
        // Calculates the imaginary part
        this.imaginaryD = ((i1 * r2) - (r1 * i2)) / ((r2 * r2) + (i2 * i2));

    } // End Constructor ComplexAdd(double, double, double, double)

    // Output Method
    // Outputs the real and imaginary numbers and formats the decimals
    // to only 1 decimal point.
    public String toString() {

        //System.out.println(this.realD);
       //System.out.println(this.imaginaryD);
        // First Part of String that sets up the equation
        String beginningString = String.format("%-33s", "Complex Numbers Division:");

        // Creates a formatted string for the first imaginary number
        String firstNumber = String.format( "%-12s", String.format( "(%.1f, %.1f)", super.getFirstReal(), super.getFirstImaginary()) );

        // Creates a formatted string for the second imaginary number
        String secondNumber = String.format( "%12s", String.format( "(%.1f, %.1f)", super.getSecondReal(), super.getSecondImaginary()) );

        // Creates a formatted string for the calculated imaginary
        // number
        String calculatedString;
        if ( (Double.isNaN(realD) && Double.isNaN(imaginaryD)) )  {
            calculatedString = "infinite.";

        } else {
            calculatedString = String.format( "(%.1f, %.1f)", this.realD, this.imaginaryD );

        }

        // Concatenates all the strings together
        return String.format("%s%s / %s  =  %s", beginningString, firstNumber, secondNumber, calculatedString);

    } // End Method toString

} // End Class ComplexMultiply

