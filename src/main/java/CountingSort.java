
/**
 * @author Alireza_Tayefeh
 * Counting sort algorithm in java
 */
public class CountingSort {
    static int[] countingSort(int[] nums, int maxNumber) {
        int[] temp = new int[maxNumber + 1];
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            while (temp[i] > 0) {
                result[index++] = i;
                temp[i]--;
            }
        }

        return result;
    }

    static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 6, 7, 1, 9, 0, 8, 6};
        printArray(nums);
        nums = countingSort(nums, 10);
        printArray(nums);
    }
}
