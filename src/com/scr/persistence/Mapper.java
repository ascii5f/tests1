package com.scr.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.src.pkg.EmailObject;
import com.src.pkg.IMapper;

public class Mapper implements IMapper{
	
	
	public Connection getConnection(){
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/";
        String user = "jens1";
        String password = "3r33rt09jfe8JF";
        
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void tryConnecting(){

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/";
        String user = "jens1";
        String password = "3r33rt09jfe8JF";

        try {
        	System.out.println("before con");
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
            System.out.println("after con");

        } catch (SQLException ex) {
        	System.err.println(ex.getMessage());
            //Logger lgr = Logger.getLogger(Version.class.getName());
            //lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
            	System.err.println(ex.getMessage());
                //Logger lgr = Logger.getLogger(Version.class.getName());
                //lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
	}

	@Override
	public boolean addNew(String email, boolean state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<EmailObject> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EmailObject> getByFilter(boolean filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
