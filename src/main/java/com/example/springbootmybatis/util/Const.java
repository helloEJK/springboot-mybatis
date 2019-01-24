package com.example.springbootmybatis.util;

public class Const {

    public static final int SUCCESS_CODE=200;
    public static final String SUCCESS_MSG = "获取成功";

    public static final int ExitRecord_CODE = 301;
    public static final String ExitRecord_MSG = "存在重名";

    public static final int NoRecord_NoDataFound_CODE = 302;
    public static final String NoRecord_NoDataFound_MSG = "未查询到数据";

    public static final int InvalidParameter_CODE = 401;
    public static final String InvalidParameter_MSG = "请求参数值有误";

    public static final int InvalidParameter_MissingParameter_CODE = 402;
    public static final String InvalidParameter_MissingParameter_MSG = "参数缺失";

    public static final int InternalError_DBoperationFail_CODE = 501;
    public static final String InternalError_DBoperationFail_MSG = "请求异常";
}
