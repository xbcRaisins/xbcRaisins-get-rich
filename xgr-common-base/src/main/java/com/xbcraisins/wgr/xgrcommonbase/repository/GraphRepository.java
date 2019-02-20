package com.xbcraisins.wgr.xgrcommonbase.repository;

import com.xbcraisins.wgr.xgrcommonbase.common.entity.GraphNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface GraphRepository extends Neo4jRepository<GraphNode,Long> {


    /**
     * 根据seq查询节点
     * @date 2019/2/20 16:31
     * @author xbcRaisins
     * @param nodeSeq
     * @return com.xbcraisins.wgr.xgrcommonbase.common.entity.GraphNode
     */
    GraphNode findByNodeSeq(@Param("nodeSeq") String nodeSeq);

}
