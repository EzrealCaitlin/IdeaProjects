package com.liukang.study.tools;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;
import com.amass.framework.util.*;

public class PpUtil extends PropertyPlaceholderConfigurer{
    private static RsMap map;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties properties){
        super.processProperties(beanFactoryToProcess,properties);
        map = new RsMap();
        for(Object key : properties.keySet()){
            String keyStr = key.toString();
            Object value = properties.get(keyStr);
            map.put(keyStr, value);
        }
    }

    public static String getString(String name,String defaultValue)
    {
        String str = map.getString(name);
        return Str.IsEmpty(str) ? defaultValue : str;
    }
    public static String getString(String name)
    {
        return getString(name, null);
    }
    public static int getInt(String name,int defaultValue)
    {
        String str = getString(name, null);
        return str == null ? defaultValue : Integer.valueOf(str);
    }
    public static int getInt(String name)
    {
        return getInt(name,0);
    }
    public static long getLong(String name,long defaultValue)
    {
        String str = getString(name, null);
        return str == null ? defaultValue : Long.valueOf(str);
    }
    public static long getLong(String name)
    {
        return getLong(name,0l);
    }
}
