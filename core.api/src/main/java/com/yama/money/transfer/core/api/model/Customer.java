
package com.yama.money.transfer.core.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerId",
    "firstName",
    "middleName",
    "lastName",
    "emailAddress",
    "driversLicenseNumber",
    "driversLicenseState",
    "driversLicenseIssueDate",
    "driversLicenseExpireDate"
})
public class Customer {

    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("driversLicenseNumber")
    private String driversLicenseNumber;
    @JsonProperty("driversLicenseState")
    private String driversLicenseState;
    @JsonProperty("driversLicenseIssueDate")
    private String driversLicenseIssueDate;
    @JsonProperty("driversLicenseExpireDate")
    private String driversLicenseExpireDate;

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Customer withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Customer withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Customer withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @JsonProperty("driversLicenseNumber")
    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    @JsonProperty("driversLicenseNumber")
    public void setDriversLicenseNumber(String driversLicenseNumber) {
        this.driversLicenseNumber = driversLicenseNumber;
    }

    public Customer withDriversLicenseNumber(String driversLicenseNumber) {
        this.driversLicenseNumber = driversLicenseNumber;
        return this;
    }

    @JsonProperty("driversLicenseState")
    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    @JsonProperty("driversLicenseState")
    public void setDriversLicenseState(String driversLicenseState) {
        this.driversLicenseState = driversLicenseState;
    }

    public Customer withDriversLicenseState(String driversLicenseState) {
        this.driversLicenseState = driversLicenseState;
        return this;
    }

    @JsonProperty("driversLicenseIssueDate")
    public String getDriversLicenseIssueDate() {
        return driversLicenseIssueDate;
    }

    @JsonProperty("driversLicenseIssueDate")
    public void setDriversLicenseIssueDate(String driversLicenseIssueDate) {
        this.driversLicenseIssueDate = driversLicenseIssueDate;
    }

    public Customer withDriversLicenseIssueDate(String driversLicenseIssueDate) {
        this.driversLicenseIssueDate = driversLicenseIssueDate;
        return this;
    }

    @JsonProperty("driversLicenseExpireDate")
    public String getDriversLicenseExpireDate() {
        return driversLicenseExpireDate;
    }

    @JsonProperty("driversLicenseExpireDate")
    public void setDriversLicenseExpireDate(String driversLicenseExpireDate) {
        this.driversLicenseExpireDate = driversLicenseExpireDate;
    }

    public Customer withDriversLicenseExpireDate(String driversLicenseExpireDate) {
        this.driversLicenseExpireDate = driversLicenseExpireDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Customer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("driversLicenseNumber");
        sb.append('=');
        sb.append(((this.driversLicenseNumber == null)?"<null>":this.driversLicenseNumber));
        sb.append(',');
        sb.append("driversLicenseState");
        sb.append('=');
        sb.append(((this.driversLicenseState == null)?"<null>":this.driversLicenseState));
        sb.append(',');
        sb.append("driversLicenseIssueDate");
        sb.append('=');
        sb.append(((this.driversLicenseIssueDate == null)?"<null>":this.driversLicenseIssueDate));
        sb.append(',');
        sb.append("driversLicenseExpireDate");
        sb.append('=');
        sb.append(((this.driversLicenseExpireDate == null)?"<null>":this.driversLicenseExpireDate));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
