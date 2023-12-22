//package org.example.models;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Collection;
//
//public class CourseRepositoryImpl implements CoursesRepository{
//    @Override
//    public void add(Course item) {
//        String url = "jdbc:mysql://localhost:3306/";
//        String user = "root";
//        String password = "password";
//
//        // Подключение к базе данных
//        try(Connection connection = DriverManager.getConnection(url, user, password)){
//            String insertDataSQL = "INSERT INTO courses (title, duration) VALUES (?, ?);";
//            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
//                statement.setString(1, item.getTitle());
//                statement.setInt(2, item.getDuration());
//                statement.executeUpdate();
//            }
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void update(Course item) {
//
//    }
//
//    @Override
//    public void delete(Course item) {
//
//    }
//
//    @Override
//    public Course getById(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public Collection<Course> getAll() {
//        return null;
//    }
//}
