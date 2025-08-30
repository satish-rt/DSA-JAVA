public class OptimizeBubble_Sort {
    public static void bubblesort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            int swapp = 0;
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;
                    swapp++;
                }
            }
            if(swapp==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int nums[ ] = {1,2,3,4,7,8,9};
        bubblesort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+" ");
            }
        }
    }

