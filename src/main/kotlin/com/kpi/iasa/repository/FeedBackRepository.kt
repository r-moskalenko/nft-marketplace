package com.kpi.iasa.repository

import com.kpi.iasa.domain.FeedBack
import org.springframework.data.repository.CrudRepository

interface FeedBackRepository : CrudRepository<FeedBack, Long> {
}
