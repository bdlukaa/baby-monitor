import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.UUID

data class SleepRecord(
    val id: UUID = UUID.randomUUID(),
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
    val babyId: UUID,
    val startTime: LocalDateTime = LocalDateTime.now(),
    val endTime: LocalDateTime? = null,
    val note: String? = null
)