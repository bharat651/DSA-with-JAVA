class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count =0;
         Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        //  int[][] filtervalue = Arrays.stream(interval)
        //  .filter(())
        int end = intervals[0][1];
         for(int i=1;i<intervals.length;i++){
            
            System.out.println(end);
            if((intervals[i][0]>=end)){
                end=intervals[i][1];
            }
            else{
                count++;
            }
         }

        return count;
    }
}