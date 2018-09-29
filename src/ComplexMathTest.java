public class ComplexMathTest {

    public static void main (String[] args) {

        // Creates a ComplexBase Array that will hold all calculations
        ComplexBase[] complex = new ComplexBase[3];

        // Assigns each part of the array with a SubClass from ComplexBase
        complex[0] = new ComplexAdd(9.5, 7.7, 1.2, 3.1);
        complex[1] = new ComplexAdd(-6.3, 5.2, 3.4, -2.8);
        complex[2] = new ComplexAdd();

        // Prints out headers
        System.out.println("A complex number in the form (x, y) is equal to x + yi, where i is square root of -1.");
        System.out.println("* ~~~~~~~********--------Complex numbers calculations--------********~~~~~~~ *");

        // Uses enhanced for loop to print out all the calculations in the ComplexBase complex array
        for (ComplexBase currentComplex : complex)
            System.out.println(currentComplex);

    }

}
