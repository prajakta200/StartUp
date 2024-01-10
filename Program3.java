
class Solution {
    int PrimeNum(int value) {
        if (value == 0 || value == 1) {
            return 0;
        }
        for (int i = 2; i <= value; i++) {
            if (value % i == 0 && value != i) {
                return 0;
            }
        }
        return value;
    }
}

class Clients {
    public static void main(String[] args) {
        int num = 15;

        Solution obj = new Solution();
        int No = obj.PrimeNum(num);

        for (int i = 0; i < num; i++) {
            System.out.println(No);
        }
    }
}




