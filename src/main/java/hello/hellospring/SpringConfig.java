package hello.hellospring;

import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){ //스프링 Bean에 올리기
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() { //스프링 Bean에 올리기
        return new JdbcTemplateMemberRepository(dataSource);
//        return new MemoryMemberRepository();

    }
}
