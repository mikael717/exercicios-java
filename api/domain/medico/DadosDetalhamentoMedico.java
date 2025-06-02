package med.voll.api.domain.medico;

public record DadosDetalhamentoMedico(String nome, String email, String telefone, String crm, Especialidade especialidade) {

    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade());
    }
}
