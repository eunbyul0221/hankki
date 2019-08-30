package io.hankki.recipe.proxy.feign;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import io.hankki.recipe.proxy.feign.dto.Material;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MaterialProxyTest {
	
	
	@Autowired
	MaterialProxy proxy;
	
	@Test
	public void findAllTest() {
		proxy.findAllMaterials();
//		for(Material material : materials) {
//			log.info(materials.toString());
//		}
	}
	
	@Test
	public void findTest() {
		proxy.findMaterial(1L);
//		for(Material material : materials) {
//			log.info(materials.toString());
//		}
	}
	

}
