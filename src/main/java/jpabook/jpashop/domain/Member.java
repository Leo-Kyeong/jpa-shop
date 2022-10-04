package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MEMBER")
public class Member {

	@Id @GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long id;

	private String name;

	private String city;
	private String street;
	private String zipcode;
}
