package json;

import org.json.JSONException;
import org.json.JSONObject;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-6 下午9:49:41 
 * 类说明 
 */
public class JsonObjectSample {

	public void jsonObject()
	{
		//创建一个Json对象
		JSONObject liudehua = new JSONObject();
		
		//创建一个空之
		Object nullObj = null;
		
		//设置数据
		try {
			liudehua.put("name", "刘德华");
			liudehua.put("age", 50.5);
			liudehua.put("birthday","1766-12-10");
			liudehua.put("school", "北京电影学院");
			liudehua.put("major", new String[]{"演员","歌手"});
			liudehua.put("has_girlfriend", false);
			liudehua.put("car", "null");
			liudehua.put("house", "null");
			liudehua.put("comment", "这是注释部分，因为JSON里面没有注释这一说");
			
			//调用Json的toString方法打印json信息
			System.out.println("转换的Json格式如下:"+liudehua.toString());
		} catch (JSONException e) {
			//抛出运行时异常
			throw new RuntimeException("转换成Json格式失败......");
		}
	}
}
