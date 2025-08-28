public class Lab5Exc5 {
    public static void printSpace(int n, int l) {
        int space = n-l;
        for (int i=0;i<space;i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int n) {
        for (int i=0;i<n;i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static int[] generateNums(int n) {
        int len = 2*n-1;
        int[] nums = new int[len];
        for (int i=0;i<n;i++) {
            nums[i] = i+1;
        }
        for (int i=n;i<len;i++) {
            nums[i] = 2*n-i-1;
        }
        return nums;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = generateNums(n);
        for (int i=0;i<nums.length;i++) {
            printSpace(n,nums[i]);
            printStars(nums[i]);
        }
    }
}
