import dados.aluno.RepositorioAluno;
import negocio.aluno.ControladorAluno;
import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RepositorioAlunoTest {

  @Test
  public void myTest() {
    System.out.println("Hello World");
  }

  @Test
  void InserirAlunoTest() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "000001");
    repositorioAluno.inserirAluno(aluno);
    Assertions.assertThrows(AlunoJaCadastradoException.class, ()-> {
      repositorioAluno.inserirAluno(aluno);
    });
  }

  @Test
  void InserirAlunoNovamenteTest() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "000001");
    repositorioAluno.inserirAluno(aluno);
    Assertions.assertThrows(AlunoJaCadastradoException.class, ()-> {
      repositorioAluno.inserirAluno(aluno);
    });
  }

  @Test
  void verificarExistenciaAlunoTest() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "000001");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.verificarExistenciaAluno("000001");
    Assertions.assertTrue(repositorioAluno.verificarExistenciaAluno("000001"));
  }


  @Test
  void verificarExistenciaAluno2Test()  throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "000001");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.verificarExistenciaAluno("000001");
    Assertions.assertTrue(repositorioAluno.verificarExistenciaAluno("000000"));
  }

  @Test
  void busarAlunoTeste() throws AlunoInexistenteException, AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "000001");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.buscarAluno("aluno1");
  }

  @Test
  void busarAluno2Teste() throws AlunoInexistenteException, AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "000001");
    repositorioAluno.inserirAluno(aluno);
    Assertions.assertThrows(AlunoInexistenteException.class, ()-> {
      repositorioAluno.buscarAluno("aluno2");
    });
  }
}
