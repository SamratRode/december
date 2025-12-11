class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans=new ArrayList<>();
        List<Integer> negs=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            
            //calculate
            if(arr[j]<0){
                negs.add(arr[j]);
            }
            
            //get the window size
            if(j-i+1<k){
                j++;
            }
            
            //maintain the window size and calculate ans
            else if(j-i+1==k){
                if(negs.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(negs.get(0));   
                    if(negs.get(0)==arr[i]){
                        negs.remove(0);
                    }
                }
                i++;
                j++;
                //don't forget to maintain window size
            }
        }
        return ans;
    }
}
