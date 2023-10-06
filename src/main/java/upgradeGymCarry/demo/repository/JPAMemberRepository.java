package upgradeGymCarry.demo.repository;

import org.springframework.stereotype.Repository;
import upgradeGymCarry.demo.domain.Member;
import upgradeGymCarry.demo.domain.MemberEntity;

import javax.persistence.EntityManager;
@Repository
public class JPAMemberRepository implements MemberRepository{
    private final EntityManager em;

    public JPAMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member insert(MemberEntity memberEntity) {
        em.persist(memberEntity);
        return null;
    }

    @Override
    public Member select(Member member) {
        return null;
    }
}
