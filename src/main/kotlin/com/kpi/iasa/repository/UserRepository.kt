package com.kpi.iasa.repository

import com.kpi.iasa.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
}
