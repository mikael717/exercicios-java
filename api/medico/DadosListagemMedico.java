package med.voll.api.medico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.Especialidade;
import med.voll.api.paciente.Paciente;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {

   public DadosListagemMedico(Medico medico){
       this(medico.getId() ,medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
   }
}
