
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Vector<Integer> vector = new Vector<>();

        int[][]arr = new int[n][3];
        for(int i=0 ;i< n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
            arr[i][2] =i+1;
        }
        Arrays.sort(arr ,(a ,b )->a[1]-b[1]);         //Sorting according to end time of meetings

        int last=0;
        int maxMeets=0;

        for(int[]i:arr){

            if(i[0]>last){
                maxMeets++;
                last=i[1];
                vector.add(i[2]);
            }
        }
        return maxMeets;
    }
}
