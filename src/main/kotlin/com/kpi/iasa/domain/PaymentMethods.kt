package com.kpi.iasa.domain

import com.kpi.iasa.domain.enums.PaymentType
import jakarta.persistence.Column
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
open class PaymentMethods {
    @Enumerated(EnumType.STRING)
    open var paymentType : PaymentType? = null

    @Column(name = "blockchain")
    open var blockchain : String? = null
}
