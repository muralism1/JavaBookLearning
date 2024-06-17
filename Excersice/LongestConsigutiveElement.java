package Excersice;

public class LongestConsigutiveElement {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        // int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int len = nums.length,sort=1;
        int[] a1 = new int[len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]>nums[j]){
                    // sort = nums[i];
                    // System.out.println(sort);
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }
            System.out.print(nums[i]+" ");
        }

        // System.out.println();
        // for(int i=0;i<len;i++){
        //     for(int j =i+1;j<len;j++){
                
        //         int s = nums[i]+1;
        //         // System.out.println("nums[j] :"+nums[j] +" nums[i]+1 : "+ s +" Sort  "+sort);
        //         if(nums[i]+1 == nums[j]){
        //             sort++;
        //             System.out.println("nums[j] :"+nums[j] +" nums[i]+1 : "+ s +" Sort  "+sort);
        //         }
        //     }
        // }
        // System.out.println("Answer : "+sort);

        int longestStreak = 1;
int currentStreak = 1;

for (int i = 1; i < len; i++) {
    if (nums[i] == nums[i - 1] + 1) {
        currentStreak++;
    } else if (nums[i] == nums[i - 1]) {
        continue;
    } else {
        longestStreak = Math.max(longestStreak, currentStreak);
        currentStreak = 1;
    }
}

longestStreak = Math.max(longestStreak, currentStreak);
System.out.println("Longest consecutive sequence length: " + longestStreak);

    }
}
