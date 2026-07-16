package Recursion;

public class SkipString {
    public static void main(String[] args){
        System.out.println(Skip("bacapplegj"));
    }
    public static String Skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return Skip(up.substring(5));
        }
        else{
            return up.charAt(0) + Skip(up.substring(1));
        }
    }
}
