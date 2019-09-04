package adapter.impl;

import adapter.inter.AdvancedMediaPlayer;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
