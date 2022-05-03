package jpabook.jpashop.web;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {

    @Not(message = "회원 이름은 필수 입니다")
    private String name;
    private String city;
    private String street;
    private String zipcode;
}

