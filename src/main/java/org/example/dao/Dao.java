package org.example.dao;

import org.example.model.Cities;
import org.example.model.Country;
import org.example.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
        public static List<Country> printCountry() {
            System.out.println("1  Country");
            ArrayList<Country> country = new ArrayList<>();
            String SQL = "SELECT * FROM country";
            try (Connection conn = Util.connection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(SQL)) {
                while (rs.next()) {
                    country.add(new Country(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("date"),
                            rs.getInt("city_age")));
                }
                return country;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return country;
        }
        public static List<Cities> printCities() {
            System.out.println("2  Cities");
            ArrayList<Cities> cities = new ArrayList<>();
            String SQL = "SELECT * FROM cities";
            try (Connection conn = Util.connection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(SQL)) {
                while (rs.next()) {
                    cities.add(new Cities(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("population")));
                }
                return cities;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return cities;
        }

        public static void printIdCountry(int id) throws SQLException {
            try (PreparedStatement preparedStatement = Util.connection().prepareStatement
                    ("select * from country where id=(?)")) {
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                if (rs.next()) {
                    int Id = rs.getInt("id");
                    String name = rs.getString("name");
                    String date = rs.getString("date");
                    int city_age = rs.getInt("city_age");

                    System.out.println(Id);
                    System.out.println(name);
                    System.out.println(name);
                    System.out.println(date);
                    System.out.println(city_age);
                }

            } finally {
                Util.connection().close();
            }
        }
        public static void printIdCities(int id) throws SQLException {
            try (PreparedStatement preparedStatement = Util.connection().prepareStatement
                    ("select * from cities where id=(?)")) {
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                if (rs.next()) {
                    int Id = rs.getInt("id");
                    String name = rs.getString("name");
                    String population = rs.getString("population");

                    System.out.println(Id);
                    System.out.println(name);
                    System.out.println(population);
                }

            } finally {
                Util.connection().close();
            }
        }}

