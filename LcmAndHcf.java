class LcmAndHcf {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int prod=a*b;
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        int gcd=a;
        int lcm=prod/gcd;
        return new int [] {lcm,gcd};
    }
}
