
package com.gamonsoft.reactapp.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cache_last_updated",
    "package_id",
    "datastore_active",
    "id",
    "size",
    "state",
    "api_access_number",
    "api_access_number_absolute",
    "hash",
    "description",
    "format",
    "downloads",
    "mimetype_inner",
    "url_type",
    "file_volum",
    "mimetype",
    "cache_url",
    "name",
    "created",
    "url",
    "downloads_absolute",
    "map_visualization_res",
    "qa",
    "last_modified",
    "position",
    "revision_id",
    "resource_type",
    "column_types"
})
public class Resource {

    @JsonProperty("cache_last_updated")
    private Object cacheLastUpdated;
    @JsonProperty("package_id")
    private String packageId;
    @JsonProperty("datastore_active")
    private Boolean datastoreActive;
    @JsonProperty("id")
    private String id;
    @JsonProperty("size")
    private Object size;
    @JsonProperty("state")
    private String state;
    @JsonProperty("api_access_number")
    private String apiAccessNumber;
    @JsonProperty("api_access_number_absolute")
    private String apiAccessNumberAbsolute;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("description")
    private String description;
    @JsonProperty("format")
    private String format;
    @JsonProperty("downloads")
    private String downloads;
    @JsonProperty("mimetype_inner")
    private Object mimetypeInner;
    @JsonProperty("url_type")
    private String urlType;
    @JsonProperty("file_volum")
    private String fileVolum;
    @JsonProperty("mimetype")
    private Object mimetype;
    @JsonProperty("cache_url")
    private Object cacheUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created")
    private String created;
    @JsonProperty("url")
    private String url;
    @JsonProperty("downloads_absolute")
    private String downloadsAbsolute;
    @JsonProperty("map_visualization_res")
    private String mapVisualizationRes;
    @JsonProperty("qa")
    private String qa;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("revision_id")
    private String revisionId;
    @JsonProperty("resource_type")
    private Object resourceType;
    @JsonProperty("column_types")
    private String columnTypes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cache_last_updated")
    public Object getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    @JsonProperty("cache_last_updated")
    public void setCacheLastUpdated(Object cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    @JsonProperty("package_id")
    public String getPackageId() {
        return packageId;
    }

    @JsonProperty("package_id")
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("datastore_active")
    public Boolean getDatastoreActive() {
        return datastoreActive;
    }

    @JsonProperty("datastore_active")
    public void setDatastoreActive(Boolean datastoreActive) {
        this.datastoreActive = datastoreActive;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("size")
    public Object getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Object size) {
        this.size = size;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("api_access_number")
    public String getApiAccessNumber() {
        return apiAccessNumber;
    }

    @JsonProperty("api_access_number")
    public void setApiAccessNumber(String apiAccessNumber) {
        this.apiAccessNumber = apiAccessNumber;
    }

    @JsonProperty("api_access_number_absolute")
    public String getApiAccessNumberAbsolute() {
        return apiAccessNumberAbsolute;
    }

    @JsonProperty("api_access_number_absolute")
    public void setApiAccessNumberAbsolute(String apiAccessNumberAbsolute) {
        this.apiAccessNumberAbsolute = apiAccessNumberAbsolute;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("downloads")
    public String getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("mimetype_inner")
    public Object getMimetypeInner() {
        return mimetypeInner;
    }

    @JsonProperty("mimetype_inner")
    public void setMimetypeInner(Object mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    @JsonProperty("url_type")
    public String getUrlType() {
        return urlType;
    }

    @JsonProperty("url_type")
    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    @JsonProperty("file_volum")
    public String getFileVolum() {
        return fileVolum;
    }

    @JsonProperty("file_volum")
    public void setFileVolum(String fileVolum) {
        this.fileVolum = fileVolum;
    }

    @JsonProperty("mimetype")
    public Object getMimetype() {
        return mimetype;
    }

    @JsonProperty("mimetype")
    public void setMimetype(Object mimetype) {
        this.mimetype = mimetype;
    }

    @JsonProperty("cache_url")
    public Object getCacheUrl() {
        return cacheUrl;
    }

    @JsonProperty("cache_url")
    public void setCacheUrl(Object cacheUrl) {
        this.cacheUrl = cacheUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("downloads_absolute")
    public String getDownloadsAbsolute() {
        return downloadsAbsolute;
    }

    @JsonProperty("downloads_absolute")
    public void setDownloadsAbsolute(String downloadsAbsolute) {
        this.downloadsAbsolute = downloadsAbsolute;
    }

    @JsonProperty("map_visualization_res")
    public String getMapVisualizationRes() {
        return mapVisualizationRes;
    }

    @JsonProperty("map_visualization_res")
    public void setMapVisualizationRes(String mapVisualizationRes) {
        this.mapVisualizationRes = mapVisualizationRes;
    }

    @JsonProperty("qa")
    public String getQa() {
        return qa;
    }

    @JsonProperty("qa")
    public void setQa(String qa) {
        this.qa = qa;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("revision_id")
    public String getRevisionId() {
        return revisionId;
    }

    @JsonProperty("revision_id")
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @JsonProperty("resource_type")
    public Object getResourceType() {
        return resourceType;
    }

    @JsonProperty("resource_type")
    public void setResourceType(Object resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("column_types")
    public String getColumnTypes() {
        return columnTypes;
    }

    @JsonProperty("column_types")
    public void setColumnTypes(String columnTypes) {
        this.columnTypes = columnTypes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
