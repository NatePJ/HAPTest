package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

import javax.persistence.*;

/**
 * Created by NoName on 2017/8/9.
 */
@ExtensionAttribute(disable = true)
@Table(name = "hap_om_order_lines")
public class OrderLine extends BaseDTO {
    public static final String FIELD_LINE_ID = "lineId";
    public static final String FIELD_HEADER_ID = "headerId";
    public static final String FIELD_LINE_NUMBER = "lineNumber";
    public static final String FIELD_INVENTORY_ITEM_ID = "inventoryItemId";
    public static final String FIELD_ORDERD_QUANTITY = "orderdQuantity";
    public static final String FIELD_ORDER_QUANTITY_UOM = "orderQuantityUom";
    public static final String FIELD_UNIT_SELLING_PRICE = "unitSellingPrice";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_COMPANY_ID = "companyId";
    public static final String FIELD_ADDITION1 = "addition1";
    public static final String FIELD_ADDITION2 = "addition2";
    public static final String FIELD_ADDITION3 = "addition3";
    public static final String FIELD_ADDITION4 = "addition4";
    public static final String FIELD_ADDITION5 = "addition5";

    @Id
    @GeneratedValue
    private Long lineId; // 订单行ID

//    @NotNull
//    @Where(comparison = Comparison.EQUAL)
    private Long headerId; // 订单头ID

//    @NotNull
//    @OrderBy("ASC")
    private Long lineNumber; // 编码

//    @NotNull
//    @Column
//    @JoinTable(name = "inventoryJoin", target = InventoryItem.class, type = JoinType.LEFT, on = {@JoinOn(joinField = InventoryItem.FIELD_INVENTORY_ITEM_ID)})
    private Long inventoryItemId; // 物料ID

//    @NotNull
    private Long orderdQuantity; // 数量

//    @NotEmpty
//    @Length(max = 30)
    private String orderQuantityUom; // 产品单位

//    @NotNull
    private Double unitSellingPrice; // 销售单价

//    @Length(max = 240)
    private String description; // 备注

//    @NotNull
    private Long companyId; // 公司ID

//    @Length(max = 150)
    private String addition1; // 附加信息1

//    @Length(max = 150)
    private String addition2; // 附加信息2

//    @Length(max = 150)
    private String addition3; // 附加信息3

//    @Length(max = 150)
    private String addition4; // 附加信息4

//    @Length(max = 150)
    private String addition5; // 附加信息5

    @Transient
//    @JoinColumn(joinName = "inventoryJoin", field = InventoryItem.FIELD_ITEM_CODE)
    private String inventoryItemCode; // 物料编码

    @Transient
//    @JoinColumn(joinName = "inventoryJoin", field = InventoryItem.FIELD_ITEM_DESCRIPTION)
    private String inventoryItemDescription; // 物料描述

    @Transient
    private Double totalAmount; //总金额

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Double getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Double unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public String getInventoryItemCode() {
        return inventoryItemCode;
    }

    public void setInventoryItemCode(String inventoryItemCode) {
        this.inventoryItemCode = inventoryItemCode;
    }

    public String getInventoryItemDescription() {
        return inventoryItemDescription;
    }

    public void setInventoryItemDescription(String inventoryItemDescription) {
        this.inventoryItemDescription = inventoryItemDescription;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
