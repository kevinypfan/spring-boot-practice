// package com.kevinfan.demo.student;

// import java.sql.SQLException;

// import java.sql.ResultSet;
// import java.util.UUID;

// import org.springframework.jdbc.core.RowMapper;

// public class StudentRowMapper implements RowMapper<Student> {
// @Override
// public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
// String studentIdStr = resultSet.getString("student_id");
// UUID studentId = UUID.fromString(studentIdStr);
// String firstName = resultSet.getString("first_name");
// String lastName = resultSet.getString("last_name");
// String email = resultSet.getString("email");
// String genderStr = resultSet.getString("gender").toUpperCase();
// Student.Gender gender = Student.Gender.valueOf(genderStr);

// return new Student(studentId, firstName, lastName, email, gender);
// };
// }