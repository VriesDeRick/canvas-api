package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.GroupCategory;

import java.io.IOException;
import java.util.Optional;

public interface GroupCategoryWriter extends CanvasWriter<GroupCategory, GroupCategoryWriter> {

    public Optional<GroupCategory> createGroupCategory(GroupCategory category, Integer courseId) throws IOException;

}
