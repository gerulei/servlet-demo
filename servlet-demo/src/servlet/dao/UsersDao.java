package servlet.dao;  
  
import java.util.List;

import servlet.entity.Users;  
  
  
public interface UsersDao {  
    public int addUser(Users u);  
    public int delUser(int id);  
    public int updateUser(Users u);  
    public Users findUserById(int id);  
    public List<Users> getAllUsers();  
}  