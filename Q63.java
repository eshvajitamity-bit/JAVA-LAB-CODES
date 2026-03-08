//Q63. Create an interface Playable with method play(). Implement this interface in two classes Guitar and Piano, each showing a different message when play() is called. Demonstrate calling play() using Playable reference

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar...");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Piano...");
    }
}

public class PlayableExample {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play(); // Output: Playing Guitar...
        piano.play();  // Output: Playing Piano...
    }
}
