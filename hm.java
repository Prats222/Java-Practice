public class hm {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arr.length / 2; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            System.out.println(arr[i] + "has children:");
            if (leftChild < arr.length) {
                System.out.println(arr[leftChild]);
            }
            if (rightChild < arr.length) {
                System.out.print(arr[rightChild]);
            }
            System.out.println();
        }
    }
}
