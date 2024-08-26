# Thermostat Application

## Overview

This project is a Java-based thermostat application designed to provide secure and user-friendly temperature control, particularly useful in commercial settings where unauthorized access to thermostat settings can lead to energy inefficiency or discomfort. The application includes password protection and allows users to control the temperature and operating mode through an intuitive graphical user interface (GUI).

## Features

- **Password Protection:** Users are required to set a 4-digit password during initial setup. The thermostat remains locked until the correct password is entered, preventing unauthorized changes to the temperature settings.
  
- **Temperature Control:** The application allows users to adjust the temperature within a specified range (64°F to 90°F). The current temperature is displayed prominently on the interface.

- **Operating Modes:** The thermostat supports three modes—cooling, heating, and off. Each mode is visually distinguished by color changes (blue for cooling, red for heating).

- **User-Friendly Interface:** The application uses the Java Swing framework to create a simple, intuitive GUI, making it easy to navigate and operate.

## Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/Devindino/Thermostat.git
   cd Thermostat
   ```

2. **Compile and Run:**

   Ensure you have a Java Development Kit (JDK) installed.

   ```bash
   javac Thermostat.java
   java Thermostat
   ```

## Usage

1. **Setting the Password:**
   - On the initial screen, enter a 4-digit password and click "Set Password."
   - The application will then transition to a lock screen.

2. **Unlocking the Thermostat:**
   - Enter the previously set password to unlock the thermostat and access the control panel.

3. **Controlling the Temperature:**
   - Use the "+" and "-" buttons to adjust the temperature within the allowed range.

4. **Changing Modes:**
   - Select "COOL," "HEAT," or "OFF" to set the operating mode.

## Application Context

This project addresses a common issue in HVAC systems, especially in commercial settings, where unauthorized access to thermostat controls can lead to energy waste or environmental discomfort. By implementing a password-protected interface, this application ensures that only authorized personnel can modify the temperature settings.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, please contact Devin at ds2329@njit.edu
