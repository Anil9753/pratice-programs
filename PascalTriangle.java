class PascalTriangle {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> prev=new ArrayList<>();
        ArrayList<Integer> cur=new ArrayList<>();
        prev.add(1);
        for(int i=1;i<n;i++){
            cur=new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(prev.get(j-1)+prev.get(j));
            }
            cur.add(1);
            prev=cur;
        }
        return prev;
    }
}
