package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.GroupMembership;

import java.io.IOException;
import java.util.Optional;

public interface GroupMembershipWriter extends CanvasWriter<GroupMembership, GroupMembershipWriter> {

    Optional<GroupMembership> createMembership(Integer groupId, Integer userId) throws IOException;
}
