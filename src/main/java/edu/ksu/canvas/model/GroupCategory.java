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
}
