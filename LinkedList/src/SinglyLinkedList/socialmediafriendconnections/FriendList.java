package SinglyLinkedList.socialmediafriendconnections;
import java.util.ArrayList;
import java.util.List;

class FriendList {
    List<Integer> friendIDs;

    FriendList() {
        this.friendIDs = new ArrayList<>();
    }

    void addFriend(int friendID) {
        if (!friendIDs.contains(friendID)) {
            friendIDs.add(friendID);
        }
    }

    void removeFriend(int friendID) {
        friendIDs.remove(Integer.valueOf(friendID));
    }

    List<Integer> getMutualFriends(FriendList other) {
        List<Integer> mutualFriends = new ArrayList<>();
        for (int friendID : this.friendIDs) {
            if (other.friendIDs.contains(friendID)) {
                mutualFriends.add(friendID);
            }
        }
        return mutualFriends;
    }

    int countFriends() {
        return friendIDs.size();
    }

    List<Integer> getFriends() {
        return new ArrayList<>(friendIDs);
    }
}
