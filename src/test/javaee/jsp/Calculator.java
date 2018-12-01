package test.javaee.jsp;

public class Calculator {
    private String var1 ;
    private String operator ;
    private String var2 ;
    private String result ;

    public Calculator() {
    }

    public void run(){
        double var1 = Double.valueOf(this.var1);
        double var2 = Double.valueOf(this.var2);
        char operator = this.operator.charAt(0);
        switch (operator){
            case '+':
                this.result = String.valueOf(var1 + var2);
                break;
            case '-':
                this.result = String.valueOf(var1 - var2);
                break;
            case '*':
                this.result = String.valueOf(var1 * var2);
                break;
            case '/':
                this.result = String.valueOf(var1 / var2);
                break;
            default:
                throw new RuntimeException("未知操作符！");
        }
    }
    public String getVar1() {
        return var1;
    }

    public String getOperator() {
        return operator;
    }

    public String getVar2() {
        return var2;
    }

    public String getResult() {
        return result;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
