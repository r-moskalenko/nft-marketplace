package com.kpi.iasa.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import jakarta.persistence.Table


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
