package Design_pattern.expreter;
class Variable extends Expression  
{  
       public int interpret(Context con)  
  
       {  
              //thisΪ����interpret������Variable����  
  
              return con.LookupValue(this);  
  
       }  
  
}  