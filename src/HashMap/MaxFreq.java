package HashMap;
import java.util.*;
public class MaxFreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int ele : arr){
            if(!mp.containsKey(ele)){
                mp.put(ele,1);
            }
            else{
                mp.put(ele, mp.get(ele)+1);
            }
        }
        System.out.println("Frequency map");
        System.out.println(mp);
        int maxFreq =Integer.MIN_VALUE;
        int ans = -1;
        for(var e:mp.entrySet()){
            if(maxFreq<e.getValue()){
                maxFreq=e.getValue();
                ans=e.getKey();
            }
        }
        System.out.printf("%d has max freq and occurs %d times\n", ans, maxFreq);
    }
}
