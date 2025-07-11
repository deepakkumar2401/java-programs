package imp_DSA;

public class MinJump {
    public static int jump(int[] nums) {
        int jumps=0;
        int currentEnds=0;
        int farthest=0;

        for (int i = 0; i < nums.length-1; i++) {
            farthest=Math.max(farthest,i+nums[i]);

            if(i==currentEnds){
                jumps++;
                currentEnds=farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(jump(arr));
    }
}
