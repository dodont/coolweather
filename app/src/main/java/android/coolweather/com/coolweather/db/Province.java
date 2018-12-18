package android.coolweather.com.coolweather.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

import java.security.PublicKey;

/**
 * Created by Administrator on 2018/12/4.
 */

public class Province extends DataSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
