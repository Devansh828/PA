class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int student:students){
            q.add(student);
        }

        int si=0;
        int rot=0;
        while(!q.isEmpty() && rot<q.size()){
            if(q.peek()==sandwiches[si]){
                q.poll();
                si++;
                rot=0;
            }
            else{
                q.add(q.poll());
                rot++;
            }
        }

        return q.size();
    }
}