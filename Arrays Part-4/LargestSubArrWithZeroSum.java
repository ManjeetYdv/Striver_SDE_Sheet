
class GfG
{
    int maxLen(int arr[], int n)
    {
         HashMap<Integer , Integer> map = new HashMap<>();

        int prefix_sum=0;
        int maxLen=0;
        int currLen=0;

        map.put(0 , -1);

        for(int i=0 ;i<arr.length ;i++){
            prefix_sum +=arr[i];
            if(!map.containsKey(prefix_sum)){
                map.put(prefix_sum , i);

            }
            else{
                currLen = i- map.get(prefix_sum);
                maxLen = Integer.max(maxLen , currLen);
            }
        }
        
        return maxLen;
        
    }
}
