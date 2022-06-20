package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entity.User;
import metier.SingletonConnection;

public class UserDaoImpl implements IUserDao{

	@Override
	public User save(User u) {
		 Connection conn=SingletonConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO USERS(NOM_USER,MOT_DE_PASSE) VALUES(?,?)");
			ps.setString(1, u.getNom());
			ps.setString(2, u.getMdp());
			ps.executeUpdate();
			
			
			PreparedStatement ps2= conn.prepareStatement
					("SELECT MAX(ID_USER) as MAX_ID FROM USERS");
			ResultSet rs =ps2.executeQuery();
			if (rs.next()) {
				u.setIdUser(rs.getLong("MAX_ID"));
			}
			ps.close();
			ps2.close();
				 
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return u;
	}


	@Override
	public List<User> usersParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}
