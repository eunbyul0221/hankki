package io.hankki.recipe.proxy.feign.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Material {
	private Long materialId;
	
	private String materialName;
	private MaterialCategory materialCategory;
	
	public enum MaterialCategory {
		야채, 육류, 양념, 인스턴트, 가공식품, 기타
	}

}
