package com.redhat.coolstore.catalog.model;

import java.io.Serializable;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject
public class Project implements Serializable {

    private static final long serialVersionUID = -6994655395272795259L;

    private String projectId;
    private String firstName;
    private String lastName;
    private String email;
    private String projectTitle;
    private String projectDescription;
    private int projectStatus;

    public Project() {

    }

    public Project(JsonObject json) {
        this.projectId = json.getString("projectId");
        this.firstName = json.getString("firstName");
        this.lastName = json.getString("lastName");
        this.email = json.getString("email");
        this.projectTitle = json.getString("projectTitle");
        this.projectDescription = json.getString("projectDescription");
        this.projectStatus = json.getInteger("projectStatus");
    }

    public JsonObject toJson() {

        final JsonObject json = new JsonObject();
        json.put("projectId", this.projectId);
        json.put("firstName", this.firstName);
        json.put("lastName", this.lastName);
        json.put("email", this.email);
        json.put("projectTitle", this.projectTitle);
        json.put("projectDescription", this.projectDescription);
        json.put("projectStatus", this.projectStatus);
        return json;
    }

    /**
     * @return the projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the projectTitle
     */
    public String getProjectTitle() {
        return projectTitle;
    }

    /**
     * @param projectTitle the projectTitle to set
     */
    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    /**
     * @return the projectDescription
     */
    public String getProjectDescription() {
        return projectDescription;
    }

    /**
     * @param projectDescription the projectDescription to set
     */
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * @return the projectStatus
     */
    public int getProjectStatus() {
        return projectStatus;
    }

    /**
     * @param projectStatus the projectStatus to set
     */
    public void setProjectStatus(int projectStatus) {
        this.projectStatus = projectStatus;
    }

}
