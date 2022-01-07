package com.kpi.iasa.domain

import com.kpi.iasa.domain.enums.TicketStatus
import com.kpi.iasa.domain.enums.TicketType
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
