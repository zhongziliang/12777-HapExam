package com.hand.hap.hapExam.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.springframework.ldap.odm.annotations.Transient;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Table(
        name = "hap_om_order_headers"
)
public class Hap_om_order_headers{
    public Hap_om_order_headers() {
    }

    @Id
    @GeneratedValue
    private Long headerId;
    @Column
    private String orderNumber;
    @Column
    private Date orderDate;
    @Column
    private Long companyId;
    @Column
    private String orderStatus;
    @Column
    private Long customerId;
    @Column
    private BigDecimal objectVersionNumber;
    @Column
    private Long requestId;
    @Column
    private Long programId;
    @Column
    private Date creationDate;
    @Column
    private BigDecimal createdBy;
    @Column
    private BigDecimal lastUpdatedBy;
    @Column
    private Date lastUpdateDate;
    @Column
    private BigDecimal lastUpdateLogin;
    @Column
    private String attributeCategory;
    @Transient
    private Hap_org_companys companyNames;
    @Transient
    private Hap_ar_customers customerNames;
    @Transient
    private List<Hap_om_order_lines> lines;
    @Transient
    private Hap_inv_inventory_items item;

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(BigDecimal objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(BigDecimal lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public Hap_org_companys getCompanyNames() {
        return companyNames;
    }

    public void setCompanyNames(Hap_org_companys companyNames) {
        this.companyNames = companyNames;
    }

    public Hap_ar_customers getCustomerNames() {
        return customerNames;
    }

    public void setCustomerNames(Hap_ar_customers customerNames) {
        this.customerNames = customerNames;
    }

    public List<Hap_om_order_lines> getLines() {
        return lines;
    }

    public void setLines(List<Hap_om_order_lines> lines) {
        this.lines = lines;
    }

    public Hap_inv_inventory_items getItem() {
        return item;
    }

    public void setItem(Hap_inv_inventory_items item) {
        this.item = item;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    @Transient
    private Integer page = Integer.valueOf(1);
    @Transient
    private Integer pagesize = Integer.valueOf(10);

    @Column
    private String attribute1;
    @Column
    private String attribute2;
    @Column
    private String attribute3;
    @Column
    private String attribute4;
    @Column
    private String attribute5;
    @Column
    private String attribute6;
    @Column
    private String attribute7;
    @Column
    private String attribute8;
    @Column
    private String attribute9;
    @Column
    private String attribute10;
    @Column
    private String attribute11;
    @Column
    private String attribute12;
    @Column
    private String attribute13;
    @Column
    private String attribute14;
    @Column
    private String attribute15;


}