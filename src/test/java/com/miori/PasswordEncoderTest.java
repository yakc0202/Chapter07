package com.miori;

import com.miori.domain.Member;
import com.miori.domain.Role;
import com.miori.persistence.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class PasswordEncoderTest {

    @Autowired
    private MemberRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @Test
    public void testInsert(){
        Member member = new Member();
        member.setId("manager2");
        member.setPassword(encoder.encode("manager456"));
        member.setName("매니저2");
        member.setRole(Role.ROLE_MANAGER);
        member.setEnabled(true);
        repository.save(member);
    }
}
