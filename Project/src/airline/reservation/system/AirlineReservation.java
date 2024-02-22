package airline.reservation.system;

public class AirlineReservation {

    public static void main(String[] args) {
        // Create a new instance of the SplashScreen class
        SplashScreen screen = new SplashScreen();
        // Set the SplashScreen to be visible
        screen.setVisible(true);

        try {
            // Loop to simulate a loading process from 0% to 100%
            for (int i = 0; i <= 100; i++) {
                // Introduce a delay of 60 milliseconds to simulate loading time
                Thread.sleep(50);
                // Set the loading value label with the current progress percentage
                screen.loadingValue.setText(i + "%");

                // Update the loading label based on specific progress values
                if (i == 10) {
                    screen.loadingLabel.setText("Turning On Modules...");
                }
                if (i == 30) {
                    screen.loadingLabel.setText("Loading Modules...");
                }
                if (i == 50) {
                    screen.loadingLabel.setText("Connecting to Database...");
                }
                if (i == 70) {
                    screen.loadingLabel.setText("Connection Successful...");
                }
                if (i == 80) {
                    screen.loadingLabel.setText("Launching Application");
                }

                // Set the value of the loading bar to reflect the current progress
                screen.loadingBar.setValue(i);
            } 
            // Close the SplashScreen once the loading process is complete
            screen.dispose();
            
            // Open the LoginGUI frame after the loading screen is closed
            LoginGUI gui = new LoginGUI();
            gui.setVisible(true);
            
        } catch (InterruptedException e) {
            // Print any exception messages to the console
            System.out.println(e.getMessage());
        } 

    }
    
}
