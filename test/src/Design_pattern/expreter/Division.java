package Design_pattern.expreter;

class Division extends Expression  

{  
  
       private Expression left , right ;  
  
       public Division(Expression left , Expression right)  
  
       {  
  
              this.left = left ;  
  
              this.right= right ;  
  
       }  
  
       public int interpret(Context con)  
  
       {  
  
              try{  
  
                            return left.interpret(con) / right.interpret(con);  
  
              }catch(ArithmeticException ae)  
  
              {  
  
                     System.out.println("±»³ýÊýÎª0£¡");  
  
                     return -11111;  
  
              }  
  
       }  
  
}