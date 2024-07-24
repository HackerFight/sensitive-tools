package com.qiuguan.sensitive.bean;

import cn.hutool.core.util.DesensitizedUtil;
import com.qiuguan.sensitive.ann.Sensitive;
import lombok.Data;

/**
 * @author fu yuan hui
 * @since 2024-07-24 23:44:02 Wednesday
 */
@Data
public class Student {

    private Long id;

    @Sensitive(DesensitizedUtil.DesensitizedType.PASSWORD)
    private String password;


    @Sensitive(DesensitizedUtil.DesensitizedType.MOBILE_PHONE)
    private String phone;
}
