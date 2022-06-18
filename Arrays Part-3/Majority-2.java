class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
        
        List<Integer>list = new ArrayList<>();
        
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i=0 ;i<arr.length ;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);

        }

        for(int i :map.keySet()){

            if(map.get(i)>arr.length/3) list.add(i);

        }
        return list;
    }
}
