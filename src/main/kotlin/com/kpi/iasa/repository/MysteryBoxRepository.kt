package com.kpi.iasa.repository

import com.kpi.iasa.domain.MysteryBox
import org.springframework.data.repository.CrudRepository

interface MysteryBoxRepository : CrudRepository<MysteryBox, Long> {
}
