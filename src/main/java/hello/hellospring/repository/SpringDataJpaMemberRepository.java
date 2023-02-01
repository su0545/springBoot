package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL select m from Member m where m where m.name = ? findBy라고 하면 이렇게 쿼리가 짜진다.
    @Override
    Optional<Member> findByName(String name);
}
