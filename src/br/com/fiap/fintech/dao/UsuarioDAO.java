package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.model.usuario.Usuario;

import java.util.List;

public interface UsuarioDAO {
    void cadastrar(Usuario usuario);
    List<Usuario> listar();
    Usuario buscarPorId(int id);
    void atualizar(Usuario usuario);
    void remover(int id);
}