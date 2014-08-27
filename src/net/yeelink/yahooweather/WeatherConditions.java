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
		code2Condition.put(0, "¡˙æÌ∑Á");
		code2Condition.put(1, "»»¥¯∑Á±©");
		code2Condition.put(2, "Ï´∑Á");
		code2Condition.put(3, "«ø¿◊±©");
		code2Condition.put(4, "¿◊±©");
		code2Condition.put(5, "”Íº–—©");
		code2Condition.put(6, "”Í±˘±¢");
		code2Condition.put(7, "”Í—©");
		code2Condition.put(8, "∂≥”Í");
		code2Condition.put(9, "√´√´”Í");
		code2Condition.put(10, "∂≥”Í");
		code2Condition.put(11, "’Û”Í");
		code2Condition.put(12, "’Û”Í");
		code2Condition.put(13, "’Û—©");
		code2Condition.put(14, "–°’Û—©");
		code2Condition.put(15, "∏ﬂ¥µ—©");
		code2Condition.put(16, "—©");
		code2Condition.put(17, "±˘±¢");
		code2Condition.put(18, "”Íº–—©");
		code2Condition.put(19, "—Ô≥æ");
		code2Condition.put(20, "ŒÌ");
		code2Condition.put(21, "±°ŒÌ");
		code2Condition.put(22, "—Ã");
		code2Condition.put(23, "¥Û∑Á");
		code2Condition.put(24, "”–∑Á");
		code2Condition.put(25, "¿‰");
		code2Condition.put(26, "“ıÃÏ");
		code2Condition.put(27, "∂‡‘∆£®“πº‰£©");
		code2Condition.put(28, "∂‡‘∆");
		code2Condition.put(29, "«Áº‰∂‡‘∆£®“πº‰£©");
		code2Condition.put(30, "«Áº‰∂‡‘∆");
		code2Condition.put(31, "«ÁÃÏ£®ÕÌ…œ£©");
		code2Condition.put(32, "«ÁÃÏ");
		code2Condition.put(33, "«Á¿ £®“πº‰£©");
		code2Condition.put(34, "«Á¿ ");
		code2Condition.put(35, "ªÏ∫œ”Í∫Õ±˘±¢");
		code2Condition.put(36, "»»");
		code2Condition.put(37, "æ÷≤ø¿◊±©");
		code2Condition.put(38, "¡„…¢¿◊”Í");
		code2Condition.put(39, "¡„…¢¿◊”Í");
		code2Condition.put(40, "¡„–«’Û”Í");
		code2Condition.put(41, "∑÷…¢’Û—©");
		code2Condition.put(42, "¡„–«’Û—©");
		code2Condition.put(43, "¥Û—©");
		code2Condition.put(44, "«Áº‰∂‡‘∆");
		code2Condition.put(45, "¿◊’Û”Í");
		code2Condition.put(46, "’Û—©");
		code2Condition.put(47, "æ÷≤ø¿◊’Û”Í");
		code2Condition.put(3200, "‘›Œﬁ ˝æ›");
	}
	
	public String getCondition(int code){
		return code2Condition.get(code);
	}
}
