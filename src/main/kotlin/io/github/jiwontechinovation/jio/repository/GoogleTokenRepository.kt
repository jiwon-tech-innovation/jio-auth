package io.github.jiwontechinovation.jio.repository

import io.github.jiwontechinovation.jio.domain.GoogleToken
import io.github.jiwontechinovation.jio.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional
import java.util.UUID

interface GoogleTokenRepository : JpaRepository<GoogleToken, UUID> {
    fun findByUser(user: User): Optional<GoogleToken>
    fun findByUserId(userId: UUID): Optional<GoogleToken>
    fun findByGoogleEmail(googleEmail: String): Optional<GoogleToken>
}
