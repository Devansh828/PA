class Solution {


    public boolean checkStraightLine(int[][] coordinates) {
        
        float x1=(float)(coordinates[0][0]);
        float y1=(float)(coordinates[0][1]);

        float x2=(float)(coordinates[1][0]);
        float y2=(float)(coordinates[1][1]);

        float slope=(y2-y1)/(x2-x1);
        // System.out.println(slope);
        float c=y1-slope*x1;

        boolean sameX = true, sameY = true;
        for(int i = 1; i < coordinates.length; i++){
            if(coordinates[i][0] != coordinates[i-1][0])    sameX = false;
            if(coordinates[i][1] != coordinates[i-1][1])    sameY = false;
        }
        
        if(sameX || sameY)  return true;

        for(int i=2;i<coordinates.length;i++){
            float x3=(float)(coordinates[i][0]);
            float y3=(float)(coordinates[i][1]);

            float output=slope*x3 + c - y3;
            // System.out.println(output);
            if(output!=0) return false;
        }

        return true;

    }
}