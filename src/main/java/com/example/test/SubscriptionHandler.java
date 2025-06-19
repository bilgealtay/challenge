package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubscriptionHandler {

    private static final String DB_URL = "jdbc:h2:mem:testdb"; // In-memory H2 database for example
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    public static void handleSubscription(int offerId, int customerId) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            if (offerId == 5) {
                addSubscriptions(conn, customerId, 2);
                addSubscriptions(conn, customerId, 3);
            }
            // Add subscription for the original offerId
            addSubscriptions(conn, customerId, offerId);

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exception appropriately in a real application
        }
    }

    private static void addSubscriptions(Connection conn, int customerId, int offerId) throws SQLException {
        String sql = "INSERT INTO Subscriptions (customerId, offerId) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, customerId);
            pstmt.setInt(2, offerId);
            pstmt.executeUpdate();
        }
    }

    public static void main(String[] args) {
        // Example usage
        handleSubscription(5, 123); // Customer ID 123 subscribes to offer 5 (which triggers subscriptions to 2 and 3)
    }
}