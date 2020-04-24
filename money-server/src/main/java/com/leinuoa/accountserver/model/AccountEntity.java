package com.leinuoa.accountserver.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AccountEntity implements Serializable {
    private static final long serialVersionUID = 5556169988739360294L;

    private long id;
    private long accountNo;
    private BigDecimal money;
}
