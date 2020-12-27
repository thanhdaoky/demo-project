package com.dkthanh.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "project_investor", schema = "demo", catalog = "")
@IdClass(ProjectInvestorEntityPK.class)
public class ProjectInvestorEntity {
    private Integer userId;
    private Integer projectId;
    private Integer investionOptionId;
    private BigDecimal pledged;
    private Timestamp timestamp;

    @Id
    @Column(name = "user_id", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "project_id", nullable = false)
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Id
    @Column(name = "investion_option_id", nullable = false)
    public Integer getInvestionOptionId() {
        return investionOptionId;
    }

    public void setInvestionOptionId(Integer investionOptionId) {
        this.investionOptionId = investionOptionId;
    }

    @Basic
    @Column(name = "pledged", nullable = true, precision = 2)
    public BigDecimal getPledged() {
        return pledged;
    }

    public void setPledged(BigDecimal pledged) {
        this.pledged = pledged;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectInvestorEntity that = (ProjectInvestorEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(projectId, that.projectId) &&
                Objects.equals(investionOptionId, that.investionOptionId) &&
                Objects.equals(pledged, that.pledged) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, projectId, investionOptionId, pledged, timestamp);
    }
}
