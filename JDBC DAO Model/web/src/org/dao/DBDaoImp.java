package org.dao;
import java.sql.*;
import java.util.List;
import org.hcl.Employee;
import org.util.DBConstants;
import org.util.DBUtil;

public class DBDaoImp implements DBDao {

	@Override
	public boolean insert(Employee emp) {
		boolean isInserted=false;
		Connection con=null;
		PreparedStatement pst=null;
		try {
		con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				pst=con.prepareStatement("insert into emp(name,address,location) values (?,?,?)");
				pst.setString(1,emp.getName());
				pst.setString(2, emp.getAddress());
				pst.setString(3, emp.getLocation());
				int i=pst.executeUpdate();
				if(i>0) {
					isInserted=true;
					pst.close();
					con.close();
				}
				
			}
		}
		catch(Exception e){
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		return isInserted;
	}

	@Override
	public boolean delete(String name) {
		boolean isDeleted=false;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				pst=con.prepareStatement("delete from emp where name=?");
				pst.setString(1,name);
				int i=pst.executeUpdate();
				if(i>0) {
					isDeleted=true;
					pst.close();
					con.close();
				}
			}
		}catch(Exception e) {
			try {
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return isDeleted;
	}

	@Override
	public Employee get(String name) {
		Employee emp=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				pst=con.prepareStatement("select * from emp where name=?");
				pst.setString(1,name);
				rs=pst.executeQuery();
				rs.next();
				emp=new Employee(rs.getString(1),rs.getString(2), rs.getString(3));
				con.close();
			}
		}catch(Exception e) {
			try {
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> emp=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				st=con.createStatement();
				rs=st.executeQuery("select * from emp");
				while(rs.next()) {
				emp.add(new Employee(rs.getString(1),rs.getString(2), rs.getString(3)));
			}
				con.close();
			}
		}catch(Exception e) {
			try {
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return emp;
	}

}
