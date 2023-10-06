package upgradeGymCarry.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upgradeGymCarry.demo.domain.Member;
import upgradeGymCarry.demo.domain.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Member insert(Member member);

    Member select(Member member);
}
