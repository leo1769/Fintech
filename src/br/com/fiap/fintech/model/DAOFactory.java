package br.com.fiap.fintech.model;
import br.com.fiap.fintech.dao.UsuarioDAO;
import br.com.fiap.fintech.dao.impl.UsuarioDAOImpl;

public class DAOFactory {

    public static UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOImpl();
    }
}