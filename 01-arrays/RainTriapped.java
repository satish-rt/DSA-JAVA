public class RainTriapped {

 public static void TriappedWater(int nums[]){
    int n = nums.length;
int[] leftMax = new int[n];
int[] rightMax = new int[n];
int totalWater = 0;

// build leftMax (left to right)
leftMax[0] = nums[0];
for (int i = 1; i < n; i++) {
    leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
}

// build rightMax (right to left)
rightMax[n - 1] = nums[n - 1];
for (int i = n - 2; i >= 0; i--) {
    rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
}

for (int i = 0; i < n; i++) {
    totalWater += (Math.min(leftMax[i], rightMax[i])-nums[i]);
}

System.out.println("\nTotal Trapped Water = " + totalWater);


 }
    public static void main(String[] args) {
        int nums [] = {4,2,0,3,2,5};
        TriappedWater(nums);
    }
    
}
