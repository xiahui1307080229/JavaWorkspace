package demo1;

public class Bubble {
	
	public static void main(String[] args) {
		
		int[] nums = {9,8,7,6,5,4,3,2,1};
		int i = 0;
		int j = 0;
		for(; i < nums.length; i++){
			for(j = i+1; j < nums.length; j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					}
			}
		}
		
		for (i = 0; i < nums.length; i++){
			System.out.print("  " + nums[i]);
		}

	}

}
