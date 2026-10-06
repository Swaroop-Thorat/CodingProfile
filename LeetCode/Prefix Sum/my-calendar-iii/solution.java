class MyCalendarThree {
    private TreeMap<Integer,Integer> tl;
    public MyCalendarThree() {
        tl=new TreeMap<>();
    }
    
    public int book(int startTime, int endTime) {
        tl.put(startTime,tl.getOrDefault(startTime,0)+1);
        tl.put(endTime,tl.getOrDefault(endTime,0)-1);

        int curr=0,ans=0;
        for(int v:tl.values()){
            ans=Math.max(ans,curr+=v);
        }
        return ans;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */