package com.nju.toni.supplychain.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nju.toni.supplychain.entity.Company;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.entity.Result;
import com.nju.toni.supplychain.po.CompanyPO;
import com.nju.toni.supplychain.po.ProductionPO;
import com.nju.toni.supplychain.po.ProductionVersionPO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by toni on 3/31/17.
 */
public class utils {
    public static JSONObject gerMethod(String path, String parameters) {
        URL url = null;
        try {
            url = new URL("http://localhost:5020/" + path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            conn.setRequestMethod("GET");//POST GET PUT DELETE
        } catch (ProtocolException e) {
            e.printStackTrace();
        }


        conn.setRequestProperty("Content-Type", "application/json");


        conn.setDoOutput(true);// 是否输入参数

        StringBuffer params = new StringBuffer();

        params.append(parameters);
        String output = null;
        byte[] bypes = params.toString().getBytes();
        try {
            conn.getOutputStream().write(bypes);
            conn.getOutputStream().flush();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));


            System.out.println("Output from Server:\n");
            while ((output = responseBuffer.readLine()) != null) {
                System.out.println(output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(output);
    }

    public static JSONObject postMethod(String path, String parameter) {
        try {

            URL url = new URL("http://localhost:5020/" + path);

            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");

            String input = "{\"id\":1,\"firstName\":\"Liam\",\"age\":22,\"lastName\":\"Marco\"}";

            OutputStream outputStream = httpConnection.getOutputStream();
            outputStream.write(input.getBytes());
            outputStream.flush();

            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + httpConnection.getResponseCode());
            }

            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                    (httpConnection.getInputStream())));

            String output;
            System.out.println("Output from Server:\n");
            while ((output = responseBuffer.readLine()) != null) {
                System.out.println(output);
            }

            httpConnection.disconnect();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return null;
    }

    public static void set(CompanyPO companyPO, Company company) {

    }

    public static void set(ProductionPO productionPO, Production production) {

    }

    public static long getCurrentTime() {
        return System.currentTimeMillis() / 1000;
    }

    public static ProductionPO convert(Production production) {
        return new ProductionPO();
    }

    public static Result upsdateReuslt(int count) {
        return null;
    }

    public static String newVersion() {
        return null;
    }

    public static ProductionVersionPO convert(ProductionPO productionPO) {
return null;
    }

    public static CompanyPO convert(Company company) {
    }
}




