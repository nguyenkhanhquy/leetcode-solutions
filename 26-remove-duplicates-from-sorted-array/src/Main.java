public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        int k = Solution.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length : "k != expectedNums.length";
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "nums[i] != expectedNums[i]";
        }
    }
}