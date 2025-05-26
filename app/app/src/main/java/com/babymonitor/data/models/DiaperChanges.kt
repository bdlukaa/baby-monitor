import java.time.OffsetDateTime
import java.util.UUID

data class DiaperChange(
    val id: UUID = UUID.randomUUID(),
    val babyId: UUID, // Chave estrangeira para a tabela 'babies'
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
    val time: String, // Mapeado de 'text not null'
    val type: String, // Mapeado de 'text not null'
    val notes: String // Mapeado de 'text not null'
)