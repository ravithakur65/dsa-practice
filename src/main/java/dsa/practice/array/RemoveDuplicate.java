package dsa.practice.array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3};
        RemoveDuplicate obj = new RemoveDuplicate();
        System.out.println(obj.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int write = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read - 1]) {
                nums[write++] = nums[read];
                System.out.println(write);
            }
        }
        System.out.println();
        for (int num: nums)
            System.out.print(num+", ");
        System.out.println();
        return write;
    }
}
