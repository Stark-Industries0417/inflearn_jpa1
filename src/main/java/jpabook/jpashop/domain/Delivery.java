package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) // EnumType.ORDINAL -> Enum 값을 숫자로 치환해서 저장함 추후에 ENUM 값이 하나 더 생기면 수가 밀린다
    private DeliveryStatus status; // READY, COMP
}
