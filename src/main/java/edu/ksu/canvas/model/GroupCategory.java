package edu.ksu.canvas.model;

import com.google.gson.annotations.SerializedName;
import edu.ksu.canvas.annotation.CanvasField;

public class GroupCategory extends BaseCanvasModel {
    public static final String SELF_SIGNUP_ENABLED = "enabled";
    public static final String SELF_SIGNUP_RESTRICTED = "restricted";

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
    private Integer ceateGroupCount;

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    @CanvasField(postKey = "name", array = false)
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

    @CanvasField(postKey = "self_signup", array = false)
    public String getSelfSignup() {
        return selfSignup;
    }

    public void setSelfSignup(String selfSignup) {
        this.selfSignup = selfSignup;
    }

    @CanvasField(postKey = "auto_leader", array = false)
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

    @CanvasField(postKey = "group_limit", array = false)
    public Integer getGroupLimit() {
        return groupLimit;
    }

    public void setGroupLimit(Integer groupLimit) {
        this.groupLimit = groupLimit;
    }

    @CanvasField(postKey = "create_group_count", array = false)
    public Integer getCeateGroupCount() {
        return ceateGroupCount;
    }

    public void setCeateGroupCount(Integer ceateGroupCount) {
        this.ceateGroupCount = ceateGroupCount;
    }
}
