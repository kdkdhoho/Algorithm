import java.util.*;

class Solution {

  final int ENTER = 0;
  final int LEAVE = 1;

  HashMap<String, User> users = new HashMap<>();
  ArrayList<Message> messages = new ArrayList<>();

  ArrayList<String> result = new ArrayList<>();

  public String[] solution(String[] record) {
    for (String s : record) {
      String[] data = s.split(" ");
      String action = data[0];
      String id = data[1];
      String nickname = null;
      if (!action.equals("Leave"))
        nickname = data[2];

      User user = null;
      if (users.containsKey(id))
        user = users.get(id);
      else {
        user = new User(id, nickname, false);
        users.put(id, user);
      }

      if (action.equals("Enter")) {
        if (user.isLeaved) {
          user.changeNickname(nickname);
          users.put(id, user);
        }

        messages.add(new Message(id, ENTER));
      } else if (action.equals("Leave")) {
        user.isLeaved = true;
        messages.add(new Message(id, LEAVE));
      } else {
        user.changeNickname(nickname);
        users.put(id, user);
      }
    }

    for (Message m : messages) {
      User user = users.get(m.id);
      result.add(m.toString(user));
    }

    String[] answer = result.toArray(new String[result.size()]);
    return answer;
  } // end of solution
}

class User {
  String id;
  String nickname;
  boolean isLeaved;

  public User(String id, String nickname, boolean isLeaved) {
    this.id = id;
    this.nickname = nickname;
    this.isLeaved = isLeaved;
  }

  public void changeNickname(String newNickname) {
    this.nickname = newNickname;
  }

  public String getNickname() {
    return this.nickname;
  }
}

class Message {
  String id;
  int status; // 0: Enter, 1: Leave

  public Message(String id, int status) {
    this.id = id;
    this.status = status;
  }

  public String toString(User user) {
    if (status == 0)
      return "" + user.nickname + "님이 들어왔습니다.";

    return "" + user.nickname + "님이 나갔습니다.";
  }
}