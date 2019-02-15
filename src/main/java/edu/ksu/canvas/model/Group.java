package edu.ksu.canvas.model;

import com.google.gson.annotations.SerializedName;
import edu.ksu.canvas.annotation.CanvasField;
import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;

public class Group extends BaseCanvasModel implements Serializable {

    @SerializedName("id")
    private Integer groupId;
    private String name;
    private String description;
    private boolean isPublic;
    private boolean followedByUser;
    private String joinLevel;
    private Integer membersCount;
    private String avatarUrl;
    private String contextType;
    private Integer courseId;
    private String role;
    private Integer groupCategoryId;
    private String sisGroupId;
    private Integer sisImportId;
    private Integer storageQuotaMb;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @CanvasField(postKey = "name", array = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @CanvasField(postKey = "is_public", array = false)
    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isFollowedByUser() {
        return followedByUser;
    }

    public void setFollowedByUser(boolean followedByUser) {
        this.followedByUser = followedByUser;
    }

    @CanvasField(postKey = "join_level", array = false)
    public String getJoinLevel() {
        return joinLevel;
    }

    public void setJoinLevel(String joinLevel) {
        this.joinLevel = joinLevel;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    @CanvasField(postKey = "sis_group_id", array = false)
    public String getSisGroupId() {
        return sisGroupId;
    }

    public void setSisGroupId(String sisGroupId) {
        this.sisGroupId = sisGroupId;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    @CanvasField(postKey = "storage_quota_mb", array = false)
    public Integer getStorageQuotaMb() {
        return storageQuotaMb;
    }

    public void setStorageQuotaMb(Integer storageQuotaMb) {
        this.storageQuotaMb = storageQuotaMb;
    }

    @CanvasField(postKey = "description", array = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
