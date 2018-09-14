package com.ydy.pattern.pattern_02_singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: ydy
 * Created: 2017/6/12 15:14
 * Description:
 */

public class SingletonManager {
    private static Map<String, Object> objectMap = new HashMap<String, Object>();
    private SingletonManager(){}
    public static void registerService(String key, Object instance){
        if (!objectMap.containsKey(key)){
            objectMap.put(key, instance);
        }
    }
    public static Object getService(String key){
        return objectMap.get(key);
    }
}
