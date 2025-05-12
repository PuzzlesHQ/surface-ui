package dev.puzzleshq.surface.api.sounds;

import dev.puzzleshq.surface.util.RawAssetLoader;
import dev.puzzleshq.surface.util.ResourceLocation;
import org.tritonus.share.sampled.mixer.TClip;

import javax.sound.sampled.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class JavaxSoundPlayer implements ISoundPlayer, LineListener {

    private boolean isDone;

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        ISoundPlayer player = new JavaxSoundPlayer();
        player.play(ResourceLocation.of("surface-ui:sounds/bone-crack.mp3"), 100, 10);
    }

    @Override
    public void play(ResourceLocation location, int volume, int pitch) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        byte[] bytes = RawAssetLoader.getClassPathAsset(location).getBytes();
//        AudioInputStream stream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(bytes));
        AudioInputStream stream = new AudioInputStream(new ByteArrayInputStream(bytes), ISoundPlayer.MP3, bytes.length);
        Clip clip = AudioSystem.getClip();
//        AudioFormat format = stream.getFormat();
        clip.addLineListener(this);
        clip.open(ISoundPlayer.MP3, bytes, 0, bytes.length);
//        Clip clip1 = new TClip(IS);
//        clip.open(stream);
        clip.start();

        while (!isDone) {}
    }

    @Override
    public void update(LineEvent event) {
        if (LineEvent.Type.START == event.getType()) {
            System.out.println("Playback started.");
        } else if (LineEvent.Type.STOP == event.getType()) {
            isDone = true;
            System.out.println("Playback completed.");
        }
    }
}
