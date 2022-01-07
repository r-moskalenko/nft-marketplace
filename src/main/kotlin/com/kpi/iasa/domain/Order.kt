package com.kpi.iasa.domain

import com.kpi.iasa.domain.enums.OrderStatus
import com.kpi.iasa.domain.enums.OrderType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

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
    open var toItem : NFT? = null

    @Enumerated(EnumType.STRING)
    open var orderType : OrderType? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    open var fromUser: User? = null

    @Column(name = "price")
    open var price : Double? = null
}
