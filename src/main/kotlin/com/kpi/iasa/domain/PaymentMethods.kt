package com.kpi.iasa.domain

import com.kpi.iasa.domain.enums.PaymentType
import javax.persistence.Column
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class PaymentMethods {
    @Enumerated(EnumType.STRING)
    open var paymentType : PaymentType? = null

    @Column(name = "blockchain")
    open var blockchain : String? = null
}
