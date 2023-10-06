package upgradeGymCarry.demo.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity// 엔티티로 지정
@Getter // 게터
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 프로텍티드
public class MemberEntity {

    @Id // id를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "pwd", nullable = false)
    private String pwd;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Builder // 빌더 패턴으로 객체 생성
    public MemberEntity(String name, String pwd, String email, String phone) {
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.phone = phone;
    }

}
