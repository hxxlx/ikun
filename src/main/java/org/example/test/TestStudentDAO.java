

import junit.framework.Assert;
import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.junit.Before;
import org.junit.Test;

/** 用于DAO接口测试
 * @Test    将指定方法标记为测试方法 可以不依赖于main方法直接运行
 * @Befor   在所有测试方法运行前执行的代码 一般用于环境的初始化
 * @After   在使用测试方法运行后执行的代码 一般用于资源回收
 * @author Hx
 * @date 2024/7/23 上午11:02
 */
public class TestStudentDAO {
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO = new StudentDAOImpl();
    }
    @org.junit.jupiter.api.Test
    public void testFindbyid(){
        Assert.assertNotNull(studentDAO.findById(1));
//        System.out.println(studentDAO.findById(1));
    }
    @Test
    public void testCount(){
        Assert.assertEquals(7L,(long)studentDAO.count());
    }
    @Test
    public void testFIndAll(){
        Assert.assertNotNull(studentDAO.findAll());
    }
    @Test
    public void testFindByNameLike(){
        Assert.assertNotNull(studentDAO.findByNameLike("刘责"));
    }
    @Test
    public void testFindByNameLikeWithLimit(){
        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("刘责",0,2));
    }
    @Test
    public void testFindWithLimit(){
        Assert.assertNotNull(studentDAO.findWithLimit(0,2));
    }
}
