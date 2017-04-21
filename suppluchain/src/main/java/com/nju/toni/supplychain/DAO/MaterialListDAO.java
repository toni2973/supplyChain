package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.Material;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by toni on 3/20/17.
 */
public interface MaterialListDAO {
    public void insertMaterialList(Material MaterialList);
    public void updateMaterialList(Material MaterialList);
    public void deleteMaterialList(@Param("ID") int ID);
    public Material findMaterialListByID(@Param("ID") int ID);
    public List<Material> findMaterials(@Param("productionID")long productionID) ;
}
