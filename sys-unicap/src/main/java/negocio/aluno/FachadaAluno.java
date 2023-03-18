package negocio.aluno;

import negocio.aluno.entidade.Aluno;
import negocio.interf.IFachadaAluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;

public class FachadaAluno implements IFachadaAluno {
  private ControladorAluno controladorAluno;

  public FachadaAluno(){
    this.controladorAluno = new ControladorAluno();
  }

  @Override
  public void inserirAluno(Aluno aluno) throws AlunoJaCadastradoException {
    this.controladorAluno.inserirNovoAluno(aluno);
  }

  @Override
  public void editarAluno(Aluno aluno) throws AlunoInexistenteException {

  }

  @Override
  public void removerAluno(Aluno aluno) throws AlunoInexistenteException {

  }

  @Override
  public Aluno buscarAluno(String nomeAluno) throws AlunoInexistenteException {
    return this.controladorAluno.buscarAlunoPorNome(nomeAluno);
  }
}
