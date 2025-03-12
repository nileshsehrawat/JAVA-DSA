public class basicsArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int length = arr.length;

        System.out.println("Length of the array:" + length);

        System.out.println("Element of the array:" + getElement(arr, 5));

        System.out.println("Index of the array:" + getIndex(arr, 5));

    }

    public static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Error: Index out of bounds");
            return -1; // Return an error code
        }
        return arr[index]; // Returning the element at the given index
    }

    public static int getIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // Returning index where the element is found
            }
        }
        return -1; // Return -1 if element is not found
    }

}