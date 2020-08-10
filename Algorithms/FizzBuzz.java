class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arrList = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%3 == 0 && i%5 ==0){
                arrList.add("FizzBuzz");
            }else if(i%5 ==0){
                arrList.add("Buzz");
            }else if(i%3 == 0 ){
                arrList.add("Fizz");
            }else{
                arrList.add(String.valueOf(i));
            }
            
        }
        return arrList;
    }
}