package com.kpi.iasa.repository

import com.kpi.iasa.domain.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long> {
}
