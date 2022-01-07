package com.kpi.iasa.repository

import com.kpi.iasa.domain.Payment
import org.springframework.data.repository.CrudRepository

interface PaymentRepository : CrudRepository<Payment, Long> {
}
