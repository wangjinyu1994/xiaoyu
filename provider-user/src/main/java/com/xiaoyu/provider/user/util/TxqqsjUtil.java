package com.xiaoyu.provider.user.util;


import com.xiaoyu.common.base.constants.DeleteFlagEnum;
import com.xiaoyu.provider.user.entity.Xxqqsjxxb;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * WJY
 */
public class TxqqsjUtil {

    public static void main1(String[] args) throws SQLException, ClassNotFoundException {
        List<Xxqqsjxxb> list = getXxqqsjxx("f:\\0.txt");
        System.out.println("==============读取数据结束====================" + list.size());
        //String fileName = "f:\\0.txt";
        Connection connection = DbOperationUtils.getConnection();
        //将自动提交关闭
        connection.setAutoCommit(false);
        //编写sql
        String sql = "insert into txqqsjxxb(`QQHM`,`SJHM`,`SYZT`,`SCBZ`) VALUES (?,?,?,?)";
        //预编译sql
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //开始总计时
        long bTime1 = System.currentTimeMillis();
        final int[] count = {1};
        list.forEach(data->{
            //开启分段计时，计10W数据耗时
            long bTime = System.currentTimeMillis();
            //赋值
            try {
                preparedStatement.setString(1, data.getQqhm());
                preparedStatement.setString(2, data.getSjhm());
                preparedStatement.setString(3, data.getSyzt());
                preparedStatement.setString(4, data.getScbz());
                //执行sql
                preparedStatement.execute();
                count[0]++;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (count[0] == 100000){
                //提交事务
                try {
                    connection.commit();
                    count[0] = 1;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //关闭分段计时
            long eTime = System.currentTimeMillis();
            //输出
            System.out.println("成功插入10W条数据耗时："+(eTime-bTime));
        });
        //关闭总计时
        long eTime1 = System.currentTimeMillis();
        //输出
        System.out.println("插入"+list.size()+"数据共耗时："+(eTime1-bTime1));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getXxqqsjxx("f:\\0.txt");
    }

    private static List<Xxqqsjxxb> getXxqqsjxx(String path) throws SQLException, ClassNotFoundException {
        Connection connection = DbOperationUtils.getConnection();
        //将自动提交关闭
        connection.setAutoCommit(false);
        //编写sql
        String sql = "insert into txqqsjxxb(`QQHM`,`SJHM`,`SYZT`,`SCBZ`) VALUES (?,?,?,?)";
        //预编译sql
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        List<Xxqqsjxxb> list = new ArrayList<>();
        Date now = new Date();
        java.sql.Date hireDate = new java.sql.Date(now.getTime());
        //开始总计时
        long bTime1 = System.currentTimeMillis();
        final int[] count = {1};
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            // =====================总条数：100806625
       //     System.out.println("=====================总条数：" + stream.count());
           // final Xxqqsjxxb[] xxqqsjxxb = {null};
            stream.forEach(data->{
                //开启分段计时，计10W数据耗时
                long bTime = System.currentTimeMillis();
                if (data.contains("----")){
                    String[] str = data.split("----");
                    try {
                        preparedStatement.setString(1, str[0]);
                        preparedStatement.setString(2, str[1]);
                        preparedStatement.setString(3, DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
                        preparedStatement.setString(4, DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
                        //执行sql
                        preparedStatement.execute();
                        count[0]++;
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    if (count[0] == 100000){
                        //提交事务
                        try {
                            connection.commit();
                            count[0] = 1;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        //关闭分段计时
                        long eTime = System.currentTimeMillis();
                        //输出
                        System.out.println("成功插入10W条数据耗时："+(eTime-bTime));
                    }
                    /*xxqqsjxxb[0] = new Xxqqsjxxb();
                    xxqqsjxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
                    xxqqsjxxb[0].setCjsj(now);
                    xxqqsjxxb[0].setQqhm(str[0]);
                    xxqqsjxxb[0].setSjhm(str[1]);
                    xxqqsjxxb[0].setSyzt("1");
                    list.add(xxqqsjxxb[0]);*/
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        //关闭总计时
        long eTime1 = System.currentTimeMillis();
        //输出
        System.out.println("插入"+list.size()+"数据共耗时："+(eTime1-bTime1));
        return list;
    }

}
