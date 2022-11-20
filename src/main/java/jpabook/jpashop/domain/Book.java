package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book extends Item{
	private String author;
	private String isbn;
}
