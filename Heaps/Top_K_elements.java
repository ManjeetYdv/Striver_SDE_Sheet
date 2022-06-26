class Solution {
    
    
    public int[] topKFrequent(int[] nums, int k) {
        
       if(nums.length == 0){
        return new int[k];
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(map.get(a)-map.get(b)));      // this heapify function will sort the queue from min to max and minimum value will be placed at the top
        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i = 0;
        int[] result = new int[k];
        while(pq.size()!=0){
            int rem = pq.poll();
            result[i++] = rem;
        }

        return result;
    }
}
