package edu.ksu.canvas.model;

import com.google.gson.annotations.SerializedName;

public class GroupCategory {
    @SerializedName("id")
    private Integer groupCategoryId;
    private String name;
    private String role;
    private String selfSignup;
    private String autoLeader;
    private String contextType;
    private Integer accountId;
    private Integer courseId;
    private Integer groupLimit;

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSelfSignup() {
        return selfSignup;
    }

    public void setSelfSignup(String selfSignup) {
        this.selfSignup = selfSignup;
    }

    public String getAutoLeader() {
        return autoLeader;
    }

    public void setAutoLeader(String autoLeader) {
        this.autoLeader = autoLeader;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getGroupLimit() {
        return groupLimit;
    }

    public void setGroupLimit(Integer groupLimit) {
        this.groupLimit = groupLimit;
    }
}
