public class Bubble{
    public static void bubblesort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[ ] = {5,4,3,2,1};
        bubblesort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+" ");
            }
        }
    }
