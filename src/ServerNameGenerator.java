import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"crashing", "deafening", "echoing", "faint", "harsh", "hissing", "howling", "loud", "melodic", "noisy"};
        String[] nouns = {"garden", "menagerie", "zoo", "aquarium", "terrarium", "conservatory", "lawn", "greenhouse", "asylum", "madhouse"};

        String randomAdjective = (adjectives[new Random().nextInt(adjectives.length)]);
        String randomNouns = (nouns[new Random().nextInt(nouns.length)]);

        System.out.printf("Here is your server name:%n%s-%s", randomAdjective, randomNouns);
    }
}


