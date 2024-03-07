/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */

CREATE TABLE RoomCategories (
    CategoryID INT PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(50) NOT NULL,
    Description TEXT
);

CREATE TABLE Rooms (
    RoomID INT PRIMARY KEY AUTO_INCREMENT,
    RoomNumber INT NOT NULL,
    CategoryID INT,
    Status ENUM('Available', 'Occupied', 'Reserved') DEFAULT 'Available',
    FOREIGN KEY (CategoryID) REFERENCES RoomCategories(CategoryID)
);

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(100),
    Phone VARCHAR(20)
);

CREATE TABLE Reservations (
    ReservationID INT PRIMARY KEY AUTO_INCREMENT,
    RoomID INT,
    CustomerID INT,
    Package ENUM('Full Board', 'Half Board', 'Bed and Breakfast') NOT NULL,
    ReservationDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    CheckInDate DATETIME,
    CheckOutDate DATETIME,
    SpecialRequests TEXT,
    Amount DECIMAL(10, 2),
    Status ENUM('Active', 'Cancelled') DEFAULT 'Active',
    CancellationDate DATETIME,
    FOREIGN KEY (RoomID) REFERENCES Rooms(RoomID),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Username VARCHAR(50) NOT NULL,
    Password VARCHAR(255) NOT NULL, 
    Role ENUM('Admin', 'Staff') NOT NULL
);

