package assign3.unit.test.Assign3;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class App {
    
    private static HashMap<String, List<String>> friendsMap = new HashMap<>();
    
    static {
        List<String> johnFriends = new ArrayList<>();
        johnFriends.add("Mike");
        johnFriends.add("Sara");
        johnFriends.add("Kate");
        
        List<String> saraFriends = new ArrayList<>();
        saraFriends.add("John");
        saraFriends.add("Kate");
        
        List<String> kateFriends = new ArrayList<>();
        kateFriends.add("Sara");
        kateFriends.add("John");

        friendsMap.put("John", johnFriends);
        friendsMap.put("Sara", saraFriends);
        friendsMap.put("Kate", kateFriends);
    }
    
    public static String[] getFriends(String name) {
        List<String> friends = friendsMap.get(name);
        if (friends != null) {
            return friends.toArray(new String[0]);
        }
        return new String[0];
    }
    
    public static void main(String[] args) {
    	
        String[] johnFriends = getFriends("John");
        System.out.println("John's friends: ");
        for (String friend : johnFriends) {
            System.out.println(friend);
        }
        
        String[] saraFriends = getFriends("Sara");
        System.out.println("Sara's friends: ");
        for (String friend : saraFriends) {
            System.out.println(friend);
        }
    }
}