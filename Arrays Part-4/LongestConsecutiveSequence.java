class Solution {
    public int longestConsecutive(int[] arr) {
         HashMap<Integer , Integer> elem = new HashMap<>();

        for(int num: arr){
            elem.put(num ,1 );

        }
        int currNum;
        int currenStreak;
        int longestStreak = 0;
        for(int i=0 ; i<arr.length ;i++){

            if(!elem.containsKey(arr[i]-1)){
                currNum =arr[i];
                currenStreak =1;

                while(elem.containsKey(currNum+1)){
                    currNum+=1;
                    currenStreak +=1;
                }

                longestStreak = Integer.max(longestStreak , currenStreak);

            }
           
    }
         return longestStreak;
}
}
