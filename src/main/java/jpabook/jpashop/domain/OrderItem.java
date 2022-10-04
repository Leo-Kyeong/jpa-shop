package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERITEM")
public class OrderItem {
	@Id
	@GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long id;

	@Column(name = "ORDER_ID")
	private Long orderId;

	@Column(name = "ITEM_ID")
	private Long itemId;

	private int orderPrice;

	private int count;


}
