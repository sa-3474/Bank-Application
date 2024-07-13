package Bank.Dao;

import java.util.List;


import Bank.Model.Login;
import Bank.Model.Register;

public interface RegisterDao {
	
	int createRecord(List<Register> lst);
	//boolean validateUser()
	List<Register> RetriveRecord(int regNo);
	
	int deleteRecord(int regNo);
	int updateRecord(Register reg);
	//List<Login> LoginRecord(int regNo);
	int LoginRecord(List<Login> lst);
	List<Register> list();
	List<Register> Retrive(int regNo);

}
