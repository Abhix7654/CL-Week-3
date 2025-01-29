package SinglyLinkedList.socialmediafriendconnections;

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        // Add users
        sm.addUser(1, "Abhishek", 25);
        sm.addUser(2, "Kumar", 30);
        sm.addUser(3, "RAj", 28);

        // Add friend connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(2, 3);

        // Display friends
        sm.displayFriends(1);
        sm.displayFriends(2);

        // Find mutual friends
        sm.findMutualFriends(1, 3);

        // Remove a friend connection
        sm.removeFriendConnection(1, 2);

        // Count friends for each user
        sm.countFriends();
    }
}