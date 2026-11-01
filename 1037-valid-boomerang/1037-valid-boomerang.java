class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1=points[0][0];
        int y1=points[0][1];
        int x2=points[1][0];
        int y2=points[1][1];

        int x3=points[2][0];
        int y3=points[2][1];


        // // 1 2
        // if(x1==x2 && y1==y2)  return false;


        // // 1 3
        // if(x1==x3 && y1==y3)  return false;


        // // 2 3
        // if(x2==x3 && y2==y3)  return false;

        // if(x1==x2 && x1==x3) return false;

        // if(y1==y2 && y1==y3) return false;


        // float m=(float)(y2-y1)/(float)(x2-x1);


        // // y-y1=m(x-x1)


        // float ans=y3-y1-m*x3+m*x1;

        // if(ans==0) return false;
        // else return true;


        return (x2-x1)*(y3-y1) !=
               (y2-y1)*(x3-x1);
    }
}