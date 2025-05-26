import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.UUID

data class VaccinesRecord(
    val id: UUID = UUID.randomUUID(),
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
    val babyId: UUID, // Chave estrangeira para a tabela 'babies'
    val time: LocalDateTime? = null,
    val type: String? = null,
    val notes: String? = null
)