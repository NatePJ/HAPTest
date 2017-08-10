package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by NoName on 2017/8/8.
 */
@ExtensionAttribute(disable = true)
@Table(name = "hap_om_order_headers")
public class OrderHeader extends BaseDTO{
    public static final String FIELD_HEADER_ID = "headerId";
    public static final String FIELD_ORDER_NUMBER = "orderNumber";
    public static final String FIELD_COMPANY_ID = "companyId";
    public static final String FIELD_ORDER_DATE = "orderDate";
    public static final String FIELD_ORDER_STATUS = "orderStatus";
    public static final String FIELD_CUSTOMER_ID = "customerId";


    public static final String ORDER_STATUS_NEW = "NEW"; //新建
    public static final String ORDER_STATUS_SUBMITED = "SUBMITED"; //已提交
    public static final String ORDER_STATUS_APPROVED = "APPROVED"; //已审批
    public static final String ORDER_STATUS_REJECTED = "REJECTED"; //已拒绝

    @Id
    @GeneratedValue
    private Long headerId; // 订单头ID


    private String orderNumber; // 订单编号

    private Long companyId; // 公司ID

    private Date orderDate; // 订单日期

    private String orderStatus; // 订单状态

    private Long customerId; // 客户ID

    @Transient
    private String companyName; //公司名称

    @Transient
    private String companyNumber; //公司代码

    @Transient
    private String customerName; //客户名称

    @Transient
    private String customerNumber; //客户编码

    @Transient
    private Long inventoryItemId; //物料ID

    @Transient
    private Double orderTotalAmount; //订单总金额

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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Double getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(Double orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }
}
