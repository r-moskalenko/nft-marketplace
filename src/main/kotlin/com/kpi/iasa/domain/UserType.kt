package com.kpi.iasa.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "user_types")
open class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id : Long? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null

    @ManyToMany(mappedBy = "userTypes")
    open var users : MutableList<User>? = mutableListOf()
}
