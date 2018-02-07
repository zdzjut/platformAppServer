package com.boot.druid.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/*
 * API
 * （一）时间日期通用函数
 * 		1.getStringDate()  返回字符串格式(yyyy-MM-dd)的当天日期
 * 		2.getStringTime()  返回字符串格式(HH:mm:ss)的当前时间
 * 		3.getDate()		       返回日期格式的当天完整日期，包含：年月日时分秒
 *
 * （二）格式化函数
 * 		4.formatDate(Date date) 		Date类型转成String类型，返回格式yyyy-MM-dd
 * 		5.formatDateTime(Date date)		Date类型转成String类型，返回格式yyyy-MM-dd HH:mm:ss
 * 		6.formatDateTime(String date)	String类型转成Date类型，返回日期中包含：年月日时分秒数据
 * 		7.formatDate(String date)		String类型转成Date类型，返回日期中包含：年月日数据
 * 		8.formatUtf8(String s)			将字符串转换成UTF8格式
 * 		13.formatCNMoney(double money)  将数字金额转化成大写的金额
 *
 * （三）计算函数
 *		9.calBetweenDate(Date date)		计算指定日期距离当前日期的天数
 *		10.calLength(String value) 		计算字符串的字符长度，中文字符占2个字符
 *
 * （四）随机函数
 * 		11.getRandomNumber(int length)  返回指定位数的随机数字
 * 		12.getRandomCode(int length) 	返回指定位数的随机数字或字母
 *
 * （五）其它函数
 * 		14.getErrorMessage(Exception e) 返回异常内容
 * 		15.isEmpty(Object field)		对象为空，或者string对象为内容内控，则返回true,否则返回false
 */

public class CommonUtil {

    private static final SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private static final SimpleDateFormat DateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final SimpleDateFormat TimeFormat = new SimpleDateFormat("HH:mm:ss");

    private static final SimpleDateFormat YearFormat = new SimpleDateFormat("yy");

    public static final BigDecimal zero = new BigDecimal("0");

    public static final BigDecimal one = new BigDecimal("1");

    /**
     * @param type   年月日类型
     * @param length 加减时间
     * @return 返回结果
     */
    public static Date delay(int type, int length) {
        Date date = new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(type, length);//把日期往后增加length个type.整数往后推,负数往前移动
        return calendar.getTime();   //这个时间就是日期往后推一天的结果
    }


