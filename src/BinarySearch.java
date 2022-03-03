public class BinarySearch {

    public static int search( int[] array, int target, int left, int right){
        while (left <= right){
            int mid = left + (right - left)/2;
            if (array[mid] < target){
                left = mid + 1;
            }
            else if (array[mid] > target){
                right = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-4,-4,-4,-4,-4,0,1,2};

        for (int i = -5; i<=3; i++){
            System.out.printf("Search %d in array, result: %d.\n", i, search(array, i, 0, array.length-1));
        }
    }
}
