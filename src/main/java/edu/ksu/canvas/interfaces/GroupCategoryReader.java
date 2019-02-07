package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.GroupCategory;

import java.io.IOException;
import java.util.List;

public interface GroupCategoryReader extends CanvasReader<GroupCategory, GroupCategoryReader> {

    public List<GroupCategory> listCourseGroupCategories(Integer courseId) throws IOException;

}
