package com.brm;

/**
 * This is the main application class.  It allows the user to run the program to send a message to a specified user.
 * 
 * Usage: java SlackNotificationDemo <bot token> <user e-mail address> <message>
 */
public class SlackNotificationDemo {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java SlackNotificationDemo <bot token> <user e-mail address> <message>");
        }
        else {
            String botToken = args[0];
            String userEmailAddress = args[1];

            String message = "";
            for (int argCounter = 2; argCounter < args.length; argCounter++) {
                message = message + args[argCounter];
                if (argCounter < args.length - 1) {
                    message = message + " ";
                }
            }

            SlackService slackService = new SlackService(botToken);
            slackService.sendNotification(userEmailAddress, message);
        }
    }
}
