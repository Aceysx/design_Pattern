package Design_pattern.expreter;
//�ս������ʽ��ɫ  

class Constant extends Expression  

{  

     private int i ;  

     public Constant(int i)  

     {  

            this.i = i;  

     }  

     public int interpret(Context con)  

     {  

            return i ;  

     }  

}