public class ComplexMathTest {

    public static void main (String[] args) {

        // Creates a ComplexBase Array that will hold all calculations
        ComplexBase[] complex = new ComplexBase[14];

        // Assigns each part of the array with a SubClass from ComplexBase
        complex[0] = new ComplexAdd(9.5, 7.7, 1.2, 3.1);
        complex[1] = new ComplexSubtract(9.5, 7.7, 1.2, 3.1);
        complex[2] = new ComplexMultiply(9.5, 7.7, 1.2, 3.1);
        complex[3] = new ComplexDivision(9.5, 7.7, 1.2, 3.1);
        complex[4] = new ComplexAdd(-6.3, 5.2, 3.4, -2.8);
        complex[5] = new ComplexSubtract(-6.3, 5.2, 3.4, -2.8);
        complex[6] = new ComplexMultiply(-6.3, 5.2, 3.4, -2.8);
        complex[7] = new ComplexDivision(-6.3, 5.2, 3.4, -2.8);
        complex[8] = new ComplexDivision(-6.3, 5.2, 0.0, 0.0);
        complex[9] = new ComplexAdd();
        complex[10] = new ComplexSubtract();
        complex[11] = new ComplexMultiply();
        complex[12] = new ComplexDivision();
        complex[13] = new ComplexDivision(0,0,0,0.1);

        // Prints out headers
        System.out.println("A complex number in the form (x, y) is equal to x + yi, where i is square root of -1.\n");
        System.out.println("* ~~~~~~~********--------Complex numbers calculations--------********~~~~~~~ *");

        // Uses enhanced for loop to print out all the calculations in the ComplexBase complex array
        for (ComplexBase currentComplex : complex)
            System.out.println(currentComplex);

    }

}
