package com.kpi.iasa.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

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
