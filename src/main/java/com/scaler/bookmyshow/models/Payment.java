package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.PaymentStatus;
import com.scaler.bookmyshow.models.enums.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PostRemove;
import lombok.Data;

@Data
@Entity
public class Payment extends BaseModel {
    private int refNo;
    private double amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;

}
