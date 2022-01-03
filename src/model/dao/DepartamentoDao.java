package model.dao;

import java.util.List;

import model.entidades.Departamento;
import model.entidades.Vendedor;

public interface DepartamentoDao {
	
	void inserir(Departamento dp);
	void atualizar(Departamento dp);
	void deletarPorId(Integer id);
	Departamento encontrarPorId(Integer id);
	List<Departamento> encontrarTudo();
}
