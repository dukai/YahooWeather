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
		code2Condition.put(0, "�����");
		code2Condition.put(1, "�ȴ��籩");
		code2Condition.put(2, "쫷�");
		code2Condition.put(3, "ǿ�ױ�");
		code2Condition.put(4, "�ױ�");
		code2Condition.put(5, "���ѩ");
		code2Condition.put(6, "�����");
		code2Condition.put(7, "��ѩ");
		code2Condition.put(8, "����");
		code2Condition.put(9, "ëë��");
		code2Condition.put(10, "����");
		code2Condition.put(11, "����");
		code2Condition.put(12, "����");
		code2Condition.put(13, "��ѩ");
		code2Condition.put(14, "С��ѩ");
		code2Condition.put(15, "�ߴ�ѩ");
		code2Condition.put(16, "ѩ");
		code2Condition.put(17, "����");
		code2Condition.put(18, "���ѩ");
		code2Condition.put(19, "�ﳾ");
		code2Condition.put(20, "��");
		code2Condition.put(21, "����");
		code2Condition.put(22, "��");
		code2Condition.put(23, "���");
		code2Condition.put(24, "�з�");
		code2Condition.put(25, "��");
		code2Condition.put(26, "����");
		code2Condition.put(27, "���ƣ�ҹ�䣩");
		code2Condition.put(28, "����");
		code2Condition.put(29, "�����ƣ�ҹ�䣩");
		code2Condition.put(30, "������");
		code2Condition.put(31, "���죨���ϣ�");
		code2Condition.put(32, "����");
		code2Condition.put(33, "���ʣ�ҹ�䣩");
		code2Condition.put(34, "����");
		code2Condition.put(35, "�����ͱ���");
		code2Condition.put(36, "��");
		code2Condition.put(37, "�ֲ��ױ�");
		code2Condition.put(38, "��ɢ����");
		code2Condition.put(39, "��ɢ����");
		code2Condition.put(40, "��������");
		code2Condition.put(41, "��ɢ��ѩ");
		code2Condition.put(42, "������ѩ");
		code2Condition.put(43, "��ѩ");
		code2Condition.put(44, "������");
		code2Condition.put(45, "������");
		code2Condition.put(46, "��ѩ");
		code2Condition.put(47, "�ֲ�������");
		code2Condition.put(3200, "��������");
	}
	
	public String getCondition(int code){
		return code2Condition.get(code);
	}
}
