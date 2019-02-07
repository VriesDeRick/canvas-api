package edu.ksu.canvas.model;

import com.google.gson.annotations.SerializedName;

public class GroupMembership {

    @SerializedName("id")
    private Integer membershipId;
    private Integer groupId;
    private Integer userId;
    private String workflowState;
    private Boolean moderator;
    private Boolean justCreated;
    private Integer sisImportId;

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public Boolean getModerator() {
        return moderator;
    }

    public void setModerator(Boolean moderator) {
        this.moderator = moderator;
    }

    public Boolean getJustCreated() {
        return justCreated;
    }

    public void setJustCreated(Boolean justCreated) {
        this.justCreated = justCreated;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }
}
