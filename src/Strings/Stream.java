package Strings;

public class Stream {
    public static void main(String[] args){
        skip("","baccad");
    }
    public static void skip(String p, String Up){
        if(Up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=Up.charAt(0);
        if(ch == 'a'){
            skip(p , Up.substring(1));
        }
        else {
            skip(p+ch,Up.substring(1));
        }
    }
}
