package SinglyLinkedList.socialmediafriendconnections;
import java.util.List;
class SocialMedia {
    UserNode head;

    SocialMedia() {
        this.head = null;
    }

    // Add user to the system
    void addUser(int userID, String name, int age) {
        UserNode newUser = new UserNode(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Find user by user ID
    UserNode findUserByID(int userID) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // User not found
    }

    // Find user by name
    UserNode findUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // User not found
    }

    // Add friend connection between two users
    void addFriendConnection(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            user1.friends.addFriend(userID2);
            user2.friends.addFriend(userID1);
            System.out.println("Friend connection added between User " + userID1 + " and User " + userID2);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove friend connection between two users
    void removeFriendConnection(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            user1.friends.removeFriend(userID2);
            user2.friends.removeFriend(userID1);
            System.out.println("Friend connection removed between User " + userID1 + " and User " + userID2);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    void findMutualFriends(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = user1.friends.getMutualFriends(user2.friends);
            System.out.println("Mutual friends between User " + userID1 + " and User " + userID2 + ": " + mutualFriends);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Display all friends of a specific user
    void displayFriends(int userID) {
        UserNode user = findUserByID(userID);
        if (user != null) {
            List<Integer> friends = user.friends.getFriends();
            System.out.println("Friends of User " + userID + ": " + friends);
        } else {
            System.out.println("User not found.");
        }
    }

    // Count the number of friends for each user
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("User " + temp.userID + " has " + temp.friends.countFriends() + " friends.");
            temp = temp.next;
        }
    }
}