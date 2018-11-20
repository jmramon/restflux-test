
package com.gamonsoft.restflux.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "notes_translated",
    "geolocation",
    "code",
    "url_tornada",
    "dataset_fields_description",
    "fuente",
    "private",
    "num_tags",
    "api",
    "frequency",
    "update_string",
    "id",
    "title_translated",
    "metadata_modified",
    "author",
    "author_email",
    "isopen",
    "state",
    "version",
    "observations",
    "relationships_as_object",
    "department",
    "creator_user_id",
    "type",
    "resources",
    "num_resources",
    "tags",
    "fecha_publicacion",
    "load_type",
    "groups",
    "license_id",
    "relationships_as_subject",
    "license_title",
    "organization",
    "name",
    "url",
    "notes",
    "owner_org",
    "tag",
    "license_url",
    "historical",
    "title",
    "revision_id",
    "date_deactivation_informed",
    "extras"
})
public class ResultN0 {

    @JsonProperty("notes_translated")
    private NotesTranslated notesTranslated;
    @JsonProperty("geolocation")
    private String geolocation;
    @JsonProperty("code")
    private String code;
    @JsonProperty("url_tornada")
    private UrlTornada urlTornada;
    @JsonProperty("dataset_fields_description")
    private String datasetFieldsDescription;
    @JsonProperty("fuente")
    private String fuente;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("num_tags")
    private Integer numTags;
    @JsonProperty("api")
    private String api;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("update_string")
    private String updateString;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title_translated")
    private TitleTranslated titleTranslated;
    @JsonProperty("metadata_modified")
    private String metadataModified;
    @JsonProperty("author")
    private String author;
    @JsonProperty("author_email")
    private Object authorEmail;
    @JsonProperty("isopen")
    private Boolean isopen;
    @JsonProperty("state")
    private String state;
    @JsonProperty("version")
    private String version;
    @JsonProperty("observations")
    private String observations;
    @JsonProperty("relationships_as_object")
    private List<Object> relationshipsAsObject = null;
    @JsonProperty("department")
    private String department;
    @JsonProperty("creator_user_id")
    private String creatorUserId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("resources")
    private List<Resource> resources = null;
    @JsonProperty("num_resources")
    private Integer numResources;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("fecha_publicacion")
    private String fechaPublicacion;
    @JsonProperty("load_type")
    private String loadType;
    @JsonProperty("groups")
    private List<Object> groups = null;
    @JsonProperty("license_id")
    private String licenseId;
    @JsonProperty("relationships_as_subject")
    private List<Object> relationshipsAsSubject = null;
    @JsonProperty("license_title")
    private String licenseTitle;
    @JsonProperty("organization")
    private Organization organization;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("owner_org")
    private String ownerOrg;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("license_url")
    private String licenseUrl;
    @JsonProperty("historical")
    private String historical;
    @JsonProperty("title")
    private String title;
    @JsonProperty("revision_id")
    private String revisionId;
    @JsonProperty("date_deactivation_informed")
    private String dateDeactivationInformed;
    @JsonProperty("extras")
    private List<Extra> extras = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("notes_translated")
    public NotesTranslated getNotesTranslated() {
        return notesTranslated;
    }

    @JsonProperty("notes_translated")
    public void setNotesTranslated(NotesTranslated notesTranslated) {
        this.notesTranslated = notesTranslated;
    }

    @JsonProperty("geolocation")
    public String getGeolocation() {
        return geolocation;
    }

    @JsonProperty("geolocation")
    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("url_tornada")
    public UrlTornada getUrlTornada() {
        return urlTornada;
    }

    @JsonProperty("url_tornada")
    public void setUrlTornada(UrlTornada urlTornada) {
        this.urlTornada = urlTornada;
    }

    @JsonProperty("dataset_fields_description")
    public String getDatasetFieldsDescription() {
        return datasetFieldsDescription;
    }

    @JsonProperty("dataset_fields_description")
    public void setDatasetFieldsDescription(String datasetFieldsDescription) {
        this.datasetFieldsDescription = datasetFieldsDescription;
    }

    @JsonProperty("fuente")
    public String getFuente() {
        return fuente;
    }

