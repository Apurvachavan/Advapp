package com.app.pojo;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public BaseEntity(Long id) {
//		super();
//		this.id = id;
//	}

//	public BaseEntity() {
//		super();
//	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + "]";
	}
	
	
}

