package upgradeGymCarry.demo.repository;

import org.springframework.stereotype.Repository;
import upgradeGymCarry.demo.domain.Member;

@Repository
public class JDBCMemberRepository implements MemberRepository {
    @Override
    public Member insert(Member member) {
        return null;
    }

    @Override
    public Member select(Member member) {
        return null;
    }
}
