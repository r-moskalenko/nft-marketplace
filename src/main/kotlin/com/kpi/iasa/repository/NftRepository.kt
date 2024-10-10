package com.kpi.iasa.repository

import com.kpi.iasa.domain.Nft
import org.springframework.data.repository.CrudRepository

interface NftRepository : CrudRepository<Nft, Long> {
}
