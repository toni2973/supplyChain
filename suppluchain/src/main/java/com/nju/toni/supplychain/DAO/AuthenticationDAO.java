package com.nju.toni.supplychain.DAO;


import com.nju.toni.supplychain.entity.Authentication;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by toni on 3/20/17.
 */
@Repository("AuthenticationDAO")
public interface AuthenticationDAO {
    public int insertAuthentication(Authentication authentication);
    public void updateAuthentication(Authentication authentication);
    public void deleteAuthentication(@Param("ID") int ID);
    public Authentication findAuthenticationByID(@Param("ID") int ID);
    public Authentication login(@Param("username") String username,@Param("password") String password);
    public boolean isExist(@Param("username") String username);
}