    /**
     * 将字符串用fill字符填充为固定长度length
     */
    public static String fillString(String str, int length, String fill) {
        int fillLength = length - str.length();
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < fillLength; i++) {
            strBuilder.insert(0, fill);
        }
        str = strBuilder.toString();
        return str;
    }

    public static String getYear() {
        Calendar calendar = Calendar.getInstance();
        return YearFormat.format(calendar.getTime());
    }

    /**
     * 1
     * 返回字符串格式的当天日期
     * yyyy-MM-dd
     */
    public static String getStringDate() {
        Calendar cal = Calendar.getInstance();
        return DateFormat.format(cal.getTime());
    }

    /**
     * 2
     * 返回字符串格式的当前时间
     * HH:mm:ss
     */
    public static String getStringTime() {
        Calendar cal = Calendar.getInstance();
        return TimeFormat.format(cal.getTime());
    }

    /**
     * 3
     * 返回日期格式的当天日期
     */
    public static Date getDate() {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }

    /*
     * 15
     * a.判断对象是否为空，对象为空返回true，否则返回false
     * b.如果对象是String类型，对象为空或者string没有内容则返回true,否则返回false
     */
    public static boolean isEmpty(Object field) {
        return field == null || field instanceof String && ((String) field).trim().length() == 0;
    }

    /**
     * 4
     * 返回格式化(yyyy-MM-dd)的时间
     * 传入Date类型参数
     */
    public static String formatDate(Date date) {
        return formatDate(date, "yyyy-MM-dd");
    }

    /**
     * 5
     * 返回格式化(yyyy-MM-dd HH:mm:ss)的时间
     * 传入Date类型参数
     */
    public static String formatDateTime(Date date) {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDate(Date date, String style) {
        return date == null ? "" : new SimpleDateFormat(style).format(date);
    }

    /**
     * @return 返回Date类型的的时间，包含年月日时分秒
     */
    public static Date formatDateTime(String date) {
        return getDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 7
     * 返回Date类型的的时间，包含年月日
     * 传入String类型参数 ,格式如:2015-01-01
     */
    public static Date formatDate(String date) {
        return getDate(date, "yyyy-MM-dd");
    }

    private static Date getDate(String date, String style) {
        DateFormat df = new SimpleDateFormat(style);
        try {
            return df.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String[] getDateToString(String style, String newStyle) {
        SimpleDateFormat df = new SimpleDateFormat(style);
        Date date = new Date();
        SimpleDateFormat newdf = new SimpleDateFormat(newStyle);
        String trdate = df.format(date);
        String trtime = newdf.format(date);
        String[] s = {trdate, trtime};
        return s;
    }

    /**
     * 主要应用到条件查询，如列表页起止时间查询
     * 返回Date类型的的时间，包含年月日时分秒
     * 比如传入参数：2016-01-01(java.util.Date),以及00:00:00(String)，自动补全为2016-01-01 00:00:00(java.util.Date)
     */
    public static Date getDate(Date date, String time) {
        String string = DateFormat.format(date);
        string = string + " " + time;
        try {
            return DateTimeFormat.parse(string);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 8
     * 计算字符串的长度，如果有中文，则每个中文字符计为2位
     */
    public static String formatUtf8(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0 && c <= 255) {
                sb.append(c);
            } else {
                byte[] b;
                try {
                    b = Character.toString(c).getBytes("utf-8");
                } catch (Exception ex) {
                    b = new byte[0];
                }
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) {
                        k += 256;
                    }
                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return sb.toString();
    }

    /**
     * 9
     * 计算指定日期和当日之间的天数，指定的日期要在当日之前
     */
    public static int calBetweenDate(Date date) {
        Date now = new Date();
        SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
        SimpleDateFormat sdfDay = new SimpleDateFormat("dd");
        int year, month, day;
        try {
            if (date.after(now)) {
                throw new Exception("计算日期在当前日期之后发生！");
            } else {
                year = Integer.valueOf(sdfYear.format(date));
                month = Integer.valueOf(sdfMonth.format(date)) - 1;
                day = Integer.valueOf(sdfDay.format(date));
                Calendar c1 = new GregorianCalendar();
                Calendar c2 = new GregorianCalendar(year, month, day);
                return (int) (c1.getTimeInMillis() - c2.getTimeInMillis()) / (1000 * 60 * 60 * 24);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 999999999;
        }
    }


    /**
     * 10
     * 计算字符串的长度，如果有中文，则每个中文字符计为2位
     */
    public static int calLength(String value) {
        int valueLength = 0;
        if (value == null || "".equals(value.trim())) {
            return 0;
        }
        value = value.trim();
        String chinese = "[\u0391-\uFFE5]";
        //获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1
        for (int i = 0; i < value.length(); i++) {
            // 获取一个字符
            String temp = value.substring(i, i + 1);
            // 判断是否为中文字符
            if (temp.matches(chinese)) {
                // 中文字符长度为2
                valueLength += 2;
            } else {
                // 其他字符长度为1
                valueLength += 1;
            }
        }
        //mLogger.debug("长度：" + valueLength + ",内容：" + value);
        return valueLength;
    }


    private static String getRandomCode(int length, String base) {
        Random random = new Random();
        StringBuilder randomCode = new StringBuilder();
        int size = base.length();
        for (int i = 0; i < length; i++) {
            int start = random.nextInt(size);
            String strRand = base.substring(start, start + 1);
            randomCode.append(strRand);
        }

        return randomCode.toString();
    }

    /**
     * 11
     * 获取随机数字
     */
    public static String getRandomNumber(int length) {
        String base = "0123456789";
        return getRandomCode(length, base);
    }

    /**
     * 12
     * 获取随机数字和字母组合
     */
    public static String getRandomCode(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        return getRandomCode(length, base);
    }

    /**
     * 13
     * 将阿拉伯数字金额转换成中文大写数字金额
     */
    public static String formatCNMoney(double money) {
        DecimalFormat df = new DecimalFormat("0.###");

        return formatCNMoney(df.format(money));
    }

    public static String formatCNMoney1(float money) {
        DecimalFormat df = new DecimalFormat("0.##");

        return formatCNMoney(df.format(money));
    }

    /*
     * 将阿拉伯数字金额转换成中文大写数字金额
     */
    private static String formatCNMoney(String money) {
        BigDecimal bd = new BigDecimal(money);
        BigDecimal one = new BigDecimal("1");
        bd = bd.divide(one, 2, BigDecimal.ROUND_HALF_UP);

        Map<Integer, String> numbersMap = new HashMap<>(10);
        String[] section = {"", "萬", "億", "兆"};// 拆分为四大块,精确到万亿位,即兆
        String[] numbers = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        for (int i = 0; i < numbers.length; i++) {
            numbersMap.put(i, numbers[i]);
        }
        String result = "";
        // 1.处理小数位(如果有)
        if (money.contains(".")) {
            BigDecimal hundred = new BigDecimal("100");
            int remainder = (int) (bd.multiply(hundred).longValue() % 100);// 取余
            int a = remainder / 10;
            if (a != 0) {
                result = numbersMap.get(a) + "角";
            }
            int b = remainder % 10;
            if (b != 0) {
                if (a == 0) {
                    result += numbersMap.get(0) + numbersMap.get(b) + "分";// 处理特殊情况，如2.05(贰圆零伍分)
                } else {
                    result += numbersMap.get(b) + "分";
                }
            }
        }
        // 2.处理整数位
        long total = bd.longValue();// 取整
        if (total == 0) {
            return result.equals("") ? (numbersMap.get(0) + "圆") : result;// 少于1元
        }
        int j = 0;
        StringBuilder tempResult = new StringBuilder();
        do {
            // 每次处理四位数
            long t = (total % 10000);
            String str = thousandToUpperCase((int) t,
                    numbersMap, null);
            total = total / 10000;
            if (total != 0 && t > 0 && t < 1000) {
                str = numbersMap.get(0) + str;// 如果每次处理之后还有万位且前次处理的四位取余t(0<t<1000)，则前面应补零
            }
            tempResult.insert(0, str + section[j]);
            j++;
        } while (total != 0);
        // 3.最后别忘了金额单位
        if (!money.contains(".")) {
            result = result + result.concat("整");
        }
        result = tempResult + "圆" + result;
        return result;
    }

    /*
     * 处理千位以内阿拉伯数字金额
     */
    private static String thousandToUpperCase(int number,Map<Integer, String> numbersMap, String result) {
        result = result == null ? "" : result;
        if (number < 10) {
            return number == 0 ? result : (result + numbersMap.get(number));// 取出个位
        } else if (number < 100) {
            result = result + numbersMap.get(number / 10) + "拾";// 取出十位
            return thousandToUpperCase(number % 10, numbersMap, result);
        } else if (number < 1000) {
            result = result + numbersMap.get(number / 100) + "佰";// 取出百位
            // 处理特殊情况，如201
            if (0 < number % 100 && number % 100 < 10) {
                result += numbersMap.get(0);// 加个零
            }
            return thousandToUpperCase(number % 100, numbersMap, result);
        } else if (number < 10000) {
            result = result + numbersMap.get(number / 1000) + "仟";// 取出千位
            // 处理特殊情况，如2001,2011
            if (0 < number % 1000 && number % 1000 < 100) {
                result += numbersMap.get(0);// 加个零
            }
            return thousandToUpperCase(number % 1000, numbersMap, result);
        }
        return result;
    }

    public static Date getYesterDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 获取明天日期
     */
    public static Date getTomorrow() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }

    /**
     * 14
     * 返回异常的内容
     */
    public static String getErrorMessage(Exception e) {
        String errMsg = e.getMessage();
        if (errMsg == null) {
            errMsg = "空指针错误！  " + e.getStackTrace()[0];
        }
        if (errMsg.length() > 600) {
            errMsg = errMsg.substring(0, 600);
        }
        return errMsg;
    }

    public static Date getAnotherMonth(Date date, int dayOffSet) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + dayOffSet);
        return calendar.getTime();
    }

    public static Date getAnotherDay(Date date, int dayOffSet) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + dayOffSet);
        return calendar.getTime();
    }

    public static int getDay(String strat, String end) {
        long quot = 0;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = ft.parse(strat);
            Date date2 = ft.parse(end);
            quot = date1.getTime() - date2.getTime();
            quot = quot / 1000 / 60 / 60 / 24;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int) Math.abs(quot);
    }

    public static String formatDates(Date d) {
        return formatDate(d, "[yyyy]年[MM]月[dd]日");
    }

    /**
     * 格式化数字为千分位显示；
     */
    public static String fmtMicrometer(String text) {
        DecimalFormat df;
        if (text.indexOf(".") > 0) {
            if (text.length() - text.indexOf(".") - 1 == 0) {
                df = new DecimalFormat("###,##0.");
            } else if (text.length() - text.indexOf(".") - 1 == 1) {
                df = new DecimalFormat("###,##0.0");
            } else {
                df = new DecimalFormat("###,##0.00");
            }
        } else {
            df = new DecimalFormat("###,##0");
        }
        double number = 0.0;
        try {
            number = Double.parseDouble(text);
        } catch (Exception e) {
            number = 0.0;
        }
        return df.format(number);
    }

    //double四舍五入保留两位小数
    public static String formatDouble(double d) {
        DecimalFormat df = new DecimalFormat("######0.00");
        return df.format((double) Math.round(d * 100) / 100);
    }

    //double不四舍五入保留两位小数
    public static String formatBigDecimal(BigDecimal d) {
        BigDecimal setScale = d.setScale(2, BigDecimal.ROUND_HALF_UP);
        return setScale.toString();
    }

    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 合作伙伴序列
     * 在初始值上自增1
     *
     * @return
     */
    public static String Plus(int i) {
        String s = "00000" + i;
        return s.substring(s.length() - 6);
    }

    /**
     * 合作伙伴序列
     * 在初始值上自增1
     *
     * @return
     */
    public static Integer PlusIncrement(String i) {
        Integer s = Integer.parseInt(i) + 1;
        return s;
    }
}