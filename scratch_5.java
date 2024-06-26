class scratch{
    public static void main(String[] args) {
        int n=3;
//will print upper part
        for(int i =0; i<n;i++){
            int stars= i+1;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        will print lower half part
    int b=n-1;
        for(int i=0;i<b;i++){
            int stars=b-i;
            for (int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}