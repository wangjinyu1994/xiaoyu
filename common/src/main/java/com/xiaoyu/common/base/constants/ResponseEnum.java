package com.xiaoyu.common.base.constants;
/**
 * WJY
 */
public enum ResponseEnum {

    SUCCESS("200", "成功"),
    FAIL("0", "失败"),
    PARAM_EMPTY("1", "参数为空"),
    PARAM_INVALID("2", "参数不合法"),
    AUTH_CODE_EMPTY("3", "授权码为空"),
    AUTH_CODE_INVALID("4", "授权码不合法"),
    SIGN_INVALID("5", "验签失败"),
    LOGIN_TOKEN_EMPTY("6", "登录验证参数为空"),
    TOKEN_TIMEOUT("7", "登录超时"),
    SESSION_TIMEOUT("8", "session验证超时"),
    LOGIN_USER_PWD_FAILD("9", "账号或密码不正确"),
    PIC_CODE_ERROR("10", "验证码错误，请重新输入"),
    QUERY_NO_DATA("11", "查无数据"),
    DATA_NOT_IN_LIMIT("12", "数据超限"),
    NOT_DATE_RANGE("13", "不在时间范围"),

    SUB_CHECK_CONTENT_ERROR("13", "子项检查内容：{0}，格式不正确"),
    OUT_OR_SUB_VALID_ERROR("14", "大项：{0}，小项：{1}，不符合要求"),
    OUT_OR_SUB_EMPTY("15", "大项：{0}，小项：{1}，参数必填不能为空"),
    OUT_EMPTY("16", "大项：{0}，不能为空"),
    IMGS_FORMAT_ERROR("17", "检查内容中的图片附件格式或者建筑情况不正确，参考示例：{0}"),
    VALUE_NOT_IN_SCOPE("18", "大项key：{0}，小项key：{1}，检查项的值：{2}，不在预期的范围：{3}"),
    PARAM_KEY_NOT_EXIST("19", "检查内容中大项key：{0}，小项key：{1}，是必填的，没有值传空字符串也可以"),
    PARAM_KEY_NOT_EXIST2("20", "检查内容中大项key：{0}，小项key：{1}，是必填的，没有值传空数组[]也可以"),

    LOGIN_USER_NO_BELONG_UNITS("21", "登录的单位人员无所属单位数据"),
    LOGIN_USER_NO_BELONG_ORGS("22", "登录的单位人员无所属机构数据"),
    NOT_LOGIN("23", "未登录"),
    NOT_LOGIN_AUTH("24", "无登录权限"),

    PARSEEXCEL_ERROR("25", "excel文件解析失败"),
    PSUB_NODE_NOT_NULL("26", "存在下级节点"),
    DATA_REPEAT("27", "数据已存在"),
    UPDATE_HAVE_IN_HAND("28", "数据正在被修改"),
    NO_AUDIT_RECORD("29", "无审核记录"),
    UNZIP_ERROR("36", "解压文件异常，待解压文件：{0}，输出文件夹：{1}，异常信息：{2}"),
    STEP_END("37", "当前流程步骤已执行完"),
    STEP_NOT_LAST("38", "执行成功，不是最后一个人，不可以选择下一步操作人"),
    PROCESS_IMPLEMENT("39", "流程已执行，不能撤销"),
    NOT_REMOVE_ROOM("40", "考点下存在考场，不能删除"),
    DIRECTION_DISSATISFY("41", "该职业方向不满足条件"),
    NOT_LAYOUT_ASSESSOR("42", "有考场未安排考评员"),
    NOT_LAYOUT_DDY("43", "有鉴定站未安排督导员"),
    EXIT_EXAM_ROOM("44", "当前存在鉴定点已关联到该考场，请确认后再操作"),
    PASS("200", "审核通过"),

    SKIP_ACCESS_FORBIDDEN("666", "越权访问"),
    ILLEGAL_FORBIDDEN("888", "无权操作"),
    RESERVED("997", "已预约，不可重复预约"),
    NOT_AGREEMENT("998", "报考工种和预约工种不一致"),
    LAYOUT_TIME_ERROR("999", "编排时间错误"),

    PARAM_IDCARD_INVALID("2002", "身份证件号码有误"),
    PARAM_PHONE_INVALID("2003", "手机号格式有误"),
    PARAM_IDCARD_INVALID_REPEAT("2004", "身份证件号码重复或手机号码重复"),
    PARAM_PHONE_INVALID_REPEAT("2005", "手机号格式有误"),

    REQ_LIMIT("100001", "当前用户请求量大，请稍后再试"),

    LOGIN_ONLY_ONE("100002", "账号已在其他设备登录");

    private String code;
    private String msg;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
