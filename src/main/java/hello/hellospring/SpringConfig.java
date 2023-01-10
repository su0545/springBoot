package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){ //스프링 Bean에 올리기
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() { //스프링 Bean에 올리기
        return new MemoryMemberRepository();
    }
}
