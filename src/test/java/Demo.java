import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo {
    @Test
    public void d(){
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
    }


    @Test
    public void m() throws ParseException {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        /*    添加数据
        Student stu = new Student(0,"赵六6",sdf.parse("1995-3-8 18:30:15"));
        session.save(stu);
        */

       /*    删除数据
        Student st = new Student();
        st.setId(1);
        session.delete(st);
        */
        /*        修改数据
        Student st = session.load(Student.class,2);
        st.setName("小白");
        st.setBirthday(sdf.parse("1996-07-07 15:15:15"));
        session.saveOrUpdate(st);*/

        //提交
        session.getTransaction().commit();
    }
}
