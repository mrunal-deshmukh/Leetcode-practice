class Solution {
    public boolean checkPossibility(int[] nums) {
       int i,j;
        boolean replace = false;
        for(i=0,j=1;i<j && j<nums.length;i++,j++){
            if(nums[i]<=nums[j]){
                continue;
            } else { // i>j
                if(replace==false){
                    //then replace
                    if(i>0){
                       int vali = nums[i];
                       int jval = nums[j];
                       int iprev = nums[i-1];
                       if(iprev <= jval){
                          nums[i] = iprev;  
                        }
                        else{
                            nums[i+1]=nums[i];
                           }
                    }

                    replace = true;
                }else{
                    return false;
                }
            }
        }
      
     return true;      
    }  
}