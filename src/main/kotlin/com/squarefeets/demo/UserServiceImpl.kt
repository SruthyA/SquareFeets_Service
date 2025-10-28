package com.squarefeets.demo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl @Autowired constructor(private val userRepository: UserRepository){
    fun saveSampleUser() {

        val sampleUser = createSampleUser()
        println("Saving entity class: ${sampleUser::class.qualifiedName}")
        userRepository.save(sampleUser)
    }
}

fun createSampleUser(): UserEntity {
    val contactInfo = ContactInfo(
            email = "payal@example.com",
            phone = "7383i4384",
            alternatePhone = "23345465",
            address = Address(
                    house_id = "Loyolla home",
                    house_address = "sdc Main St",
                    street = "Third Street",
                    city = "whitefield",
                    state = "IL",
                    zip_code = "62701",
                    country = "USA"
            )
    )
    val sampleUser = UserEntity(
            id = "2",
            name = "Payal ss de",
            description = "Test user2 description",
            contactInfo = contactInfo ,
            isVerified = true,
            createdAt = System.currentTimeMillis(),
            updatedAt = System.currentTimeMillis(),
            userType = UserType.BUYER
    )
    return sampleUser;
}