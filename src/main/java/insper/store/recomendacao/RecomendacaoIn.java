package insper.store.recomendacao;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record RecomendacaoIn (
    String id_aluno
) {
    
}
