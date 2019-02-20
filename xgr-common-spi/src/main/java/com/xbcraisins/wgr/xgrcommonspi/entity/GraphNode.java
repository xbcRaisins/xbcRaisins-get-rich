package com.xbcraisins.wgr.xgrcommonspi.entity;


import org.neo4j.ogm.annotation.NodeEntity;

import java.io.Serializable;

@NodeEntity(label="GraphNode")
public class GraphNode implements Serializable {

    public static final Short STATUS_UPDATE= 0;

    public static final Short STATUS_NEW =1;

    private static final long serialVersionUID = 607424849430051741L;

    private Long nodeSeq;
    private String nodeId;
    private Long fatherSeq;
    private String fatherId;
    private String nodeName;
    private Short group;
    private Short status;

    public Long getNodeSeq() {
        return nodeSeq;
    }

    public void setNodeSeq(Long nodeSeq) {
        this.nodeSeq = nodeSeq;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Long getFatherSeq() {
        return fatherSeq;
    }

    public void setFatherSeq(Long fatherSeq) {
        this.fatherSeq = fatherSeq;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Short getGroup() {
        return group;
    }

    public void setGroup(Short group) {
        this.group = group;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }



}
