class Phone {
    void call() {
        System.out.println("Call");
    }

    void sms() {
        System.out.println("SMS");
    }
}

interface Camera {
    void click();

    void record();
}

interface MusicPlayer {
    void play();

    void pause();

    void stop();
}

public class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void videoCall() {
        System.out.println("Video Call");
    }

    public void click() {
        System.out.println("Click");
    }

    public void record() {
        System.out.println("Record");
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();

        Phone p = s;
        p.call();
        p.sms();

        Camera c = s;
        c.click();
        c.record();

        MusicPlayer m = s;
        m.play();
        m.pause();
        m.stop();

        s.videoCall();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
    }
}
