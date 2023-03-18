import negocio.aluno.FachadaAluno;
import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoJaCadastradoException;
import negocio.interf.IFachadaAluno;

public class AplicacaoSysUnicap {

  public static void main(String[] args) {
    IFachadaAluno fachadaAluno = new FachadaAluno();
    Aluno aluno = new Aluno("Pedro", "01234");
    try{
      fachadaAluno.inserirAluno(aluno);
    } catch (AlunoJaCadastradoException e) {
      e.printStackTrace();
    }
  }

}
