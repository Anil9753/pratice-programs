
class SieveOfEratosthenes {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        // code here
        boolean []primes=new boolean[n+1];
        ArrayList<Integer>res=new ArrayList<>();
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for(int i=2;i<=n;i++){
            if(primes[i]==true){
                for(int j=2*i;j<=n;j+=i){
                    primes[j]=false;
                }
            }
            
        }
        for(int i=0;i<n+1;i++){
            if(primes[i]==true){
                res.add(i);
            }
        }
        return res;
    }
}
