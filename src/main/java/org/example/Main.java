package src.main.java.org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        int distanceBetweenWindows = 200;
        int screenWidth = 800;
        int screenHeight = 600;

        Server server = new Server();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Создание первого клиентского окна и установка его позиции слева
        Client client1 = new Client(server);
        client1.setLocation((screenSize.width / 2 - Server.WIDTH - (distanceBetweenWindows+distanceBetweenWindows/2)), (screenHeight - Server.HEIGHT) / 2);

        // Создание второго клиентского окна и установка его позиции справа
        Client client2 = new Client(server);
        client2.setLocation(2 * (Server.WIDTH + distanceBetweenWindows), (screenHeight - Server.HEIGHT) / 2);


    }
}
