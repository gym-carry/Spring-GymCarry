package upgradeGymCarry.demo.repository;

import upgradeGymCarry.demo.domain.Member;

public interface memberRepository {
    Member insert(Member member);

    Member select(Member member);
}
