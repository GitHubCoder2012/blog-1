package com.iszhouhua.blog.common.constant;

import java.util.Map;

/**
 * 系统配置相关变量
 * @author ZhouHua
 * @date 2018/12/30
 */
public class SysConfig {
    /**
     * 评论是否需要校检之后才显示
     */
    public static boolean COMMENT_CHECK=false;

    /**
     * 加载系统配置
     * @param configMap 包含配置的map
     */
    public static void loadConfig(Map<String,String> configMap){
        COMMENT_CHECK=Boolean.parseBoolean(configMap.get("COMMENT_CHECK"));
    }
}