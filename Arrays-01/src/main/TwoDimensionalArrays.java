package main;

public class TwoDimensionalArrays {
    int arr[][] = null;

    public TwoDimensionalArrays(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    //Inserting value in array
    public void insertValueInArray(int row, int column, int value) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                arr[row][column] = value;
                System.out.println("The value is successfully inserted!");
            } else {
                System.out.println("The cell is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }


}
