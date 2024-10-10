package com.kpi.iasa.domain

import com.kpi.iasa.domain.enums.OrderStatus
import com.kpi.iasa.domain.enums.OrderType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "orders")
open class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    open var id : Long? = null

    @Enumerated(EnumType.STRING)
    open var status : OrderStatus? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    open var toItem : Nft? = null

    @Enumerated(EnumType.STRING)
    open var orderType : OrderType? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    open var fromUser: User? = null

    @Column(name = "price")
    open var price : Double? = null
}
