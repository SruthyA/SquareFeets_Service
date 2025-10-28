package com.squarefeets.demo

import com.squarefeets.demo.UserEntity
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CassandraRepository<UserEntity, String>