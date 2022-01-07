package com.kpi.iasa.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "mystery_box")
open class MysteryBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    open var id : Long? = null

    @Column(name = "topic")
    open var topic : String? = null

    @Column(name = "price")
    open var price : Double? = null

    @Column(name = "rarity")
    open var rarity : String? = null
}
