package br.usjt.arqdes16.mapeamento.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.usjt.arqdes16.mapeamento.model.Usuario;
@Repository
public class UsuarioDAO {
	Connection conn;
	@Autowired
	public UsuarioDAO(DataSource ds) throws IOException{
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
	}
	public boolean validar(Usuario usuario) throws IOException {
		String sqlSelect = "SELECT username, password FROM usuario "+
				"WHERE username = ? and password = ?";
		try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, usuario.getUsername());
			stm.setString(2, usuario.getPassword());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					return true;
				} else {
					return false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new IOException(e);
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
			throw new IOException(e1);
		}
	}

}
