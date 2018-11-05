package cn.hayye.springboot.swagger_demo.entity;

public class AjaxResult {
    private Integer code;
    private String message;
    private Object data;
    public AjaxResult(){}
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    private AjaxResult(Builder builder){
        this.code=builder.code;
        this.data=builder.data;
        this.message=builder.message;
    }
    public static class Builder{
        private Integer code;
        private String message;
        private Object data;

        public Builder code(int val) {
            code = val;
            return this;
        }

        public Builder message(String val) {
            message = val;
            return this;
        }

        public Builder data(Object val) {
            data = val;
            return this;
        }
        public AjaxResult build(){
            return new AjaxResult(this);
        }
    }
}
