package cn.tenmg.dsl.macro;

import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * else if判断宏
 * 
 * @author 赵伟均 wjzhao@aliyun.com
 * 
 * @since 1.0.0
 */
public class ElseIf extends If {

	@Override
	Object excute(ScriptEngine scriptEngine, String code, Map<String, Object> context) throws ScriptException {
		Object ifValue = context.get("if");
		if (ifValue == null) {
			return null;
		} else {
			if (ifValue instanceof Boolean) {
				if (((Boolean) ifValue).booleanValue()) {
					return false;
				} else {
					return super.excute(scriptEngine, code, context);
				}
			}
			return null;
		}
	}

}
