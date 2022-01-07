package com.kpi.iasa.repository

import com.kpi.iasa.domain.Crypto
import org.springframework.data.repository.CrudRepository

interface CryptoRepository : CrudRepository<Crypto, Long> {
}
