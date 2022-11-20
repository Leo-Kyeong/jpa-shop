package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie extends Item {
	private String director;
	private String actor;
}
