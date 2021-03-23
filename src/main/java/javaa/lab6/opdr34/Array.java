package javaa.lab6.opdr34;

public class Array {
    //Variable opdracht 3
    private long[] increasedArray;

    //

    //Opdracht 3
    public void doubleArray(long[] array) {
        increasedArray = new long[array.length*2];
        for (int i = 0; i<array.length; i++ ) {
            increasedArray[i] = array[i];
        }

        printArray(increasedArray);

    }

    //Opdracht 4
    public void multiply(long[] input, int multiplier) {
        for (int i = 0; i<input.length; i++) {
            input[i] = input[i] * multiplier;
        }

        printArray(input);
    }

    //Method gebruikt voor beide opdrachten
    public void printArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }
}
