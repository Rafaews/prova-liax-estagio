package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Associado;

public class AssociadoDAO {
	
	public void save(Associado associado) {

		String query = "INSERT INTO tbod_associado(cd_associado,nm_associado,dt_nascimento,dt_cadastro) VALUES(?,?,?,SYSDATE)";

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			
			conn = ConnectionFactory.createConnection();		
			stmt = conn.prepareStatement(query);
			
			stmt.setLong(1, associado.getCd_associado());
			stmt.setString(2, associado.getNm_associado());
			java.util.Date dataUtil = new java.util.Date();
			java.sql.Date dt_nascimento = new java.sql.Date(associado.getDt_nascimento().getTime());
			stmt.setDate(3, dt_nascimento);			
			
			stmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Associado associado) {

		String sql = "UPDATE tbod_associado SET ...";

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
	
			conn = ConnectionFactory.createConnection();
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, associado.getNm_associado());

			stmt.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteById(Long id) {

		String sql = "DELETE FROM tbod_associado WHERE cd_associado = ?";

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConnectionFactory.createConnection();

			stmt = conn.prepareStatement(sql);

			stmt.setLong(1, id);

			stmt.execute();

		} catch (Exception e) {			
			e.printStackTrace();
		} finally {			

			try {
				if (stmt != null) {

					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
	
	public List<Associado> getAssociados() {

		String sql = "SELECT * FROM tbod_associado";

		List<Associado> associados = new ArrayList<Associado>();

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultset = null;

		try {
			conn = ConnectionFactory.createConnection();
			stmt = conn.prepareStatement(sql);

			resultset = stmt.executeQuery();

			while (resultset.next()) {

				Associado associado = new Associado();

				associado.setCd_associado((resultset.getLong("cd_associado")));
				associado.setNm_associado((resultset.getString("nm_associado")));
				associado.setDt_cadastro(resultset.getDate("dt_cadastro"));
				associado.setDt_nascimento(resultset.getDate("dt_nascimento"));

				associados.add(associado);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultset != null) {
					resultset.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return associados;
	}

}
