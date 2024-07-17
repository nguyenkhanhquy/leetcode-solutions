import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0,0,1,3,4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = Solution.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length : "k != expectedNums.length";
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "nums[i] != expectedNums[i]";
        }
    }
}