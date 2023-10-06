package upgradeGymCarry.demo.repository;

import upgradeGymCarry.demo.domain.Member;

import javax.persistence.EntityManager;

public class JPAMemberRepository implements MemberRepository{
    private final EntityManager em;

    public JPAMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member insert(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Member select(Member member) {
        return null;
    }
}
