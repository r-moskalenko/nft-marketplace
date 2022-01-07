package com.kpi.iasa.repository

import com.kpi.iasa.domain.Ticket
import org.springframework.data.repository.CrudRepository

interface TicketRepository : CrudRepository<Ticket, Long> {
}
