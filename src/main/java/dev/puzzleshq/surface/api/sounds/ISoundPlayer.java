package dev.puzzleshq.surface.api.sounds;

import dev.puzzleshq.surface.util.ResourceLocation;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface ISoundPlayer {

    AudioFormat MP3 = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100f, 44100, 1, 144, 48000, true);

    void play(ResourceLocation location, int volume, int pitch) throws UnsupportedAudioFileException, IOException, LineUnavailableException;

}
