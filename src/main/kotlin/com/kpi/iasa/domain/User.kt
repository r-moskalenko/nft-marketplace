package com.kpi.iasa.domain

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.Table

@Entity
@Table(name="users")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var clientId : Long? = null

    @Column(name = "user_name")
    open var userName : String? = null

    @ManyToMany(cascade = [CascadeType.PERSIST])
    @JoinTable(
        name = "user_user_type",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "user_type_id")]
    )
    open var userTypes : MutableSet<UserType>? = mutableSetOf()
}
