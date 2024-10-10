package com.kpi.iasa.domain

import com.kpi.iasa.domain.enums.TicketStatus
import com.kpi.iasa.domain.enums.TicketType
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
@Table
open class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    open var id : Long? = null

    @Enumerated(EnumType.STRING)
    open var status : TicketStatus? = null

    @Enumerated(EnumType.STRING)
    open var type : TicketType? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    open var user : User? = null
}
