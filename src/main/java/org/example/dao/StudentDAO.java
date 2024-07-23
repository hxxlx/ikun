package org.example.dao;

import org.example.pojo.Student;

import java.util.List;

/**
 * @author Hx
 * @date 2024/7/22 下午3:34
 */
public interface StudentDAO {

    /** 插入一个学生信息
     * @param student 要插入的学生信息 主键无需提供
     */
    void insert(Student student);

    /** 根据主键删除一个学生信息
     * @param id 要删除的学生信息的id
     */
    void delete(Integer id);

    /** 根据学生的id修改学生的所有信息
     * @param student 要修改的学生id和需要被修改的字段值
     */
    void update(Student student);

    /** 统计表记录总数
     * @return 返回记录总数 如果为0 说明没有数据
     */
    Integer count();

    /** 根据id查找对应的学生信息
     * @param id 要获取的学生的id
     * @return 对应学生的记录 如果对应的学生记录不存在 则返回null
     */
    Student findById(Integer id);

    /** 获取所有学生信息
     * @return 所有学生对象的集合
     */
    List<Student> findAll();

    /** 根据名称模糊查询学生
     * @param name 模糊查询关键字
     * @return
     */
    List<Student> findByNameLike(String name);// 模糊查询

    /** 根据学生姓名进行模糊分页的查询
     * @param name 模糊查询关键字
     * @param start limit起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的学生数结果 若找不到 则返回null
     */
    List<Student> findByNameLikeWithLimit(String name,int start,int limit);

    /**
     * @param start limit起始参数
     * @param limit 要分页截取的行数
     * @return 返回分页查询的学生数据 若没有数据 则返回null
     */
    List<Student> findWithLimit(int start,int limit);
}
