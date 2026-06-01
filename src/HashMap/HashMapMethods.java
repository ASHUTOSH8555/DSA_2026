package HashMap;

import java.lang.reflect.Method;
import java.util.*;

public class HashMapMethods {
    static void Hashmap(){
        Map<String,Integer> mp=new HashMap<>(); // HashMap contains value in Pairs (key, value)
        mp.put("Akash",25);
        mp.put("Alok",26);
        mp.put("Aham",27);
        mp.put("Vishal",28);
        mp.put("Ravi",29);
        System.out.println(mp);

        System.out.println(mp.get("Aham")); // it will return 27
        System.out.println(mp.get("Ravi"));// it will return 29
        System.out.println(mp.get("Ashutosh")); //  it will return null as Ashutosh is not present as the key
        // to update the value of the key present in the map.
        mp.put("Akash", 22); // it will update the value of Akash from 25 → 26
        System.out.println(mp.get("Akash")); // it will return 22
        // To remove the key from the map it it exist.
        System.out.println(mp.remove("Akash")); // it will print the value because if key exists then it return the value of the return key.
        System.out.println(mp);// it shows that Akash is removed from the HashMap.
        System.out.println(mp.remove("Ashutosh")); // it will return null as Ashutosh is not present in key.

        // To check whether the key exis t or not.
        System.out.println(mp.containsKey("Raj")); // return false
        System.out.println(mp.containsKey("Aham")); // true
        // Adding a new key if the key dosen't exist already.
        mp.putIfAbsent("Abhishek", 30);// it will get inserted
        mp.putIfAbsent("Aham", 30);// it will not get inserted
        System.out.println(mp);
        // to get the all keys present in the HashMap.
        System.out.println(mp.keySet());
        // to get all the values present in the HashMap.
        System.out.println(mp.values());
        // to get all the entries in tha hashmap.
        System.out.println(mp.entrySet());

        System.out.println();
        // Traversing all the entries of HashMap → Multiple methods.
        //Method 1
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        //Method 2
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n" , e.getKey(), e.getValue());
        }
        System.out.println();
        /* Method 3 → in this method don't need to tell the type of data in for-each
        loop java will automatically understand which type of variable is this */
        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());
        }

    }
    public static void main(String[] args){
        Hashmap();
    }
}
