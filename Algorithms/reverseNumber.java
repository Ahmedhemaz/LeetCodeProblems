class Solution {
    public int reverse(int x) {
        int newNum = 0;
        while(true){
            newNum += x%10;
            x  /= 10;
        try {
            if(x == 0){ break;}
              newNum = Math.multiplyExact(newNum, 10);
            } catch(ArithmeticException e) {
                newNum = 0;
                break;
            }
        }
        return newNum;
            
    }
}