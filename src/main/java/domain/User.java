package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int uid;       // 사용자 ID (Primary Key)
    private String name;   // 사용자 이름
    private int id;        // 로그인 ID (추가 설명 필요)
    private String pw;     // 비밀번호 (해싱된 형태로 저장해야 함)
    private String email;  // 이메일
    private int fid;       // 가족 그룹 ID (Foreign Key)
}