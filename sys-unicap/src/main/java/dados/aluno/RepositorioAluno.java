package dados.aluno;

import dados.IRepositorioAluno;
import java.util.ArrayList;
import java.util.List;
import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;

public class RepositorioAluno implements IRepositorioAluno {
  private List<Aluno> alunos;

  public RepositorioAluno(){
    this.alunos = new ArrayList<>();
  }

  @Override
  public void inserirAluno(Aluno aluno) throws AlunoJaCadastradoException {
    if(!this.alunos.contains(aluno)){
      this.alunos.add(aluno);
    }else{
      throw new AlunoJaCadastradoException("Aluno já cadastrado!!!");
    }
  }

  @Override
  public boolean verificarExistenciaAluno(String matricula) {
    for(Aluno aluno: this.alunos){
      if(aluno.getMatricula() == matricula){
        return true;
      }
    }
    return false;
  }

  @Override
  public Aluno buscarAluno(String nomeAluno) throws AlunoInexistenteException {
    for(Aluno aluno: this.alunos){
      if(aluno.getNome() == nomeAluno){
        return aluno;
      }
    }
    throw new AlunoInexistenteException();
  }

  public int getNumberAlunos(){
    return this.alunos.size();
  }

}
