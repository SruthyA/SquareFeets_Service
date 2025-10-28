package com.squarefeet.demo

import com.squarefeet.demo.UserEntity
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CassandraRepository<UserEntity, String>