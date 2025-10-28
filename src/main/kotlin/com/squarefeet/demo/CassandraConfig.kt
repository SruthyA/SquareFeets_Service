package com.squarefeet.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import com.datastax.oss.driver.api.core.CqlSession


@Configuration
class CassandraConfig {
    @Bean
    fun cqlSession(): CqlSession {
        return CqlSession.builder()
                .withKeyspace("squarefeet")
                .withLocalDatacenter("datacenter1")
                .addContactPoint(java.net.InetSocketAddress("127.0.0.1", 9042))
                .build()
    }
}
