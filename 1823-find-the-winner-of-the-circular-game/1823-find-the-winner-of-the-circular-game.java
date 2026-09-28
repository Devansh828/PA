class Solution {

    private int winner(int[] person, int index, int person_left, int k) {
        if (person_left == 1) {
            for (int i = 0; i < person.length; i++) {
                if (person[i] == 0) {
                    return i + 1;
                }
            }
        }
        int kill = (k - 1) % person_left;

        while (kill!=0) {
            index = (index + 1) % person.length;
            while (person[index] == 1) {
                index = (index + 1) % person.length;
            }

            kill--;
        }
        person[index] = 1;

        while (person[index] == 1) {
            index = (index + 1) % person.length;
        }

        return winner(person,index,person_left-1,k);

    }

    public int findTheWinner(int n, int k) {
        int[] person = new int[n];
        for (int i = 0; i < person.length; i++) {
            person[i] = 0;
        }

        return winner(person,0,n,k);

    }
}