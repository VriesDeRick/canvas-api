package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.GroupReader;
import edu.ksu.canvas.interfaces.GroupWriter;
import edu.ksu.canvas.model.Group;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;


public class GroupImpl extends BaseImpl<Group, GroupReader, GroupWriter> implements GroupReader, GroupWriter {
    private static final Logger LOG = Logger.getLogger(GroupImpl.class);

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
    public GroupImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient, int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout, paginationPageSize, serializeNulls);
    }

    @Override
    public List<Group> listCourseGroups(Integer courseId) throws IOException {
        LOG.info("Listing groups for course");
        String url = buildCanvasUrl(String.format("/courses/%s/groups", courseId), new HashMap<>());
        return getListFromCanvas(url);
    }

    @Override
    public List<Group> listUserGroups() throws IOException {
        LOG.info("Listing groups for course");
        String url = buildCanvasUrl("/users/self/groups", new HashMap<>());
        return getListFromCanvas(url);

    }

    @Override
    protected Type listType() {
        return new TypeToken<List<Group>> (){}.getType();
    }

    @Override
    protected Class<Group> objectType() {
        return Group.class;
    }
}
