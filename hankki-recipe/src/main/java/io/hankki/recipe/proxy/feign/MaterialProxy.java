package io.hankki.recipe.proxy.feign;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.hankki.recipe.proxy.feign.dto.Material;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MaterialProxy {
	
	@Autowired
	private MaterialClient client;
	
	public Collection<Material> findAllMaterials(){
		Collection<Material> materials = client.findAllMaterials().getContent();
		log.info(materials.toString());
		return materials;
	}
	
	public Material findMaterial(Long id){
		Material material = client.findMaterial(id).getContent();
		
		return material;
	}
	
	
	@FeignClient(name="materials", url="${hankki.routes.material.url}", configuration=FeignClientConfiguration.class)
	interface MaterialClient{
		@GetMapping("/api/materials/materials")
		Resources<Material> findAllMaterials();
		
		@GetMapping("/api/materials/materials/{id}")
		Resource<Material> findMaterial(@PathVariable("id") Long id);
		
	}
	

}
