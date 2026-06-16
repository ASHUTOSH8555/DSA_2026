package HashSet;

import java.util.HashSet;

public class IntroOfHashset {
    public static void main(String[] args){
        HashSet<String> st=new HashSet<>();
        st.add("Ashutosh");
        st.add("Garvit");
        st.add("Bansal");
        st.add("Ashutosh");
        System.out.println(st); // Ashutosh , Bansal , Garvit
        System.out.println(st.contains("Ashutosh")); //true
        System.out.println(st.size()); // 3
        st.remove("Garvit");
        System.out.println(st); // Ashutosh , Bansal
        System.out.println(st.size()); // 2
        System.out.println(st.contains("Garvit")); // False
        System.out.println(st.add("Mark")); // True
        for(String s : st){
            System.out.print(s+" ");  // Ashutosh , Bansal , Mark
        }
    }
}
