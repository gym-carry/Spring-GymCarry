package upgradeGymCarry.demo.repository;

import upgradeGymCarry.demo.domain.Member;
import upgradeGymCarry.demo.domain.MemberEntity;


public interface MemberRepository {
    Member insert(MemberEntity memberEntity);

    Member select(Member member);
}
