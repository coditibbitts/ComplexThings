public class ComplexBase {

    // Declarations
    private double realOne; // Real Part of First Imaginary Number
    private double realTwo; // Real Part of Second Imaginary Number
    private double imaginaryOne; // Imaginary Part of First Imaginary Number
    private double imaginaryTwo; // Imaginary Part of First Imaginary Number

    /*
     * Constructors
     */
    // Constructor takes in nothing and sets all variables
    // to a 0.0 default
    ComplexBase () {
        this.realOne = 0.0;
        this.imaginaryOne = 0.0;
        this.realTwo = 0.0;
        this.imaginaryTwo = 0.0;

    } // End Constructor ComplexBase()

    // Constructor takes in 4 doubles and sets the Class' variables
    // to the passed doubles
    ComplexBase(double realOne, double imaginaryOne, double realTwo,  double imaginaryTwo) {
        this.realOne = realOne;
        this.imaginaryOne = imaginaryOne;
        this.realTwo = realTwo;
        this.imaginaryTwo = imaginaryTwo;

    } // End Constructor ComplexBase(double,double,double,double)

    /*
     * Methods
     */
    /*
     * Get Methods
     */
    public double getFirstReal () {
        return this.realOne;

    } // End Method getFirstReal

    public double getFirstImaginary () {
        return this.imaginaryOne;

    } // End Method getFirstImaginary

    public double getSecondReal () {
        return this.realTwo;

    } // End Method getSecondReal

    public double getSecondImaginary () {
        return this.imaginaryTwo;

    } // End Method getSecondImaginary

} // End Class ComplexBase
