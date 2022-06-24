class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job array[], int n)
    {
          Arrays.sort(array , (a , b)->b.profit-a.profit);

        HashMap<Integer , Integer> map= new HashMap<>();


        for(Job j : array){

            if(!map.containsKey(j.deadline)){
                map.put(j.deadline, j.profit);
            }

            else if (map.containsKey(j.deadline) && j.deadline>1){         //Sorting in decreasing order of profit

                int val = j.deadline;
                while(map.containsKey(val)){
                    val--;
                }
                if(val>=1){
                    map.put(val , j.profit);
                }

            }

        }

        Set<Integer> key = map.keySet();
        int maxJobs =0;
        int maxProfit =0;

        for(int i : key){
            maxJobs +=1;
            maxProfit += map.get(i);
        }
       
        int[] arr = new int[2];
        arr[0]=maxJobs;
        arr[1]=maxProfit;
        
        return arr;
        
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
