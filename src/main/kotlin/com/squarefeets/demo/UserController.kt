package com.squarefeets.demo

import com.squarefeets.user.UserOuterClass
import com.squarefeets.user.UserServiceGrpc
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class UserController : UserServiceGrpc.UserServiceImplBase() {
    override fun registerUser(
        request: UserOuterClass.UserRegistrationRequest,
        responseObserver: StreamObserver<UserOuterClass.UserRegistrationResponse>
    ) {
        val response = UserOuterClass.UserRegistrationResponse.newBuilder()
            .setMessage("User registered successfully")
            .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }

}
