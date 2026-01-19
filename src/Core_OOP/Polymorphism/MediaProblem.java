//Problem 4: Media Player

package Core_OOP.Polymorphism;

class MediaFile {
    public void play() {
        System.out.println("Playing media");
    }
}

class AudioFile extends MediaFile {
    @Override
    public void play() {
        System.out.println("Playing audio file");
    }
}

class VideoFile extends MediaFile {
    @Override
    public void play() {
        System.out.println("Playing video file");
    }
}

public class MediaProblem {
    public static void main(String[] args) {
        MediaFile mediaFile1 = new AudioFile();
        MediaFile mediaFile2 = new VideoFile();

        mediaFile1.play();
        mediaFile2.play();
    }
}