    @JsonProperty("fuente")
    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("num_tags")
    public Integer getNumTags() {
        return numTags;
    }

    @JsonProperty("num_tags")
    public void setNumTags(Integer numTags) {
        this.numTags = numTags;
    }

    @JsonProperty("api")
    public String getApi() {
        return api;
    }

    @JsonProperty("api")
    public void setApi(String api) {
        this.api = api;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("update_string")
    public String getUpdateString() {
        return updateString;
    }

    @JsonProperty("update_string")
    public void setUpdateString(String updateString) {
        this.updateString = updateString;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title_translated")
    public TitleTranslated getTitleTranslated() {
        return titleTranslated;
    }

    @JsonProperty("title_translated")
    public void setTitleTranslated(TitleTranslated titleTranslated) {
        this.titleTranslated = titleTranslated;
    }

    @JsonProperty("metadata_modified")
    public String getMetadataModified() {
        return metadataModified;
    }

    @JsonProperty("metadata_modified")
    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("author_email")
    public Object getAuthorEmail() {
        return authorEmail;
    }

    @JsonProperty("author_email")
    public void setAuthorEmail(Object authorEmail) {
        this.authorEmail = authorEmail;
    }

    @JsonProperty("isopen")
    public Boolean getIsopen() {
        return isopen;
    }

    @JsonProperty("isopen")
    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("observations")
    public String getObservations() {
        return observations;
    }

    @JsonProperty("observations")
    public void setObservations(String observations) {
        this.observations = observations;
    }

    @JsonProperty("relationships_as_object")
    public List<Object> getRelationshipsAsObject() {
        return relationshipsAsObject;
    }

    @JsonProperty("relationships_as_object")
    public void setRelationshipsAsObject(List<Object> relationshipsAsObject) {
        this.relationshipsAsObject = relationshipsAsObject;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    @JsonProperty("creator_user_id")
    public String getCreatorUserId() {
        return creatorUserId;
    }

    @JsonProperty("creator_user_id")
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @JsonProperty("num_resources")
    public Integer getNumResources() {
        return numResources;
    }

    @JsonProperty("num_resources")
    public void setNumResources(Integer numResources) {
        this.numResources = numResources;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("fecha_publicacion")
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @JsonProperty("fecha_publicacion")
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @JsonProperty("load_type")
    public String getLoadType() {
        return loadType;
    }

    @JsonProperty("load_type")
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    @JsonProperty("groups")
    public List<Object> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    @JsonProperty("license_id")
    public String getLicenseId() {
        return licenseId;
    }

    @JsonProperty("license_id")
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @JsonProperty("relationships_as_subject")
    public List<Object> getRelationshipsAsSubject() {
        return relationshipsAsSubject;
    }

    @JsonProperty("relationships_as_subject")
    public void setRelationshipsAsSubject(List<Object> relationshipsAsSubject) {
        this.relationshipsAsSubject = relationshipsAsSubject;
    }

    @JsonProperty("license_title")
    public String getLicenseTitle() {
        return licenseTitle;
    }

    @JsonProperty("license_title")
    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("owner_org")
    public String getOwnerOrg() {
        return ownerOrg;
    }

    @JsonProperty("owner_org")
    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("license_url")
    public String getLicenseUrl() {
        return licenseUrl;
    }

    @JsonProperty("license_url")
    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    @JsonProperty("historical")
    public String getHistorical() {
        return historical;
    }

    @JsonProperty("historical")
    public void setHistorical(String historical) {
        this.historical = historical;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("revision_id")
    public String getRevisionId() {
        return revisionId;
    }

    @JsonProperty("revision_id")
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    @JsonProperty("date_deactivation_informed")
    public String getDateDeactivationInformed() {
        return dateDeactivationInformed;
    }

    @JsonProperty("date_deactivation_informed")
    public void setDateDeactivationInformed(String dateDeactivationInformed) {
        this.dateDeactivationInformed = dateDeactivationInformed;
    }

    @JsonProperty("extras")
    public List<Extra> getExtras() {
        return extras;
    }

    @JsonProperty("extras")
    public void setExtras(List<Extra> extras) {
        this.extras = extras;
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
