package Per.Belief;

import Per.Belief.dao.UserDao;
import Per.Belief.dao.impl.UserDaoImpl;
import Per.Belief.domain.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
   public  void tese1(){
       List<User> list=new ArrayList<User>();
       UserDao us=new UserDaoImpl();
       list = us.findAll();
       System.out.println(list);
   }
}
