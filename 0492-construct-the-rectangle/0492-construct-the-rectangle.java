class Solution {
    public int[] constructRectangle(int area) {
        int[] ans=new int[2];
        int length=0;
        int breadth=0;
        int L=(int)(Math.sqrt(area));
        for(int i=L;i<=area;i++){
            int B=area/i;
            if(i*B==area){
                if(i>=B){
                    if(length==0 && breadth==0){
                        length=i;
                        breadth=B;
                    }
                    else{
                        int diff=Math.abs(length-breadth);
                        if(diff>Math.abs(i-B)){
                            length=i;
                            breadth=B;
                        }
                    }
                }
            }
        }

        ans[0]=length;
        ans[1]=breadth;

        return ans;
    }
}