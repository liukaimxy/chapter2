package util;

import org.apache.commons.lang3.StringUtils;

/**
 * @program: chapter2
 * @description:
 * @author: liukai
 * @create: 2018-10-09 18:49
 **/
public final class StringUtil {
    public static boolean isEmpty(String str){
        if(str != null){
            str=str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

}
