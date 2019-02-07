package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.GroupMembershipReader;
import edu.ksu.canvas.interfaces.GroupMembershipWriter;
import edu.ksu.canvas.model.GroupMembership;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

public class GroupMembershipImpl extends BaseImpl<GroupMembership, GroupMembershipReader, GroupMembershipWriter> implements GroupMembershipReader, GroupMembershipWriter {
    private static final Logger LOG = Logger.getLogger(GroupMembershipImpl.class);

    /**
     * Construct a new CanvasApi class with an OAuth token
     *
     * @param canvasBaseUrl      The base URL of your canvas instance
     * @param apiVersion         The version of the Canvas API (currently 1)
     * @param oauthToken         OAuth token to use when executing API calls
     * @param restClient         a RestClient implementation to use when talking to Canvas
     * @param connectTimeout     Timeout in seconds to use when connecting
     * @param readTimeout        Timeout in seconds to use when waiting for data to come back from an open connection
     * @param paginationPageSize How many objects to request per page on paginated requests
     * @param serializeNulls     Whether or not to include null fields in the serialized JSON. Defaults to false if null
     */
    public GroupMembershipImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient, int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout, paginationPageSize, serializeNulls);
    }

    @Override
    public List<GroupMembership> listGroupMemberships(Integer groupId) throws IOException {
        LOG.info("Listing memberships for group");
        String url = buildCanvasUrl(String.format("/groups/%s/memberships", groupId), new HashMap<>());
        return getListFromCanvas(url);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<GroupMembership>>(){}.getType();
    }

    @Override
    protected Class<GroupMembership> objectType() {
        return GroupMembership.class;
    }
}
