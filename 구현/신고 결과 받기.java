import java.util.*;

class Member {
  String id;
  List<String> reportedId = new ArrayList<>(); // 나를 신고한 id
  int recieveMail = 0; // 받을 메일 횟수

  public Member(String id) {
    this.id = id;
  }

  String getId() {
    return this.id;
  }

  void setReportedId(List<String> reportedId) {
    this.reportedId = reportedId;
  }

  List<String> getReportedId() {
    return this.reportedId;
  }

  int getRecieveMail() {
    return this.recieveMail;
  }

  void addRecieveMail() {
    this.recieveMail += 1;
  }
}

class Solution {
  Map<String, Member> members;
  List<Member> stopMembers = new ArrayList<>();
  int[] answer;

  public int[] solution(String[] id_list, String[] report, int k) {
    members = new HashMap<>();
    answer = new int[id_list.length];

    // 1. id_list를 기반으로 member 객체 생성 + member 배열 저장
    for (int i = 0; i < id_list.length; i++) {
      String id = id_list[i];
      Member member = new Member(id);

      members.put(id, member);
    }

    // 2. report를 기반으로 reportName, reportedName 갱신 (중복인 경우 갱신x)
    for (int i = 0; i < report.length; i++) {
      String[] reportData = report[i].split(" ");
      String reporter = reportData[0];
      String reported = reportData[1];

      // 신고당한 객체에 reportedId 갱신 => 신고자 갱신
      Member findMember = members.get(reported);

      List<String> reportedId = findMember.getReportedId();
      if (!reportedId.contains(reporter))
        reportedId.add(reporter);

      findMember.setReportedId(reportedId);
    }

    // 3. 신고당한 횟수가 K번 이상인 member 객체 리스트 생성
    members.forEach((id, member) -> {
      int reportedCount = member.reportedId.size();
      if (reportedCount >= k)
        stopMembers.add(member);
    });

    // 4. stopMembers에 있는 객체의 reportedId를 가져오고, 해당 id를 가진 member 객체의 recieveMail++;
    stopMembers.forEach(member -> {
      List<String> reportedId = member.getReportedId();

      for (String id : reportedId) {
        Member reporter = members.get(id);
        reporter.addRecieveMail();
      }
    });

    // 5. 차례대로 recieveMail 수를 배열에 저장하여 출력
    for (int i = 0; i < answer.length; i++) {
      String id = id_list[i];
      int recieveMail = members.get(id).getRecieveMail();

      answer[i] = recieveMail;
    }

    return answer;
  }
}