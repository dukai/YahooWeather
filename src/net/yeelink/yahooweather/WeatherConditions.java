package net.yeelink.yahooweather;

import java.util.Hashtable;

public class WeatherConditions {
	private Hashtable<Object, String> code2Condition = new Hashtable<Object, String>();
	
	public WeatherConditions(){
		/*
		code2Condition.put(0, "tornado");
		code2Condition.put(1, "tropical storm");
		code2Condition.put(2, "hurricane");
		code2Condition.put(3, "severe thunderstorms");
		code2Condition.put(4, "thunderstorms");
		code2Condition.put(5, "mixed rain and snow");
		code2Condition.put(6, "mixed rain and sleet");
		code2Condition.put(7, "mixed snow and sleet");
		code2Condition.put(8, "freezing drizzle");
		code2Condition.put(9, "drizzle");
		code2Condition.put(10, "freezing rain");
		code2Condition.put(11, "showers");
		code2Condition.put(12, "showers");
		code2Condition.put(13, "snow flurries");
		code2Condition.put(14, "light snow showers");
		code2Condition.put(15, "blowing snow");
		code2Condition.put(16, "snow");
		code2Condition.put(17, "hail");
		code2Condition.put(18, "sleet");
		code2Condition.put(19, "dust");
		code2Condition.put(20, "foggy");
		code2Condition.put(21, "haze");
		code2Condition.put(22, "smoky");
		code2Condition.put(23, "blustery");
		code2Condition.put(24, "windy");
		code2Condition.put(25, "cold");
		code2Condition.put(26, "cloudy");
		code2Condition.put(27, "mostly cloudy (night)");
		code2Condition.put(28, "mostly cloudy (day)");
		code2Condition.put(29, "partly cloudy (night)");
		code2Condition.put(30, "partly cloudy (day)");
		code2Condition.put(31, "clear (night)");
		code2Condition.put(32, "sunny");
		code2Condition.put(33, "fair (night)");
		code2Condition.put(34, "fair (day)");
		code2Condition.put(35, "mixed rain and hail");
		code2Condition.put(36, "hot");
		code2Condition.put(37, "isolated thunderstorms");
		code2Condition.put(38, "scattered thunderstorms");
		code2Condition.put(39, "scattered thunderstorms");
		code2Condition.put(40, "scattered showers");
		code2Condition.put(41, "heavy snow");
		code2Condition.put(42, "scattered snow showers");
		code2Condition.put(43, "heavy snow");
		code2Condition.put(44, "partly cloudy");
		code2Condition.put(45, "thundershowers");
		code2Condition.put(46, "snow showers");
		code2Condition.put(47, "isolated thundershowers");
		code2Condition.put(3200, "not available");
		*/
		code2Condition.put(0, "龙卷风");
		code2Condition.put(1, "热带风暴");
		code2Condition.put(2, "飓风");
		code2Condition.put(3, "强雷暴");
		code2Condition.put(4, "雷暴");
		code2Condition.put(5, "雨夹雪");
		code2Condition.put(6, "雨冰雹");
		code2Condition.put(7, "雨雪");
		code2Condition.put(8, "冻雨");
		code2Condition.put(9, "毛毛雨");
		code2Condition.put(10, "冻雨");
		code2Condition.put(11, "阵雨");
		code2Condition.put(12, "阵雨");
		code2Condition.put(13, "阵雪");
		code2Condition.put(14, "小阵雪");
		code2Condition.put(15, "高吹雪");
		code2Condition.put(16, "雪");
		code2Condition.put(17, "冰雹");
		code2Condition.put(18, "雨夹雪");
		code2Condition.put(19, "扬尘");
		code2Condition.put(20, "雾");
		code2Condition.put(21, "薄雾");
		code2Condition.put(22, "烟");
		code2Condition.put(23, "大风");
		code2Condition.put(24, "有风");
		code2Condition.put(25, "冷");
		code2Condition.put(26, "阴天");
		code2Condition.put(27, "多云（夜间）");
		code2Condition.put(28, "多云");
		code2Condition.put(29, "晴间多云（夜间）");
		code2Condition.put(30, "晴间多云");
		code2Condition.put(31, "晴天（晚上）");
		code2Condition.put(32, "晴天");
		code2Condition.put(33, "晴朗（夜间）");
		code2Condition.put(34, "晴朗");
		code2Condition.put(35, "混合雨和冰雹");
		code2Condition.put(36, "热");
		code2Condition.put(37, "局部雷暴");
		code2Condition.put(38, "零散雷雨");
		code2Condition.put(39, "零散雷雨");
		code2Condition.put(40, "零星阵雨");
		code2Condition.put(41, "分散阵雪");
		code2Condition.put(42, "零星阵雪");
		code2Condition.put(43, "大雪");
		code2Condition.put(44, "晴间多云");
		code2Condition.put(45, "雷阵雨");
		code2Condition.put(46, "阵雪");
		code2Condition.put(47, "局部雷阵雨");
		code2Condition.put(3200, "暂无数据");
	}
	
	public String getCondition(int code){
		return code2Condition.get(code);
	}
}
