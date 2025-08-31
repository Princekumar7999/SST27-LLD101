public class Demo02 {
    public static void main(String[] args) {
        FrameDecoder frameDecoder = new FrameDecoder();
        PlayerUI playerUI = new PlayerUI();
        FrameCache frameCache = new FrameCache();
        
        Player player = new Player(frameDecoder, playerUI, frameCache);
        player.play(new byte[]{1,2,3,4});
    }
}