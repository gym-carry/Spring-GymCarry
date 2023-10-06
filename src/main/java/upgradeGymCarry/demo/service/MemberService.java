package upgradeGymCarry.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upgradeGymCarry.demo.domain.Member;
import upgradeGymCarry.demo.repository.MemberRepository;
@RequiredArgsConstructor
@Service // 빈으로 등록
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public int login(String id, String pwd){
        return 1;
    }


    public int join(Member member){
        return 1;
    }
}
