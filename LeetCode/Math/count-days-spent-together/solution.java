class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
     int[] days={0,31,59,90,120,151,181,212,243,273,304,334,365};

     int startAlice=Integer.parseInt(arriveAlice.substring(3,5))+days[Integer.parseInt(arriveAlice.substring(0,2))-1];   
     int endAlice=Integer.parseInt(leaveAlice.substring(3,5))+days[Integer.parseInt(leaveAlice.substring(0,2))-1];   
     int startBob=Integer.parseInt(arriveBob.substring(3,5))+days[Integer.parseInt(arriveBob.substring(0,2))-1];   
     int endBob=Integer.parseInt(leaveBob.substring(3,5))+days[Integer.parseInt(leaveBob.substring(0,2))-1];   

     if(endAlice<startBob || endBob<startAlice) return 0;

     int start=Math.max(startAlice,startBob);
     int end=Math.min(endAlice,endBob);

     return end-start+1;
    }
}