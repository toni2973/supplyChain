package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.Admin;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by toni on 3/20/17.
 */
@Repository(value = "AdminDAO")
public interface AdminDAO {
   public int insertAdmin(Admin admin);
   public void updateAdmin(Admin admin);
   public void deleteAdmin(@Param("ID") int ID);
   public Admin findAdminByID(@Param("ID") int ID);
   public Admin login(@Param("username") String username,@Param("password") String password);
   public Admin isExist(@Param("username") String username);
}
