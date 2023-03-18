package dados;

import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;

public interface IRepositorioAluno {

  public void inserirAluno(Aluno aluno) throws AlunoJaCadastradoException;

  public boolean verificarExistenciaAluno(String matricula);

  public Aluno buscarAluno(String nomeAluno) throws AlunoInexistenteException;
}
