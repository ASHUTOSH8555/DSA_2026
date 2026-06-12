package HashMap;

import java.util.HashMap;
import java.util.Scanner;
public class IsomorphicString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s=sc.nextLine();
        System.out.print("Enter the Second String : ");
        String t=sc.nextLine();
        System.out.print(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> mp=new HashMap<>();
        for(int i=0; i<s.length();i++){
            Character ch1=s.charAt(i);
            Character ch2=t.charAt(i);

            if(mp.containsKey(ch1)){
                if(mp.get(ch1)!=ch2) return false;
            }
            else if(mp.containsKey(ch2)){
                return false;
            }
            else{
                mp.put(ch1, ch2);
            }
        }
        return true;
    }
}
