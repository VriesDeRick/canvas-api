package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.Group;
import edu.ksu.canvas.model.GroupMembership;

import java.io.IOException;
import java.util.List;

public interface GroupReader extends CanvasReader<Group, GroupReader> {

    public List<Group> listCourseGroups(Integer courseId) throws IOException;

    public List<Group> listUserGroups() throws IOException;
}
