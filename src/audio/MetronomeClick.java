package audio;
import javax.sound.midi.*;

/*produces metronome click based on tempo input by user*/
//do something for accents?

public class MetronomeClick {

    //TODO: pitch should accent beats appropriately
    public static void pitch()throws MidiUnavailableException, InvalidMidiDataException, InterruptedException{
        Synthesizer synth = MidiSystem.getSynthesizer();

        synth.open();
        Receiver synthRcvr = synth.getReceiver();
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON, 4, 85, 93);
        synthRcvr.send(msg, 25);
        synthRcvr.close();
    }
}
