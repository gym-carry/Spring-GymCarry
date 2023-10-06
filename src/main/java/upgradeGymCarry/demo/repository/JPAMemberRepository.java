package upgradeGymCarry.demo.repository;


import org.springframework.beans.factory.annotation.Autowired;
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

    // 마이페이지용 메서드
    @Override
    public Member select(MemberEntity memberEntity) {
        return null;
    }
}
