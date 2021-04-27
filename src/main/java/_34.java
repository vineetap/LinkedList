package main.java;

public class _34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
            return new int[]{-1,-1};

        int left=0;
        int right=nums.length-1;
        int mid=-1;

        while(left<=right ){
            mid=(left+right)/2;
            System.out.println(left +" " +mid+" "+right);

            if(nums[mid]==target)
                break;
            else if(nums[mid]<target)
                left=mid+1;
            else
                right=mid-1;

        }

        if(nums[mid]==target){
            left=mid;
            while(left-1>=0){
                if(nums[left-1]==target)
                    left --;
                else break;
            }
            right=mid;
            while(right+1<nums.length){
                if(nums[right+1]==target)
                    right++;
                else break;
            }

            return new int[]{left,right};
        }

        return new int[]{-1,-1};
    }
}
