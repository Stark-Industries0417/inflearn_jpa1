package jpabook.jpashop.domain;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // 임베디드 타입은 기본 생성자를 public 또는 protected로 설정해야 한다
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {}

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
