package javabasico.aula46;

public interface BancoDados extends SqlDDL, SqlDML, SqlSDCL{

	void abrirConexao();
	void fecharConexao();
}
