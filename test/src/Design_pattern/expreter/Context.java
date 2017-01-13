package Design_pattern.expreter;

import java.util.HashMap;
import java.util.Map;

//�����ģ���������ɫ��ʹ��HashMap���洢������Ӧ����ֵ  

class Context

{
	private Map valueMap = new HashMap();

	public void addValue(Variable x, int y)

	{

		Integer yi = new Integer(y);

		valueMap.put(x, yi);

	}

	public int LookupValue(Variable x)

	{
		int i = ((Integer) valueMap.get(x)).intValue();

		return i;

	}

}