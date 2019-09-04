package adapter.impl;

import adapter.inter.AdvancedMediaPlayer;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:"+fileName);
    }
}
