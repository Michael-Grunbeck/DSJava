package org.derryfield.toys;

import java.util.Random;

public class Magic8ball {
    private String[] answers = {
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy, try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    };

    private Random a;

    // This gets the random number to generate a random response
    public Magic8ball() {
        a = new Random();
    }

    //The method to get a answer from the 8ball
    public String getanswer() {
        int index = a.nextInt(answers.length);
        return answers[index];
    }
}