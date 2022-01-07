package com.kpi.iasa.domain

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.Table

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
