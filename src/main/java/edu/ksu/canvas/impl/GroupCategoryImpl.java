package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.GroupCategoryReader;
import edu.ksu.canvas.interfaces.GroupCategoryWriter;
import edu.ksu.canvas.model.GroupCategory;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class GroupCategoryImpl extends BaseImpl<GroupCategory, GroupCategoryReader, GroupCategoryWriter> implements GroupCategoryReader, GroupCategoryWriter{
    private static final Logger LOG = Logger.getLogger(GroupCategoryImpl.class);

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
    public GroupCategoryImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient, int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout, paginationPageSize, serializeNulls);
    }

    @Override
    public List<GroupCategory> listCourseGroupCategories(Integer courseId) throws IOException {
        LOG.info("Listing group categories for course");
        String url = buildCanvasUrl(String.format("courses/%s/group_categories", courseId), new HashMap<>());
        return getListFromCanvas(url);
    }

    @Override
    public Optional<GroupCategory> createGroupCategory(GroupCategory category, Integer courseId) throws IOException {
        String url = buildCanvasUrl("courses/" + courseId + "/group_categories", Collections.emptyMap());
        Response response = canvasMessenger.sendToCanvas(oauthToken, url, category.toPostMap(serializeNulls));
        return responseParser.parseToObject(GroupCategory.class, response);
    }


    @Override
    protected Type listType() {
        return new TypeToken<List<GroupCategory>>(){}.getType();
    }

    @Override
    protected Class<GroupCategory> objectType() {
        return GroupCategory.class;
    }
}
