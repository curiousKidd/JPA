package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTestTestRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    public void testMember() {
        //given
        MemberTest memberTest = new MemberTest();
        memberTest.setUserName("test");

        //when
        Long saveId = memberRepository.save(memberTest);
        MemberTest findMemberTestTest = memberRepository.find(saveId);

        //then
        Assertions.assertThat(findMemberTestTest.getId()).isEqualTo(memberTest.getId());
        Assertions.assertThat(findMemberTestTest.getUserName()).isEqualTo(memberTest.getUserName());
        Assertions.assertThat(findMemberTestTest).isEqualTo(memberTest);
    }


}