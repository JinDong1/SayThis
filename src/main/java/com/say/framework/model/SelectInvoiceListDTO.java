package com.say.framework.model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class SelectInvoiceListDTO {
    private String assetCode;
    private String invoiceNo;
    private BigDecimal amountWithTax;
    private BigDecimal  amountTransferred;
}


