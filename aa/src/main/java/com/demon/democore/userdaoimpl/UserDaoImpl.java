package com.demon.democore.userdaoimpl;

import com.demon.democore.user.User;
import com.demon.democore.userdao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAllUser() {

        String sql = "select * from jnshu_user";
        final List<User> list = new ArrayList<User>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                System.out.print("1");
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                user.setBrother(resultSet.getString("brother"));
                user.getPro(resultSet.getString("pro"));
                user.setCreate_at(resultSet.getInt("create_at"));
                user.setUpdate_at(resultSet.getInt("update_at"));
                user.setSex(resultSet.getInt("sex"));
                list.add(user);
            }
        });

        return list;
    }
}
