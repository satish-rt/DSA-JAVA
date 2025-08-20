public class TriappingRainwater {
public static int trappedWater(int height[]) {
    int n = height.length;
    int leftMax[] = new int[n];
    int rightMax[] = new int[n];
    int trappWater = 0;

    // Step 1: Fill leftMax
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }

    // Step 2: Fill rightMax
    rightMax[n-1] = height[n-1];
    for (int i = n-2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    // Step 3: Calculate trapped water
    for (int i = 0; i < n; i++) {
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        trappWater += waterLevel - height[i];
    }

    return trappWater;
}
public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
     System.out.println("Trapped Water: " + trappedWater(height));
}
    
}
