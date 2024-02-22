# Airline Reservation System

This is a Java-based Airline Reservation System with a graphical user interface implemented using Java Swing. It utilizes MySQL as the database management system for storing and managing flight information, passenger details, and reservations.

## Features

- **User Authentication:** Secure login system for both administrators and passengers.
- **Reservation Management:** Passengers can search for flights based on various criteria such as date, time, origin, and destination. They can also make reservations for available flights.
- **Ticketing:** Once a reservation is made, the system generates a unique ticket for the passenger containing all necessary information about the flight.
- **Database Integration:** Utilizes MySQL database to store and retrieve flight, passenger, and reservation information.

## Technologies Used

- **Java:** Core programming language used for backend logic and application development.
- **Java Swing:** Used for creating the graphical user interface (GUI) components.
- **MySQL:** Database management system used for storing and managing data.
- **JDBC:** Java Database Connectivity API used for connecting and interacting with the MySQL database.

## Installation

1. **Clone the Repository:** `git clone https://github.com/yourusername/airline-reservation-system.git`
2. **Import Database:** Import the provided SQL file (`database.sql`) into your MySQL database.
3. **Configure Database Connection:** Modify the database connection properties in the source code to match your MySQL server settings.
4. **Compile and Run:** Compile the Java source files and run the application.

## Usage

1. **Administrator Access:** Login with administrator credentials to manage flights, view reservations, etc.
2. **Passenger Access:** Login as a passenger to search for flights, make reservations, and view ticket details.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.
