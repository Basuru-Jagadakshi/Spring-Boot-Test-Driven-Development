package lk.zerocode.api.controller.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MemberListResponse {

   private List<MemberListItem> members;

   public List<MemberListItem> getMembers() {
      return members;
   }

   public void setMembers(List<MemberListItem> members) {
      this.members = members;
   }
}
