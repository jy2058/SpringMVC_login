package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {
    private long id;

    @NotEmpty
    private String loginId; // 로그인 ID
    @NotEmpty
    private String name;    // 사용자 이름
    @NotEmpty
    private String password;// 패스워드

}
