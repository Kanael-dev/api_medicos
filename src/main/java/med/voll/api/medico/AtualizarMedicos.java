package med.voll.api.medico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEncedereco;

public record AtualizarMedicos(
        @NotNull
        Long id,
        String nome, String telefone, DadosEncedereco encedereco) {
}
