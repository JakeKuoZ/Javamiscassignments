package Assignment6;

public enum ErrorCode {
    //下面是直接创建类 不用new 新的在别的类中
    EMAILERROR("邮箱格式错误","0001"),
    PHONEERROR("手机格式错误","0002");

    private String errName;
    private String errCode;

    ErrorCode(String errName,String errCode){
        this.errName = errName;
        this.errCode = errCode;
    }


}
