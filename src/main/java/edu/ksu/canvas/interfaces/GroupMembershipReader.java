package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.GroupMembership;

import java.io.IOException;
import java.util.List;

public interface GroupMembershipReader extends CanvasReader<GroupMembership, GroupMembershipReader> {
    public List<GroupMembership> listGroupMemberships(Integer groupId) throws IOException;

}
