package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.Group;

import java.io.IOException;
import java.util.Optional;

public interface GroupWriter extends CanvasWriter<Group, GroupWriter> {

    Optional<Group> createGroupInCategory(Group group, Integer categoryId) throws IOException;
}
