package com.squarefeet.demo

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import org.springframework.data.cassandra.core.mapping.UserDefinedType

@Table("user")
data class UserEntity(
        @PrimaryKey val id: String,
        val name: String,
        val description: String,
        @field:Column("contact_info") val contactInfo : ContactInfo,
        @field:Column("is_verified")  val isVerified: Boolean,
        @field:Column("created_at") val createdAt: Long,
        @field:Column("updated_at")val updatedAt: Long,
        @field:Column("user_type")val userType: UserType
)
@UserDefinedType("contactinfo")
data class ContactInfo(
        val email: String,
        val phone: String,
        @field:Column("alternate_phone")val alternatePhone: String,
        val address: Address
)
@UserDefinedType
data class Address(
         val house_id: String,           // Using camelCase with @Column
         val house_address: String,
         val street: String,
         val city: String,
         val state: String,
         val zip_code: String,
         val country: String
)

enum class UserType {
    GUEST, BUYER, TENANT, OWNER
}