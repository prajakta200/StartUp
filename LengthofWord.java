public class LengthofWord {
    public static void main(String[] args){
        String  str=" I am Prajakta ";
        int count=0;

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) !=' '){
                count++;
            }else if(count>0){
                break;
            }
            
            
        }
        System.out.println(count);
    }
}
