package insper.store.recomendacao;

import java.sql.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record RecomendacaoIn (
    String id_aluno
) {
    
}
