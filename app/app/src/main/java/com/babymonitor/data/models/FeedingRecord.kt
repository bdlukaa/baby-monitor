import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.UUID

data class FeedingRecord(
    val id: UUID = UUID.randomUUID(),
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
    val babyId: UUID, // Assumindo que este ID virá de um contexto/seleção
    val time: LocalDateTime = LocalDateTime.now(),
    val food: String, // Mapeia diretamente 'food text not null'
    val notes: String // Mapeia diretamente 'notes text not null'
)