package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;
import net.shibboleth.utilities.java.support.annotation.constraint.NotEmpty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by NoName on 2017/8/10.
 */
@ExtensionAttribute(disable=true)
@Table(name = "hap_ar_customers")
public class ArCustomers {
    @Id
    @GeneratedValue
    private Long customerId; //客户ID

    @NotEmpty
    @Length(max = 60)
    private String customerNumber; //客户编号

    @NotEmpty
    @Length(max = 240)
    private String customerName; //客户名称

    @NotNull
    private Long companyId; //公司ID

    @NotEmpty
    @Length(max = 1)
    private String enabledFlag; //启用标识

    private Date creationDate;

    private Long createdBy;

    private Long lastUpdatedBy;

    private Date lastUpdateDate;

    private Long lastUpdateLogin;


    public void setCustomerId(Long customerId){
        this.customerId = customerId;
    }

    public Long getCustomerId(){
        return customerId;
    }

    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber(){
        return customerNumber;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    public Long getCompanyId(){
        return companyId;
    }

    public void setEnabledFlag(String enabledFlag){
        this.enabledFlag = enabledFlag;
    }

    public String getEnabledFlag(){
        return enabledFlag;
    }

    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public void setCreatedBy(Long createdBy){
        this.createdBy = createdBy;
    }

    public Long getCreatedBy(){
        return createdBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy){
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getLastUpdatedBy(){
        return lastUpdatedBy;
    }

    public void setLastUpdateDate(Date lastUpdateDate){
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getLastUpdateDate(){
        return lastUpdateDate;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin){
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public Long getLastUpdateLogin(){
        return lastUpdateLogin;
    }

}