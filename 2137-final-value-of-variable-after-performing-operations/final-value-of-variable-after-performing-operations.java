class Solution {
    public int finalValueAfterOperations(String[] operations) {
      var x=0;
      for(int i = 0;i<operations.length; i++){
        String opr = operations[i];
        if(opr.contains("+")){
            x++;

        }
        else{
            x--;
        }
      }
      return x;
    }
}