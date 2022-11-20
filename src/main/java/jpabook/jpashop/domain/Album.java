package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Album extends Item{
	private String artist;
	private String etc;
}
