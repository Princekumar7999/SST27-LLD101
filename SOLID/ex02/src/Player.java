public class Player {
    private final FrameDecoder frameDecoder;
    private final PlayerUI playerUI;
    private final FrameCache frameCache;
    
    public Player(FrameDecoder frameDecoder, PlayerUI playerUI, FrameCache frameCache) {
        this.frameDecoder = frameDecoder;
        this.playerUI = playerUI;
        this.frameCache = frameCache;
    }
    
    public void play(byte[] fileBytes) {
        // decode
        Frame frame = frameDecoder.decode(fileBytes);
        
        // cache
        frameCache.cacheFrame(frame);
        
        // draw UI
        playerUI.displayPlayingStatus(fileBytes);
        
        // cache status
        System.out.println("Cached last frame? " + frameCache.hasCachedFrame());
    }
}