package main;

public class Main {

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);
//        sda.insert(1,30);
//        sda.insert(12,120);

//        var firstElement = sda.arr[0];
//        System.out.println(firstElement);
//        var thirdElement = sda.arr[3];
//        System.out.println(thirdElement);

        // Array Traversal
//        sda.traverseArray();

        // Search in array
//        sda.searchInArray(20);
        sda.deleteValue(0);
        System.out.println(sda.arr[0]);
    }

}
