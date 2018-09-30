public class ComplexSubtract extends ComplexBase {

    // Declarations
    private double realS;   // Subtracted Real Part of Imaginary Number
    private double imaginaryS; // Subtracted Imaginary Part of Imaginary Number

    /*
     * Constructors
     */
    // Constructor takes in nothing and set its SuperClass', and its own variables
    // to a 0.0 default
    ComplexSubtract () {
        super();
        this.realS = 0;
        this.imaginaryS = 0;

    } // End Constructor ComplexSubtract()

    // Constructor takes in 4 doubles and sets its SuperClass' variables
    // to the passed variables, then adds the real and imaginary numbers
    // and sets the added value to realA and imaginaryA
    ComplexSubtract (double r1, double i1, double r2, double i2) {

        // Creates a SuperClass with 4 doubles
        super(r1, i1, r2, i2);

        // Calculates real part
        this.realS = r1 - r2;
        // Calculates the imaginary part
        this.imaginaryS = i1 - i2;

    } // End Constructor ComplexAdd(double, double, double, double)

    // Output Method
    // Outputs the real and imaginary numbers and formats the decimals
    // to only 1 decimal point.
    public String toString() {

        // First Part of String that sets up the equation
        String beginningString = String.format( "%-33s", "Complex Numbers Subtraction:" );

        // Creates a formatted string for the first imaginary number
        String firstNumber = String.format( "%-12s", String.format( "(%.1f, %.1f)", super.getFirstReal(), super.getFirstImaginary()) );

        // Creates a formatted string for the second imaginary number
        String secondNumber = String.format( "%12s", String.format( "(%.1f, %.1f)", super.getSecondReal(), super.getSecondImaginary()) );

        // Creates a formatted string for the calculated imaginary number
        String calculatedString = String.format( "(%.1f, %.1f)", this.realS, this.imaginaryS );

        // Concatenates all the strings together
        return String.format("%s%s - %s  =  %s", beginningString, firstNumber, secondNumber, calculatedString);

    } // End Method toString

} // End Class ComplexSubtract