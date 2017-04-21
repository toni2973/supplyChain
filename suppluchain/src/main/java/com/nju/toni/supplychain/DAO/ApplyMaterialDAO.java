package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.ApplyMaterial;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by toni on 3/27/17.
 */
@Repository("ApplyMaterialDAO")
public interface ApplyMaterialDAO {
    public int insertApplyMaterial(ApplyMaterial applyMaterial);
    public void updateApplyMaterial(ApplyMaterial applyMaterial);
    public void deleteApplyMaterial(@Param("ID") int ID);
    public ApplyMaterial findApplyMaterialByID(@Param("ID") int ID);
}
