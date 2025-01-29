package SinglyLinkedList.socialmediafriendconnections;

class UserNode {
    int userID;
    String name;
    int age;
    FriendList friends;
    UserNode next;

    UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = new FriendList();
        this.next = null;
    }
}