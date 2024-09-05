class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int secondLast = 0;
        int last = 1;
        return recursiveFib(secondLast, last, 2, n);
    }
    public int recursiveFib(int secondLast, int last, int iteration, int n ) {
        if(iteration >= n) return secondLast + last;
        iteration++;
        return recursiveFib(last,secondLast + last, iteration, n);
    }
}