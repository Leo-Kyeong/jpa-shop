package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ITEM")
public class Item {
	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private Long id;

	private String name;

	private int price;

	private int stockQuantity;
}
