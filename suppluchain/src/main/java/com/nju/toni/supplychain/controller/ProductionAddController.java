package com.nju.toni.supplychain.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by toni on 4/16/17.
 */
public class ProductionAddController {
    public static String uploadImage(HttpServletRequest request, String path_deposit, MultipartFile file, boolean isRandomName) {
        //上传
        try {
            String[] typeArray ={"gif","png","jpg"};

            if(file!=null){
                String origName=file.getOriginalFilename();// 文件原名称

                // 判断文件类型
                String[] temp=origName.split(".");
                if (temp.length>0 ) {
                    String type=temp[temp.length-1];
                    boolean booIsType=false;
                    for (int i = 0; i < typeArray.length; i++) {
                        if (typeArray[i].equals(type.toLowerCase())) {
                            booIsType=true;
                        }
                    }
                    //类型正确
                    if (booIsType) {
                        //存放图片文件的路径
                        String path=request.getSession().getServletContext().getRealPath(path_deposit);
                        //组合名称
                        String fileSrc="";
                        //是否随机名称
                        if(isRandomName){
                            origName=TimeUtils.formateString(new Date(), "yyyy-MM-dd-")+UUID.randomUUID().toString()+origName.substring(origName.lastIndexOf("."));
                        }
                        //判断是否存在目录
                        File targetFile=new File(path,origName);
                        if(!targetFile.exists()){
                            targetFile.mkdirs();//创建目录
                        }
                        //上传
                        file.transferTo(targetFile);
                        //完整路径
                        fileSrc=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+path_deposit+origName;
                        System.out.println("图片上传成功:"+fileSrc);
                        return fileSrc;
                    }
                }
            }
            return null;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @Autowired
    ProductionService productionService;
    ModelAndView getList(){
        ModelAndView modelAndView=new ModelAndView("company_production_view");
        JSONObject tags=new JSONObject();
        List<Production> productionList=productionService.getAllProductions();
        HashSet<String> tagSpec=new HashSet<>();
        HashSet<String> tagOriginCountry=new HashSet<>();
        HashSet<String> tagAssemblyCountry=new HashSet<>();
        HashSet<String> tagUnit=new HashSet<>();
        HashSet<String> tagUNSPSC=new HashSet<>();
        HashSet<String> tagValidate=new HashSet<>();
        JSONObject jProduction=new JSONObject();
        JSONArray jProductionList=new JSONArray();
        int i=0;
        for (Production p:productionList){
            tagSpec.add(p.getSpec());
            tagOriginCountry.add(p.getOriginCountry());
            tagAssemblyCountry.add(p.getOriginCountry());
            ...
            jProduction.put("name",p.getProduction_name());
            jProduction.put("ID",p.getID());
            jProduction.put("validate",p.getValidate().toString());
            jProduction.put("bar_code",p.getBarCode());
            jProduction.put("UNSPSC",p.getUNSPSC());
            jProductionList.add(i,jProduction);
            i++;
        }
        tags.put("spec",new JSONArray().addAll(tagSpec));
        ...

        modelAndView.addObject("tags",tags);
        modelAndView.addObject("productions",jProductionList);
        return modelAndView;
    }
}
