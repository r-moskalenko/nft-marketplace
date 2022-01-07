package com.kpi.iasa.repository

import com.kpi.iasa.domain.NFT
import org.springframework.data.repository.CrudRepository

interface NFTRepository : CrudRepository<NFT, Long> {
}
