package insper.store.recomendacao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "store-recomendacao")
public interface RecomendacaoController {

    @PostMapping("/recomendacao")
    public ResponseEntity<List<RecomendacaoOut>> create(
        @RequestBody(required = true) RecomendacaoIn in 
    );
    
    // @GetMapping("/recomendacao/{id}")
    // public ResponseEntity<RecomendacaoOut> read(
    //     @PathVariable(required = true) String id
    // );
}