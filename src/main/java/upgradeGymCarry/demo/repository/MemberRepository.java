package upgradeGymCarry.demo.repository;

import upgradeGymCarry.demo.domain.Member;
import upgradeGymCarry.demo.domain.MemberEntity;


public interface MemberRepository {
    Member insert(Member member);

    Member select(MemberEntity memberEntity);
}
