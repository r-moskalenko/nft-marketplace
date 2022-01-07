package com.kpi.iasa.repository

import com.kpi.iasa.domain.UserDocuments
import org.springframework.data.repository.CrudRepository

interface UserDocumentsRepository : CrudRepository<UserDocuments, Long> {
}
