class PrimeNumbers {
    static boolean isPrime(int n) {
        // code here
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
