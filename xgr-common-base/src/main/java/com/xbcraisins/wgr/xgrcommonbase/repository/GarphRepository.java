package com.xbcraisins.wgr.xgrcommonbase.repository;


import com.xbcraisins.wgr.xgrcommonbase.common.entity.Coder;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Michael Hunger
 * @author Mark Angrish
 * @author Michael J. Simons
 */
@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface GarphRepository extends Neo4jRepository<Coder, Long> {

	Coder getCoderByName(@RequestParam(value="name") String name);

}