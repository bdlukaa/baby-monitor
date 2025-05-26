import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID

data class Baby(
    val id: UUID = UUID.randomUUID(),
    val parentId: UUID, // Este ID virá do usuário autenticado (auth.uid())
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
    val name: String,
    val birthDate: LocalDate,
    val gender: String? = null // 'character varying null' mapeia para String anulável
)