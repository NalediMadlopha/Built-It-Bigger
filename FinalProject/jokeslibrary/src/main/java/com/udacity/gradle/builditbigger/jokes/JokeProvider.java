package com.udacity.gradle.builditbigger.jokes;

import java.util.Random;

public class JokeProvider {

    private static final Random random = new Random();

    private static final String[] jokes = {
            "Boy complains to his father: You told me to put a potato in my swimming trunks! You said " +
                    "it would impress the girls at the pool! But you forgot to mention one thing! \n" +
                    "\n" +
                    "Father: Really, what?\n" +
                    "\n" +
                    "Boy: That the potato should go in the front.",
            "8 p.m. I get an SMS from my girlfriend: Me or football?\n" +
                    "\n" +
                    "11 p.m. I SMS my girlfriend: You of course.",
            "Wait for me honey, I’m just finishing my make-up.\n" +
                    " \n" +
                    "You don’t need make-up, Jane.\n" +
                    " \n" +
                    "Oh, Richard…. really? That is so sweet of you! \n" +
                    " \n" +
                    "You need plastic surgery.",
            "Broccoli: Hey, I look like a tree.\n" +
                    "\n" +
                    "Mushroom: Wow, I look just like an umbrella.\n" +
                    "\n" +
                    "Walnut: I look exactly like a brain.\n" +
                    "\n" +
                    "Banana: Man, can we change the topic please?"
    };

    public static String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
