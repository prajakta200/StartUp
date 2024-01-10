class Substring {
    public static void main(String[] args) {
        String str="abbasd";
        int N=str.length()-1;
         
        for(int i=0;i<=N;i++){
            for(int j=i;j<N;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println(" ");
            }
        
        }
    }
}

