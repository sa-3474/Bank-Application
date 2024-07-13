package Bank.Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import Bank.db.BankDbConnection;
import Bank.Model.Register;
import Bank.Model.Login;

public class RegisterDaoImpl implements RegisterDao {
	BankDbConnection bankdao=new BankDbConnection();

	@Override
	public int createRecord(List<Register> lst) {
		// TODO Auto-generated method stub

		Register regobj=lst.get(0);
		int i=0;
		Connection con=null;
		try {
			con=bankdao.getDbConnection();
			PreparedStatement pstate=con.prepareStatement("insert into RegisterBank values(?,?,?,?,?)");
			pstate.setInt(1,regobj.getRegNo());
			pstate.setString(2,regobj.getCustName());
			pstate.setString(3,regobj.getUserName());
			pstate.setString(4,regobj.getPassword());
			pstate.setFloat(5,regobj.getAccBalance());
			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return i;
	}

	@Override
	public List<Register> RetriveRecord(int regNo) {


		List<Register> lst=null;

		try {
			Connection conn=bankdao.getDbConnection();
			PreparedStatement pstate=conn.prepareStatement("select * from registerbank where regNo=?");
			pstate.setInt(1, regNo);
			ResultSet Result =pstate.executeQuery();
			if(Result.next()) {
				lst=new ArrayList<Register>();
				Register robj=new Register(Result.getInt(1), Result.getString(2),  Result.getString(3),  Result.getString(4), Result.getFloat(5));
				lst.add(robj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public int deleteRecord(int regNo) {
		Connection con=bankdao.getDbConnection();
		List<Register> lstreg=null;
		int i=0;
		try {
			PreparedStatement pstate=con.prepareStatement("delete from registerbank where regNo=?");
			pstate.setInt(1,regNo);
			i=pstate.executeUpdate();
			//if(i>0) {
			//	System.out.println("Record deleted");
			//}
		} 
		catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}

	@Override
	public int updateRecord(Register reg) {
		Connection con=null;
		List<Register> lstreg=null;
		//Register regobj=lstreg.get(0);
		int i = 0;
		try {
			con=BankDbConnection.getDbConnection();
			PreparedStatement pstate=con.prepareStatement("update RegisterBank set ACCBAL=? where regNo=?");
			pstate.setFloat(1, reg.getAccBalance());
			pstate.setInt(2,reg.getRegNo());
			i=pstate.executeUpdate();

		} 
		catch (SQLException e) {

			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int LoginRecord(List <Login>lst) {
		Login lobj=lst.get(0);
		int i=0;
		Connection con=null;
		try {
			con=bankdao.getDbConnection();
			PreparedStatement pstate=con.prepareStatement("insert into Login values(?,?)");
			pstate.setInt(1,lobj.getRegNo());
			pstate.setString(2,lobj.getPassword());

			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return i;
	}
	@Override
	public List<Register> list() {
		int i=0;
		Connection conn=null;
		List<Register>lst=new LinkedList<Register>();
		try {
			conn=bankdao.getDbConnection();
			String str = "select * from Bank";

			Statement state=conn.createStatement();
			ResultSet result=state.executeQuery(str);

			while(result.next())
			{
				Register reg=new Register(result.getInt(1),result.getString(2), result.getString(3), result.getString(4), result.getFloat(5));
				lst.add(reg);


			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lst;
	}

	@Override
	public List<Register> Retrive(int regno) {
		Connection con=bankdao.getDbConnection();
		List<Register> lstreg=null;

		try {
			PreparedStatement pstate=con.prepareStatement("select * from registerbank where reg_number=?");
			pstate.setInt(1, regno);
			ResultSet result=pstate.executeQuery();
			if(result.next())
			{
				lstreg=new ArrayList<Register>();
				Register regobj=new Register(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getFloat(5));
				lstreg.add(regobj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstreg;
	}

}






