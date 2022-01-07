package com.kpi.iasa.repository

import com.kpi.iasa.domain.UserType
import org.springframework.data.repository.CrudRepository

interface UserTypeRepository : CrudRepository<UserType, Long> {
}
