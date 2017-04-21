package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.Audit;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by toni on 3/20/17.
 */
@Repository("AuditDAO")
public interface AuditDAO {
    public int insertAudit(Audit audit);
    public void updateAudit(Audit audit);
    public void deleteAudit(@Param("ID") int ID);
    public Audit findAuditByID(@Param("ID") int ID);
    public Audit login(@Param("username") String username,@Param("password") String password);
    public boolean isExist(@Param("username") String username);
}
