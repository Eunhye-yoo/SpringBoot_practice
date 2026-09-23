package com.example.ch2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Cart {
    @Id
    private Long id;

    // @OneToOne : 회원 1명당 장바구니 1개 (1:1 관계)
    // @JoinColumn : cart 테이블에 member_id라는 FK생성
    // nullable = false : 회원이 없는 장바구니는 존재 X
    // -> SQL 문이 INNER JOIN
    // nullable 속성을 제거 하면 member_id가 null 일 수 있으므로
    // -> SQL 문이 OUTER JOIN
    @OneToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

}
