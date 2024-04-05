package insper.store.recomendacao;

import java.sql.Date;

import javax.print.DocFlavor.STRING;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record RecomendacaoOut (
    String motivo,
    String nome,
    String area_atuacao,
    String cnpj,
    String site,
    String modalidade,
    String cep,
    String numero_endereco,
    String perfil_instagram,
    String perfil_facebook,
    String perfil_linkedin,
    String perfil_twitter,
    String email,
    String telefone,
    String misssao,
    String visao,
    String valores
) {
    
}
