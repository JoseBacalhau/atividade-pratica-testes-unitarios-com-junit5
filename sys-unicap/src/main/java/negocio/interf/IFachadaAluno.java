package negocio.interf;

import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;

public interface IFachadaAluno {

  public void inserirAluno(Aluno aluno) throws AlunoJaCadastradoException;

  public void editarAluno(Aluno aluno) throws AlunoInexistenteException;

  public void removerAluno(Aluno aluno) throws AlunoInexistenteException;

  public Aluno buscarAluno(String nomeAluno) throws AlunoInexistenteException;

}
