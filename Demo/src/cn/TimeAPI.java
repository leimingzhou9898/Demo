package cn;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAPI {
	//Date   Timestamp   Long(new Date().getTime())
	public static void main(String[] args) {
		
		System.out.println("Calendar Date Timestamp Long ת��");
		//����תCalendar
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(new Date());  
        calendar.setTime(new Timestamp(System.currentTimeMillis()));
       
        
        //����תDate
        Date de1=Calendar.getInstance().getTime();
        Date de2=new Timestamp(System.currentTimeMillis());
        
        //����תTimestamp
        Timestamp tp1=new Timestamp(new Date().getTime());
        Timestamp tp2=new Timestamp(Calendar.getInstance().getTimeInMillis());
        
        
        /*y ��
        M ��
        d ��
        h ʱ ����������� (1~12)
        H ʱ ��һ���� (0~23)
        m ��
        s ��
        S ����
        a ���� / ���� ��Ƿ�*/
        
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//ʱ�����ӡ������
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd a  HH:mm:ss ");//�������ڸ�ʽ  
        System.out.println(df.format(new Date()));
        
        System.out.println("\n�ַ������ڸ�ʽ�Ƚ�");
        String date = "2017-07-17 11:03:52";
        System.out.println("compareToBefore1 : "+date.compareTo("2017-06-16 11:03:52"));
        System.out.println("compareToBefore2 : "+date.compareTo("2017-05-16 11:03:52"));
        System.out.println("compareToNow1 : "+date.compareTo("2017-07-17 11:03:52"));
        System.out.println("compareToNow2 : "+date.compareTo("2017-07-17"));
        System.out.println("compareToAfter1 : "+date.compareTo("2017-07-18 11:03:52"));
        System.out.println("compareToAfter2 : "+date.compareTo("2017-09-16 11:03:52"));
        
        System.out.println("\nDate���ͱȽ�");
        Calendar c = Calendar.getInstance();
        c.set(2016,2,2);
        Date before =c.getTime();
        c.set(2016,5,5);
        Date now=c.getTime();
        c.set(2016,6,6);
        Date after=c.getTime();
        //before����now�����ظ������������жϻ��ʼʱ���Ƿ���
        int compareToBefore=before.compareTo(now);
        System.out.println("compareToBefore = "+compareToBefore);
        int compareToIntNow=now.compareTo(now);
        System.out.println("compareToIntNow = "+compareToIntNow);
        //after����now�������������������жϻ����ʱ���Ƿ���
        int compareToIntAfter=after.compareTo(now);
        System.out.println("compareToIntAfter = "+compareToIntAfter);
        System.out.println(before.before(now));
        System.out.println(now.equals(now));
        
        System.out.println("\nTimeStamp���ͱȽ�");
        Timestamp time = new Timestamp(calendar.getTimeInMillis());
        Timestamp time2 = new Timestamp(now.getTime());
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time.compareTo(time2));
        System.out.println(time.before(time2));
        System.out.println(time.after(time2));
        
        
        System.out.println("\nStringת��Ϊjava.sql.Date");
        String str = "2013-01-14";   
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
        java.sql.Date sdate1 = null;    
        try {   
	        java.util.Date udate = sdf.parse(str);   
//	        java.sql.Date sdate2 = (java.sql.Date) sdf.parse(str); ����  
	        sdate1 = new java.sql.Date(udate.getTime());
        }catch (Exception e) {   
        	e.printStackTrace();   
    	}  
        
	}

}
