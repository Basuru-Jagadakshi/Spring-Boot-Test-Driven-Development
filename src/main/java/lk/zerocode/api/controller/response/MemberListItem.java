package lk.zerocode.api.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberListItem {

    private Long id;
    private String name;
    private String nic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
