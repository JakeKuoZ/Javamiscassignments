package Assignment6;

public class ClientException extends Exception{
        private String errMsg = " ";

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }
    }
