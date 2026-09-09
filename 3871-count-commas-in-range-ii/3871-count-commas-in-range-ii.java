class Solution {
    public long countCommas(long n) {
        long comma = 0;
        long factor = 1000;
        while(n>=factor){
            comma +=(n- factor)+1;
            factor *=1000;
        }
        return comma;
    }
}