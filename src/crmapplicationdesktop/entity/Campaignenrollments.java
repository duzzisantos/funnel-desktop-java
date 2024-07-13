/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crmapplicationdesktop.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "CAMPAIGNENROLLMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campaignenrollments.findAll", query = "SELECT c FROM Campaignenrollments c"),
    @NamedQuery(name = "Campaignenrollments.findByEnrollmentId", query = "SELECT c FROM Campaignenrollments c WHERE c.enrollmentId = :enrollmentId"),
    @NamedQuery(name = "Campaignenrollments.findByCampaignName", query = "SELECT c FROM Campaignenrollments c WHERE c.campaignName = :campaignName"),
    @NamedQuery(name = "Campaignenrollments.findByCampaignId", query = "SELECT c FROM Campaignenrollments c WHERE c.campaignId = :campaignId"),
    @NamedQuery(name = "Campaignenrollments.findByAccountManagerId", query = "SELECT c FROM Campaignenrollments c WHERE c.accountManagerId = :accountManagerId"),
    @NamedQuery(name = "Campaignenrollments.findByCustomerId", query = "SELECT c FROM Campaignenrollments c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Campaignenrollments.findByCampaignManager", query = "SELECT c FROM Campaignenrollments c WHERE c.campaignManager = :campaignManager"),
    @NamedQuery(name = "Campaignenrollments.findByCampaignContent", query = "SELECT c FROM Campaignenrollments c WHERE c.campaignContent = :campaignContent"),
    @NamedQuery(name = "Campaignenrollments.findByHasResponded", query = "SELECT c FROM Campaignenrollments c WHERE c.hasResponded = :hasResponded"),
    @NamedQuery(name = "Campaignenrollments.findByProductId", query = "SELECT c FROM Campaignenrollments c WHERE c.productId = :productId")})
public class Campaignenrollments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ENROLLMENT_ID")
    private Integer enrollmentId;
    @Column(name = "CAMPAIGN_NAME")
    private String campaignName;
    @Column(name = "CAMPAIGN_ID")
    private Integer campaignId;
    @Column(name = "ACCOUNT_MANAGER_ID")
    private Integer accountManagerId;
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    @Column(name = "CAMPAIGN_MANAGER")
    private String campaignManager;
    @Column(name = "CAMPAIGN_CONTENT")
    private String campaignContent;
    @Column(name = "HAS_RESPONDED")
    private Boolean hasResponded;
    @Column(name = "PRODUCT_ID")
    private Integer productId;

    public Campaignenrollments() {
    }

    public Campaignenrollments(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public Integer getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(Integer accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCampaignManager() {
        return campaignManager;
    }

    public void setCampaignManager(String campaignManager) {
        this.campaignManager = campaignManager;
    }

    public String getCampaignContent() {
        return campaignContent;
    }

    public void setCampaignContent(String campaignContent) {
        this.campaignContent = campaignContent;
    }

    public Boolean getHasResponded() {
        return hasResponded;
    }

    public void setHasResponded(Boolean hasResponded) {
        this.hasResponded = hasResponded;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enrollmentId != null ? enrollmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campaignenrollments)) {
            return false;
        }
        Campaignenrollments other = (Campaignenrollments) object;
        if ((this.enrollmentId == null && other.enrollmentId != null) || (this.enrollmentId != null && !this.enrollmentId.equals(other.enrollmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "crmapplicationdesktop.entity.Campaignenrollments[ enrollmentId=" + enrollmentId + " ]";
    }
    
}
