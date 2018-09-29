public class ComplexAdd extends ComplexBase {

    // Declarations
    private double realA;   // Added Real Part of Imaginary Number
    private double imaginaryA; // Added Imaginary Part of Imaginary Number

    /*
     * Constructors
     */
    // Constructor takes in nothing and set its SuperClass', and its own variables
    // to a 0.0 default
    ComplexAdd () {
        super();
        this.realA = 0.0;
        this.imaginaryA = 0.0;

    } // End Constructor ComplexAdd()

    // Constructor takes in 4 doubles and sets its SuperClass' variables to the doubles
    // then
    ComplexAdd (double realOne, double imaginaryOne, double realTwo, double imaginaryTwo) {

        super(realOne, imaginaryOne, realTwo, imaginaryTwo);
        this.realA = super.getFirstReal() + super.getSecondReal();
        this.imaginaryA = super.getFirstImaginary() + getSecondImaginary();

    } // End Constructor ComplexAdd(double, double, double, double)

    // Output Method
    // Outputs the real and imaginary numbers and formats the decimals
    // to only 1 decimal point.
    public String toString() {

        // First Part of String that sets up the equation
        String beginningString = "Complex Numbers Addition: ";

        // Strings get the First and Second Imaginary number
        String middleStringOne = "(" + String.format("%.1f", super.getFirstReal()) + ", " + String.format("%.1f", super.getFirstImaginary()) + ")";
        String middleStringTwo = "(" + String.format("%.1f", super.getSecondReal()) + ", " + String.format("%.1f", super.getSecondImaginary()) + ")";

        // Added Imaginary Number for last part of the string
        String addedString = "(" + String.format("%.1f", this.realA) + ", " + String.format("%.1f", this.imaginaryA) + ")";

        // Concatenates all the strings together
        return beginningString + middleStringOne + " + " + middleStringTwo + " = " + addedString;

    } // End Method printString

} // End SubClass ComplexAdd extends ComplexBase
